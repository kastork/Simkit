/*
 * ArrivalProcess2.java
 *
 * Created on April 25, 2002, 1:36 PM
 */

package simkit.examples;
import simkit.BasicSimEntity;
import simkit.SimEvent;
import simkit.random.RandomVariate;
/**
 * An implementation of an Arrival Process. Generates arrival events with an
 * interarrival time determined by the RandomVariate. After instantiating with
 * the desired interarrival time RandomVariate, register the entity that will
 * process the arrivals as a SimEventListener.
 * @author  Arnold Buss
 * @version $Id$
 */
public class ArrivalProcess2 extends BasicSimEntity {

/**
* The number of arrivals so far.
**/
    protected int numberArrivals;
    
/**
* The RandomVariate that generates the interarrivalTimes.
**/
    protected RandomVariate interarrivalTime;
    
/**
* Creates a new ArrivalProcess2 using the given RandomVariate to generate
* the interarrival times.
**/
    public ArrivalProcess2(RandomVariate rv) {
        super();
        setInterarrivalTime(rv);        
    }

/**
* Returns the RandomVariate used for generating the interarrival times.
**/
    public RandomVariate getInterarrivalTime() { return interarrivalTime; }
    
/**
* Sets the RandomVariate used for generating the interarrival times.
**/
    public void setInterarrivalTime(RandomVariate rv) { interarrivalTime = rv; }
    
/**
* Returns the number of arrivals generated by this ArrivalProcess2.
**/
    public int getNumberArrivals() { return numberArrivals; }
    
/**
* Resets to the original state.
**/
    public void reset() {
        super.reset();
        numberArrivals = 0;
    }
    
/**
* Schedules the Arrival event based on the time generated by the RandomVariate.
* Executed automatically when the simulation starts.
**/
    public void doRun() {
        firePropertyChange("numberArrivals", numberArrivals);
        waitDelay("Arrival", interarrivalTime.generate());
    }
    
/**
* Notifies registered listeners of the arrival, fires a property change for the
* number of arrivals, and schedules the next arrival.
**/
    public void doArrival() {
        property.firePropertyChange("numberArrivals", numberArrivals, ++numberArrivals);
        waitDelay("Arrival", interarrivalTime.generate());
    }

/**
* Does nothing.
**/
    public void processSimEvent(SimEvent event) {
    }
    
/**
* Handles either a Run or an Arrival event.
**/
    public void handleSimEvent(SimEvent event) {
        if (event.getEventName().equals("Run")) {
            doRun();
        }
        
        else if(event.getEventName().equals("Arrival")) {
            doArrival();
        }
    }
}