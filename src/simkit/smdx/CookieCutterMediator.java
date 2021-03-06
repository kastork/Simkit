package simkit.smdx;

import java.util.Map;
import java.util.LinkedHashMap;

import java.util.logging.Level;
import java.util.logging.Logger;
import simkit.SimEntityBase;

/** Mediator for CookieCutter detection. The Sensor detects the Mover
 * as soon as the Mover enters the coverage volume.
 * @author Arnold Buss
 * @version $Id$
 */
public class CookieCutterMediator extends SimEntityBase
        implements SensorTargetMediator {

    public static final String _VERSION_ = "$Id$";

    public static final Logger log = Logger.getLogger("simkit.smdx");
    
/**
* A cache of Contact objects for each Mover processed by this mediator.
**/
    protected Map<Mover, Contact> contacts;
    
    /** Creates new CookieCutterMediator */
    public CookieCutterMediator() {
        contacts = new LinkedHashMap<Mover, Contact>();
    }
    
    /**
     * This hook method must be implemented by subclasses to return a
     * {@code Contact} object for the given sensor-target pairing.  It is called
     * upon hearing an {@code enterRange} event with the same arguments.  The
     * contact returned by this method is the one that will be passed as a 
     * parameter when scheduling the detection.
     * <p>
     * This method is only called if the contact does not yet exist in this
     * mediator's Mover-Target database.
     * <p>
     * If the subclass implementation returns null, no detection is scheduled.
     * 
     * @param sensor Given Sensor
     * @param target Given Mover target
     * @return The Contact for the given sensor-target pairing.
     */
    protected Contact getContactForEnterRangeEvent(Sensor sensor, Mover target) {
        Contact contact = new SensorContact(target);
        return contact;
    }

    
    /**
     * Optional hook method that is invoked upon hearing a {@code EnterRange}
     * event.  This method is called prior to any subsequent event scheduling.
     * <p>
     * Default behavior is to do nothing.
     * 
     * @param sensor Given Sensor
     * @param target Given target Mover
     */
    protected void targetIsEnteringSensorRange(Sensor sensor, Mover target){}
    
    /** When this event is heard, schedules a Detection event for the Sensor
     * immediately using a {@code Contact} object supplied by the subclass.
     * <p>
     * Subclasses may do arbitrary processing prior to the scheduling of the
     * detection event by implementing the optional hook method {@code 
     * targetIsEnteringSensorRange()}.
     * <p>
     * The sensor is passed the {@code Contact} returned by the subclass's
     * implementation of {@code getContactForEnterRangeEvent()}.  That object
     * is a doppleganger for the actual target.  Note that the waitDelay()
     * is invoked directly on the sensor.  This makes the sensor the
     * "source" of the SimEvent, and allows listeners to the sensor to be
     * able to hear it.
     * 
     * @see #getContactForEnterRangeEvent(Sensor, Mover)
     * @param sensor The Sensor whose range was entered
     * @param target The Mover (target) that entered the sensor's range
     */    
    public final void doEnterRange(Sensor sensor, Mover target) {
        //Be sure this is for us
        if (this == SensorTargetMediatorFactory.getInstance().getMediatorFor(
                sensor.getClass(), target.getClass())) {
            if (log.isLoggable(Level.FINE)) {
                log.fine(getEventList().getSimTime() + ": Entering "
                    + "doEnterRange Sensor=" + sensor + NL
                    + " Mover (target)=" + target);
            }
        
            targetIsEnteringSensorRange(sensor, target);
            Contact contact = contacts.get(target);
            if (null == contact) {
                contact = getContactForEnterRangeEvent(sensor, target);
                contacts.put(target, contact);
            }
            sensor.waitDelay("Detection", 0.0, new Object[] { contact });
        }
    }
    
    /** When the range is exited schedules the Undetection event for the 
     * Sensor immediately.
     * Like the Detection event, the Undetection event is scheduled directly
     * on the sensor, for the same reason.
     * @param sensor The sensor whose range was exited
     * @param target The target that exited the sensor's range
     */    
    public final void doExitRange(Sensor sensor, Mover target) {
        if (this == SensorTargetMediatorFactory.getMediator(
                sensor.getClass(), target.getClass())) {
            if (log.isLoggable(Level.FINE)) {
                log.fine(getEventList().getSimTime() + ": Entering "
                    + "doExitRange Sensor=" + sensor + NL
                    + " Mover (target)=" + target);
            }
            targetIsExitingSensorRange(sensor, target);
            Object contact = contacts.get(target);
            if (contact == null) {
                String msg = getEventList().getSimTime() + ": ExitRange "
                    + "occurred when there was no contact corresponding to "
                    + "target. Sensor=" + sensor + " target=" + target
                    + NL + "This may lead to a NullPointerException later.";
                log.severe(msg);
            }
            sensor.waitDelay("Undetection", 0.0, new Object[] { contact });
        }
    }
    
   /**
     * Optional hook method that is invoked upon hearing a {@code ExitRange}
     * event.  This method is called prior to any subsequent event scheduling.
     * <p>
     * Default behavior is to do nothing.
     * 
     * @param sensor Given Sensor
     * @param target Given target Mover
     */
    protected void targetIsExitingSensorRange(Sensor sensor, Mover target){}
    /**
     * Does nothing - implements SensorTargetMediator interface
     */    
//    @Override
    public void propertyChange(java.beans.PropertyChangeEvent propertyChangeEvent) {}

/**
* Clears the list of contacts and calls super.
**/
    public void reset() {
        super.reset();
        contacts.clear();
    }
}
