/*
 * TestGeometricRV.java
 *
 * Created on March 29, 2002, 12:14 AM
 */

package simkit.test;
import simkit.random.*;
import simkit.stat.*;
import java.io.*;
import java.net.*;
/**
 *
 * @author  Arnold Buss
 * @version 
 */
public class TestGeometricRV {

    /** Creates new TestGeometricRV */
    public TestGeometricRV() {
    }

    /**
    * @param args the command line arguments
    */
    public static void main (String args[]) throws Throwable{
        int number = args.length > 0 ? Integer.parseInt(args[0]) : 100000;
        DiscreteRandomVariate rv = (DiscreteRandomVariate) RandomVariateFactory.getInstance(
            "simkit.random.GeometricVariate", new Object[] { new Double(0.3) });
        for (int i = 0; i < 5; i++) {
            System.out.println(rv.generateInt());
        }
            
        URL url = Thread.currentThread().getContextClassLoader().getSystemResource("simkit");
        File dir = new File(url.getFile()).getParentFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(new File(dir, "geom.txt")));
            
        SimpleStatsTally sst = new SimpleStatsTally();
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < number; i++) {
            int obs = rv.generateInt();
            buf.append(obs);
            buf.append(' ');
            if ((i + 1) % 20 == 0) {
                out.write(buf.toString());
                out.write(System.getProperty("line.separator"));
                buf = new StringBuffer();
                out.flush();
            }
            sst.newObservation((double)obs);
        }
        System.out.println(sst);
        out.close();
        
        double p = ((Number) rv.getParameters()[0]).doubleValue();
        double mean = mean = (1.0 - p) / p;
        double var = mean / p;
        System.out.println(mean + " " + var);
    }

}