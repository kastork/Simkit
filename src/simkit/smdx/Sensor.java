/*
 * Sensor.java
 *
 * Created on March 6, 2002, 6:26 PM
 */

package simkit.smdx;
import java.awt.*;
import simkit.*;
/**
 *
 * @author  Arnold Buss
 * @version 
 */
public interface Sensor extends Moveable, SimEntity {
    
    public double getMaxRange();
    
    public Shape getFootprint();
    
    public Mover getMover();
    
    public void setMover(Mover mover);

    public void doDetection(Moveable contact);
    
    public void doUndetection(Moveable contact);
    
    public void doStartMove(Sensor sensor);
    
    public void doEndMove(Sensor sensor);
    
}

