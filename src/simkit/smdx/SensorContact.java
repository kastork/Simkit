package simkit.smdx;

import java.awt.geom.Point2D;
import java.text.DecimalFormat;

/**
 *
 * @author Kirk Stork (The MOVES Institute)
 */
public class SensorContact implements Contact {

    /**
     * The format for numbers output by this Object.
*
     */
    protected DecimalFormat form;

    /**
     * The Moveable that this Contact contains information about.
     */
    protected Moveable mover;

    /**
     * Creates a new instance of Contact with information about the given
     * Moveable.
     *
     * @param mover given Moveable
     */
    public SensorContact(Moveable mover) {
        this.mover = mover;
        form = new DecimalFormat("0.000;-0.000");
    }

    /**
     * Returns the acceleration vector for the underlying Moveable.
     *
     * @return Acceleration for Mover - passthrough
     */
    public Point2D getAcceleration() {
        return mover.getAcceleration();
    }

    /**
     * Returns the location of the underlying Moveable.
     *
     * @return Location for Mover - passthrough
     */
    public Point2D getLocation() {
        return mover.getLocation();
    }

    /**
     * Returns the velocity vector for the underlying Moveable.
     *
     * @return Velocity for Mover - passthrough
     */
    public Point2D getVelocity() {
        return mover.getVelocity();
    }

    /**
     * Returns a String containing the location of the underlying Moveable.
     *
     * @return String description of Mover information
     */
    public String toString() {
        Point2D loc = mover.getLocation();
        return "Contact: [" + form.format(loc.getX())
                + ", " + form.format(loc.getY()) + "]";
    }

}
