/*
 * Mover.java
 *
 * Created on March 6, 2002, 6:05 PM
 */

package simkit.smdx;
import java.awt.geom.Point2D;

import simkit.PropertyChangeSource;
import simkit.SimEntity;

/**
 * A SimEntity whose movement can be controlled and that can interact
 * with Sensors.
 * @see Sensor
 * @see MoverManager
 * @author  Arnold Buss
 * @version $Id$
 */
public interface Mover extends Moveable, SimEntity, PropertyChangeSource {

/**
* Event that signals the start of a move to a previously set destination.
* Should set the MovementState to "CRUISING." Movers should not
* normally respond to other entities StartMove events.
**/
    public void doStartMove(Moveable mover);
    
/**
* Event that signals that this Mover has reached its desired location.
* Should set the MovementState to "PAUSED." Movers should not
* normally respond to other entities EndMove events.
**/
    public void doEndMove(Moveable mover);
    
/**
* Causes this Mover to move to the given destination at 
* its maximum speed. Normally schedules the StartMove event after
* setting the destination.
**/
    public void moveTo(Point2D destination);
    
/**
* Causes this Mover to move to the given destination at the 
* given speed. Normally schedules the StartMove event.
**/
    public void moveTo(Point2D destination, double cruisingSpeed);
    
/**
* Move with the given velocity.
**/
    public void move(Point2D velocity);
    
/**
* Instantly move to the given location.
* @throws MagicMoveException If this Mover is not allowed to magic move.
**/
    public void magicMove(Point2D location) throws MagicMoveException;
    
/**
* Accelerate with the given acceleration vector.
**/
    public void accelerate(Point2D acceleration);
    
/**
* Accelerate in the direction of the given acceleration vector
* to the given speed.
**/
    public void accelerate(Point2D acceleration, double speed);
    
/**
* Stops at the current location. Should set the MovementState to "STOPPED"
**/
    public void stop();
    
/**
* Pause at the current location. Should set the MovementState to "PAUSED"
**/
    public void pause();
    
/**
* Returns information about the Mover.
**/
    public String paramString();
    
/**
* Returns true if the Mover is currently moving.
**/
    public boolean isMoving();
    
/**
* Returns the current MovementState of this Mover.
**/
    public MovementState getMovementState();
    
/**
* The speed that this Mover should never exceed.
**/
    public double getMaxSpeed();

    /**
     * Added to support zero argument constructors and the ObjectMaker system.
     * @param max
     */
    public void setMaxSpeed(double max) throws MagicMoveException;
    /**
     * Added to support zero argument constructors and the ObjectMaker system.
     * @param location
     */
    public void setLocation(Point2D location) throws MagicMoveException;
}

