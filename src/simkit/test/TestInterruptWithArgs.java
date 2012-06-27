package simkit.test;

import simkit.Schedule;
import simkit.SimEntityBase;

/**
 * @version $Id$
 * @author ahbuss
 */
public class TestInterruptWithArgs extends SimEntityBase {
    
    public void doRun() {
        for (int i = 0; i < 5; ++i) {
            waitDelay("Foo", i + 1, i);
            waitDelay("Bar", i + 1, i);
        }
        waitDelay("Interrupt", 0.5, 3);
        waitDelay("Interrupt", 1.5, "Bar", 2);
    }
    
    public void doInterrupt(int i) {
        this.interruptAllWithArgs(new Integer(i));
    }
    
    public void doInterrupt(String eventName, int i) {
        interruptAllWithArgs(eventName, new Integer(i));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestInterruptWithArgs tiwa = new TestInterruptWithArgs();
        
        Schedule.setVerbose(true);
        
        Schedule.reset();
        Schedule.startSimulation();
    }
}
