package simkit.examples;

import simkit.Entity;
import simkit.SimEntityBase;

/**
 * An adapter class that listens for an Arrival (with no parameters) event and
 * schedules an Arrival event with a new Customer as its parameter. The
 * EntityCreator must be registered as a SimEventListener with the entity
 * scheduling the arrival events (for instance {@link ArrivalProcess2})
 *
 * @author Arnold Buss
 */
public class EntityCreator extends SimEntityBase {

    /**
     * Schedules an Arrival event with a new Customer as its parameter at the
     * current simulation time.
     */
    public void doArrival() {
        waitDelay("Arrival", 0.0, new Entity("Customer"));
    }

}
