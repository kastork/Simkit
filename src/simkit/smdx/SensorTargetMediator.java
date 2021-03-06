/*
 * SensorTargetMediator.java
 *
 * Created on March 6, 2002, 6:29 PM
 */
package simkit.smdx;

import java.beans.PropertyChangeListener;

/**
 * Mediates interactions between Sensors and Movers.
 *
 * @author Arnold Buss
 * @version $Id$
 */
public interface SensorTargetMediator extends Mediator, PropertyChangeListener {

    /**
     * When this event is heard, schedules a Detection event for the Sensor
     * based on the detection algorithm of the implementing class. The Detection
     * event should be scheduled with the Sensor as the source of the SimEvent
     * so that entities listening to the Sensor are notified that a detection
     * has taken place.
     *
     * @param sensor Given Sensor
     * @param target Given target Mover
     */
    public void doEnterRange(Sensor sensor, Mover target);

    /**
     * When this event is heard, schedules an Undetection event for the Sensor
     * based on the detection algorithm of the implementing class. The
     * Undetection event should be scheduled with the Sensor as the source of
     * the SimEvent so that entities listening to the Sensor are notified that
     * an "undetection" has taken place.
     * 
     * @param sensor Given Sensor
     * @param target Given target Mover
     */
    public void doExitRange(Sensor sensor, Mover target);

}
