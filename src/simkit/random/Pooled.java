package simkit.random;

/**
 * A RandomNumber that is generated by combining the outputs of two
 * other RandomNumbers.
 *
 * @author  Arnold Buss
 * @version $Id$
 */
public interface Pooled extends RandomNumber {
    
/**
* Sets the instance of the first RandomNumber that this Pooled is based on.
**/
    public void setFirst(RandomNumber first);
    
/**
* Returns the instance of the first RandomNumber that this Pooled is based on.
**/
    public RandomNumber getFirst();
    
/**
* Sets the instance of the second RandomNumber that this Pooled is based on.
**/
    public void setSecond(RandomNumber first);
    
/**
* Returns the instance of the second RandomNumber that this Pooled is based on.
**/
    public RandomNumber getSecond();
    
}
