package simkit.smd;

import java.awt.Shape;
import java.awt.geom.Point2D;

import simkit.SimEntity;

/**
 * A Munition is an entity can interact with a Target. The effect of the
 * interaction is determined by a {@link MunitionTargetReferee} and a
 * {@link Adjudicator}.
 *
 * @author Arnold Buss
 * @version $Id$
 */
public interface Munition extends Mover, SimEntity {

    /**
     *
     * @return The point of impact for this Munition.
     */
    public Point2D getAimPoint();

    /**
     *
     * @return The radius of the area around the impact point that is affected
     * by this Munition.
     */
    public double getImpactRange();

    /**
     *
     * @return The area that is affected by the impact of this Munition.
     */
    public Shape getImpact();

    /**
     *
     * @return True if this Munition has been fired
     */
    public boolean isExpended();

    /**
     * An Event that occurs when this Munition reaches its impact point. The
     * effect of this event is determined by a MunitionTargetReferee, which will
     * normally be a SimEventListener of this Munition.
     *
     * @param munition This munition
     */
    public void doImpact(Munition munition);

    /**
     * 
     * @param aimPoint The point of impact for this Munition.
     */
    public void setAimPoint(Point2D aimPoint);
}
