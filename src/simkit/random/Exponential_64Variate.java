package simkit.random;

import simkit.util.Math64;

/** Generates Exponential random variate using log transform.
 * <P>Uses simkit.util.Math64.log() function for replicability on 64-bit
 * platforms.
 *
 * @author Arnold Buss
 * @version $Id$
 */
public class Exponential_64Variate extends RandomVariateBase implements RandomVariate {
    
/**
* The mean of this Exponential Variate.
**/
    private double mean;
    
/**
* Creates a new ExponentialVariate with a zero mean. 
**/
    public Exponential_64Variate() {
    }
    
//Javadoc Inherited
    public double generate() {
        return - mean * Math64.log(rng.draw());
    }
    
    /** 
     * Sets the mean of this Exponential Variate. 
     * Note that the value is the mean rather than the rate.
     * @param params mean as single element of array.
     * @throws IllegalArgumentException If the array is not a single element,
     * if the element is not a Number, or if the mean is not positive.
     */    
    public void setParameters(Object... params) {
        if (params.length != 1) {
            throw new IllegalArgumentException("Should be only one parameter for Exponential: " +
            params.length + " passed.");
        }
        if (params[0] instanceof Number) {
                setMean(((Number) params[0]).doubleValue());
        }
        else {
            throw new IllegalArgumentException("Parameters must be a Number");
        }
    }
    
/**
* Returns the mean of this exponential variate in a single element array.
**/
    public Object[] getParameters() { return new Object[] { new Double(mean) }; }
    
    /**
     * Note that the value is the mean rather than the rate.
     * @param mean the desired mean.
     * @throws IllegalArgumentException If the given mean is not positive.
     */
    public void setMean(double mean) { 
        if (mean > 0.0) {
            this.mean = mean;
        }
        else {
            throw new IllegalArgumentException("Exponential mean must be positive: " + mean);
        }
    }
    
    /**
     * 
     * @return the mean of this exponential variate.
     */
    public double getMean() { return this.mean; }
    
    public String toString() { return "Exponential_64 (" + mean + ")"; }
}
