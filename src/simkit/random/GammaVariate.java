package simkit.random;

/** Generates Gamma(alpha, beta) random variates using
 * Acceptance/Rejection method
 * Parameterized as in Law and Kelton, so that mean = &alpha;&beta;
 * and variance = &alpha;&beta;<sup>2</sup> and density:<br>
 * <i>f(x) = &beta;<sup>&alpha;</sup>x<sup>-(&alpha;+1)</sup>e<sup>-&beta;x</sup>/&Gamma;(&alpha;), x > 0</i>
 * (0, otherwise)
 * @author Arnold Buss
 * @version $Id$
 */
public class GammaVariate extends RandomVariateBase {

/**
* The Alpha parameter for this GammaVariate.
**/
    private double alpha;

/**
* The Beta parameter for this GammaVariate.
**/
    private double beta;

/**
* Holds a precalculated value.
**/
    private double b;

/**
* Holds a precalculated value.
**/
    private double p;

/**
* Holds a precalculated value.
**/
    private double a;

/**
* Holds a precalculated value.
**/
    private double q;

/**
* Holds a precalculated value.
**/
    private double theta;

/**
* Holds a precalculated value.
**/
    private double d;

/**
* Holds a precalculated value.
**/
    private double z;

/**
* Holds a precalculated value.
**/
    private double u1;

/**
* Holds a precalculated value.
**/
    private double v;

/**
* Holds a precalculated value.
**/
    private double w;

/**
* Holds a precalculated value.
**/
    private double alphaInv;

/**
* Instantiates a new GammaVariate. Alpha and Beta must be set prior to use.
**/
    public GammaVariate() {
    }

    /** 
     * Sets alpha and beta for this GammaVariate.
     * @param params elements are (&alpha;, &beta;)
     * @throws IllegalArgumentException If the given array does not contain exactly two
     * Numbers or if either of the parameters is not positive.
     */    
    public void setParameters(Object[] params) {
        if (params.length != 2) {
            throw new IllegalArgumentException("Must have 2 parameters for GammaVariate");
        }
        else if (params[0] instanceof Number && params[1] instanceof Number) {
             this.setAlpha(((Number) params[0]).doubleValue());
            
             this.setBeta(((Number) params[1]).doubleValue());
            this.setConvenienceParameters();
        }
        else {
            throw new IllegalArgumentException("Parameters for GammaVariate must be of type Number");
        }
    }
    
    /**
     * Returns a two element array containing the alpha and beta.
     * @return (&alpha;, &beta;) as elements
     */    
    public Object[] getParameters() { return new Object[] { new Double(alpha), new Double(beta) }; }
    
/**
* Sets the value of Beta. Causes pre-calculated values to be updated.
* @throws IllegalArgumentExcption If beta is not positive.
**/
    public void setbeta(double beta) {
        if (beta <= 0.0) {
            throw new IllegalArgumentException("Parameter beta must be positive");
        }
        else {
            this.beta = beta;
            setConvenienceParameters();
        }
    }

//Javadoc inherited
    public double generate() {
        double y = 0.0;
        if (alpha < 1.0) {
            while ( true ) {
                p = b * rng.draw();
                if ( p <= 1) {
                    y = Math.pow(p, alphaInv);
                    if ( rng.draw() <= Math.exp(-y) ) {
                        break;
                    }
                } else {
                    y = - Math.log( (b - p)/alpha);
                    if (rng.draw() <= Math.pow( y, alpha - 1.0) ) {
                        break;
                    }
                }
            }
        } else {
            while (true) {
                u1 = rng.draw();
                v = a * Math.log( u1 / (1.0 - u1) );
                y = alpha * Math.exp(v);
                z = u1 * u1 * rng.draw();
                w = b + q * v - y;
                if (w + d - theta * z >= 0) {
                    break;
                } else {
                    if (w >= Math.log(z) ) {
                        break ;
                    }
                }
            }
        }
        return y * beta;
    }


/**
* Pre-calculates values that only depend on alpha and beta.
**/
    protected void setConvenienceParameters() {
        alpha = getAlpha();
        beta = getBeta();
        if (alpha < 1.0) {
        b = 1.0 + alpha / Math.E;
        alphaInv = 1.0 / alpha;
        }
        else {
        a = 1.0 / Math.sqrt(2.0 * alpha - 1.0);
        b = alpha - 1.38629436111989061883;    // Number is Math.log(4)
        q = alpha + 1.0 / a;
        theta = 4.5;
        d = 2.504077396776274;        // Math.log(1 + theta)
        }
    }

/**
* Sets the value of Alpha. Warning: Does not undate the pre-calculated values.
* @throws IllegalArgumentExcption If alpha is not positive.
**/
    public void setAlpha(double a) {
        if ( a > 0.0) {
            alpha = a;
        }
        else {
            throw new IllegalArgumentException("Alpha parameter must be > 0.0: " + a);
        }
    }

/**
* Sets the value of Beta. Warning: Does not update the pre-caluculated values
* use setbeta to cause recalculation to occurs.
* @throws IllegalArgumentExcption If beta is not positive.
**/
    public void setBeta(double b) {
        if ( b > 0.0) {
            beta = b;
        }
        else {
            throw new IllegalArgumentException("Beta parameter must be > 0.0: " + b);
        }
    }

/**
* Returns the current value of Alpha.
**/
    public double getAlpha() {return alpha;}

/**
* Returns the current value of Beta.
**/
    public double getBeta() {return beta;}

/**
* Returns the name and parameters of this RandomVariate.
**/
    public String toString() { return "Gamma (" + getAlpha() + ", " + getBeta() + ")"; }
}
