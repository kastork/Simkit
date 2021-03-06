package simkit.random;

/**
 * 
 * <p>
 * Generates random variates having an arbitrary discrete distribution with
 * integer values. The input is given by a set of values and a set of either
 * frequencies or frequencies.
 *
 * <p>
 * The parameters should have signature (int[], double[]), where the int[] array
 * contains the possible values and the double[] array contains the frequencies,
 * which may or may not sum to 1, but which must at least be non-negative. These
 * are normalized to be a cdf inside the class.
 *
 * @version $Id$
 * @author ahbuss
 */
public class DiscreteIntegerVariate extends RandomVariateBase
        implements DiscreteRandomVariate {

    private int[] values;

    private double[] frequencies;

    private double[] cdf;

    /**
     * Creates a new instance of DiscreteIntegerVariate
     */
    public DiscreteIntegerVariate() {
    }

    public double generate() {
        return (double) generateInt();
    }

    /**
     * Sets the cdf for this DiscreteRandomVariate. First argument is an array
     * of doubles that define where the cdf changes. The second argument is an
     * array of doubles that specify either frequencies or frequencies at the
     * points given.
     *
     * If (values, frequencies) are given, then the frequencies are normalized
     * to sum to 1.
     *
     * @param params (values, prob) as (double[], double[])
     * @throws IllegalArgumentException If the given array does not have 2
     * elements, if the elements are not arrays of doubles, or if the two double
     * arrays are not the same length.
     * @throws IllegalArgumentException If any of the frequencies/frequencies
     * are negative or they're sums are zero.
     */
    @Override
    public void setParameters(Object... params) {
        if (params.length != 2) {
            throw new IllegalArgumentException(
                    "2 Arguments needed: " + params.length);
        }
        if (!(params[0] instanceof int[] && params[1] instanceof double[])) {
            throw new IllegalArgumentException(
                    "Parameters muct be {int[], double[]}: {"
                    + params[0].getClass().getName() + ", "
                    + params[1].getClass().getName() + "}");
        }
        int[] val = (int[]) params[0];
        double[] freq = (double[]) params[1];
        if (freq.length != val.length) {
            throw new IllegalArgumentException(
                    "Values and frequency parameters not same length: "
                    + val.length + " != " + freq.length);
        }
        this.setValues(val);
        this.setFrequencies(freq);
    }

    @Override
    public Object[] getParameters() {
        return new Object[]{getValues(), getFrequencies()};
    }

    @Override
    public int generateInt() {
        int index;
        double uniform = this.rng.draw();
        for (index = 0; (uniform > cdf[index]) && (index < cdf.length - 1); index++) ;
        return values[index];
    }

    /**
     * Convert the given array of frequencies/frequencies to a cdf.
     *
     * @throws IllegalArgumentException If any of the frequencies/frequencies
     * are negative or they sum to zero.
     */
    private void toCDF() {
        this.normalize();
        cdf = new double[frequencies.length];
        cdf[0] = frequencies[0];
        for (int i = 1; i < frequencies.length; i++) {
                cdf[i] += cdf[i - 1] + frequencies[i];
        }
    }

    private void normalize() {
        double sum = 0.0;
        for (int i = 0; i < frequencies.length; ++i) {
            if (frequencies[i] < 0.0) {
                throw new IllegalArgumentException(
                        String.format("Bad frequency value at index %d (value = %.3f)", i, frequencies[i]));
            }
            sum += frequencies[i];
        }
        if (sum > 0.0) {
            for (int i = 0; i < frequencies.length; ++i) {
                frequencies[i] /= sum;
            }
        } else {
            throw new IllegalArgumentException(
                    String.format("Frequency sum not positive: %.3f", sum));
        }
    }

    public int[] getValues() {
        return values.clone();
    }

    public void setValues(int[] value) {
        this.values = (int[]) value.clone();
    }

    public double[] getCdf() {
        return cdf.clone();
    }

    /**
     * Returns a String containing a table representation of the pdf and cdf.
     *
     */
    @Override
    public String toString() {
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
        StringBuilder buf = new StringBuilder("Discrete Integer");
        buf.append("\nx    \tf(x)   \tF(x)\n");
        for (int i = 0; i < cdf.length; i++) {
            buf.append(values[i]);
            buf.append('\t');
            buf.append(df.format(i == 0 ? cdf[i] : cdf[i] - cdf[i - 1]));
            buf.append('\t');
            buf.append(df.format(cdf[i]));
            buf.append('\n');
        }
        return buf.toString();
    }

    public double[] getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(double[] frequencies) {
        this.frequencies = frequencies;
        this.normalize();
        this.toCDF();
    }
}
