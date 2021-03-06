/*
 * TestAffineTransform.java
 *
 * Created on March 28, 2002, 11:02 PM
 */

package simkit.test;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
/**
 *
 * @author  Arnold Buss
 * @version $Id$
 */
public class TestAffineTransform {

    /** Creates new TestAffineTransform */
    public TestAffineTransform() {
    }

    /**
    * @param args the command line arguments
    */
    public static void main (String args[]) {
        Rectangle2D rect = new Rectangle2D.Double(0.0, 0.0, 30.0, 40.0);
        AffineTransform trans = AffineTransform.getTranslateInstance(25, 35);
        Shape shape = trans.createTransformedShape(rect);
        System.out.println(rect + " [" + rect.getClass().getName() +"]");
        System.out.println(trans + " [" + trans.getClass().getName() +"]");
        System.out.println(shape + " [" + trans.getClass().getName() +"]");
    }

}
