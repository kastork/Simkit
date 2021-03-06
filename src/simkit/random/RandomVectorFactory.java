package simkit.random;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/**
 * Factory for creating <CODE>RandomVector</CODE> instances from "orders".
 * The "specifications" of each order are as generic as possible:
 * String (name of class), Object[] (parameters), long (seed),
 * RandomNumber (instance of supporting Un(0,1) generator).
 * <P>The default supporting RandomNumber is determined by the implementation
 * of the RandomVector. In most cases it is <CODE>Congruential</CODE>.
 * @author Arnold Buss
 * @version $Id$
 */
public class RandomVectorFactory {
    
    /**
     * Holds a cache of the RandomVector Classes that have already been
     * found indexed by their name.
     **/
    protected static Map<String, Class> cache;
    
    /**
     * A list of packages to search for RandomVector if the
     * class name given is not fully qualified.
     **/
    protected static Set<String> searchPackages;
    
    /**
     * If true, print out information while searching for RandomVector
     * Classes.
     **/
    protected static boolean verbose;
    
    /**
     * 
     * @param b true, if printing out information while searching for 
     * RandomVector Classes.
     */
    public static void setVerbose(boolean b) { 
        verbose = b; 
    }
    /**
     * 
     * @return true, if printing out information while searching for 
     * RandomVector Classes.
     */
    public static boolean isVerbose() { return verbose; }
    
    /**
     * 
     * @return shallow copy of cache
     */
    public static Map<String, Class> getCache() { 
        return new WeakHashMap<String, Class>(cache); 
    }
    
    static {
        searchPackages = new LinkedHashSet<String>();
        searchPackages.add("simkit.random");
        cache = new WeakHashMap<String, Class>();
    }
    
    /**
     * This factory Class should never by instantiated.
     **/
    protected RandomVectorFactory() {
    }
    
    /**
     * Creates a <CODE>RandomVector</CODE> instance with default seed(s) and
     * the default supporting <CODE>RandomNumber</CODE>.
     * @param className The fully-qualified class name of the desired instance
     * @param parameters The desired parameters for the instance
     * @return Instance of <CODE>RandomVector</CODE> based on the
     * (fully-qualified) class name and the parameters.  The default
     * <CODE>RandomNumber</CODE> instance is used with the default seed(s).
     * @throws IllegalArgumentException If the className is <CODE>null</CODE> or
     * a class with that name cannot be found.
     */
    public static RandomVector getInstance(String className, Object... parameters) {
        if (className == null) {
            throw new IllegalArgumentException("null class name");
        }
        // First check cache
        Class randomVectorClass = cache.get(className);
        if (randomVectorClass == null) {
            randomVectorClass = findFullyQualifiedNameFor(className);
            if (randomVectorClass == null) {
                // The name may be the distribution - try appending "Vector"
                randomVectorClass = findFullyQualifiedNameFor(className + "Vector");
            }
            // All attempts have failed
            if (randomVectorClass == null) {
                throw new IllegalArgumentException("RandomVector class not found for " + className);
            }
            else {
                cache.put(className, randomVectorClass);
            }
        }
        return getInstance(randomVectorClass, parameters);
    }
    
    /**
     * Creates a <CODE>RandomVector</CODE> instance with
     * the default supporting <CODE>RandomNumber</CODE>.
     * @param className The fully-qualified class name of the desired instance
     * @param parameters The desired parameters for the instance
     * @param seed The seed for the supporting <CODE>RandomNumber</CODE>
     * @return Instance of <CODE>RandomVector</CODE> based on the
     * (fully-qualified) class name and the parameters.  The default
     * <CODE>RandomNumber</CODE> instance is used.
     * @throws IllegalArgumentException If the className is <CODE>null</CODE> or
     * a class with that name cannot be found.
     * @deprecated Use getInstance(RandomNumber, String, Object...) instead
     */
    public static RandomVector getInstance(String className, Object[] parameters, long seed) {
        RandomVector instance = getInstance(className, parameters);
        instance.getRandomNumber().setSeed(seed);
        return instance;
    }
    
    /**
     * Creates a <CODE>RandomVector</CODE> instance supported by the
     * <CODE>RandomNumber</CODE> instance passed in.
     * @param className The fully-qualified class name of the desired instance
     * @param parameters The desired parameters for the instance
     * @param rng An instance of <CODE>RandomNumber</CODE> to support this
     * RandomVector.
     * @return Instance of <CODE>RandomVector</CODE> based on the
     * (fully-qualified) class name and the parameters.
     * @throws IllegalArgumentException If the className is <CODE>null</CODE> or
     * a class with that name cannot be found.
     */
    public static RandomVector getInstance(RandomNumber rng, String className, Object... parameters ) {
        if (className == null) {
            throw new IllegalArgumentException("Name of RandomVector class is null.");
        }
        RandomVector instance = null;
        Class randomVectorClass = (Class) cache.get(className);
        if (randomVectorClass == null) {
            randomVectorClass = findFullyQualifiedNameFor(className);
        }
        if (randomVectorClass == null) {
            randomVectorClass = findFullyQualifiedNameFor(className + "Vector");
        }
        if (randomVectorClass == null) {
            throw new IllegalArgumentException("Can't find RandomVector class for " + className);
        }
        else {
            cache.put(className, randomVectorClass);
        }
        instance = getInstance(randomVectorClass, parameters);
        instance.setRandomNumber(rng);
        return instance;
    }
    
    /**
     * Created a new instance of the given RandomVector. The random number stream
     * of the new instance should be the same reference to the one supporting
     * the RandomVector passed in.  Therefore (unlike previous implementations)
     * the new instance is independent of the original, since it draws from
     * the same RandomNumber source.
     * @param rv given RandomVector
     * @return a new instance of the given RandomVector. 
     */
    public static RandomVector getInstance(RandomVector rv) {
        RandomVector newInstance =
        getInstance(rv.getRandomNumber(), rv.getClass(), rv.getParameters() );
        return newInstance;
    }
    
    /**
     * Creates a new RandomVector using the default supporting RandomNumber.
     * @param rvClass The Class of the desired RandomVector.
     * @param params The parameters required to construct the RandomVector.
     * @param seed The starting seed for the supporting RandomNumber.
     * @throws IllegalArgumentException If rvClass is not a RandomVector or if
     * it is <CODE>null</CODE>.
     * @return a new RandomVector using the default supporting RandomNumber.
     * @deprecated use getInstance(RandomNumber, Class&lt;?&gt;, Object...) instead
     **/
    public static RandomVector getInstance(Class<?> rvClass, Object[] params, long seed) {
        RandomVector instance = getInstance(rvClass, params);
        instance.getRandomNumber().setSeed(seed);
        return instance;
    }
    
    /**
     * Creates a new RandomVector using the default supporting RandomNumber.
     * Used if the supporting RandomNumber requires multiple seeds.
     * @param rvClass The Class of the desired RandomVector.
     * @param params The parameters required to construct the RandomVector.
     * @param seed The starting seeds for the supporting RandomNumber.
     * @throws IllegalArgumentException If rvClass is not a RandomVector or if
     * it is <CODE>null</CODE>.
     * @return a new RandomVector using the default supporting RandomNumber.
     * @deprecated Used getInstance(RandomNumber, Class&lt;?&gt;, Object...) instead
     **/
    public static RandomVector getInstance(Class<?> rvClass, Object[] params, long[] seed) {
        RandomVector instance = getInstance(rvClass, params);
        instance.getRandomNumber().setSeeds(seed);
        return instance;
    }
    
    /**
     * Creates a new RandomVector using the default supporting RandomNumber and
     * the default seed.
     * @param rvClass The Class of the desired RandomVector.
     * @param params The parameters required to construct the RandomVector.
     * @return a new RandomVector using the default supporting RandomNumber and
     * the default seed.
     * @throws IllegalArgumentException If rvClass is not a RandomVector or if
     * it is <CODE>null</CODE>.
     **/
    public static RandomVector getInstance(Class<?> rvClass, Object... params) {
        if (rvClass == null) {
            throw new IllegalArgumentException("null class passed to RandomVectorFactory");
        }
        if (!simkit.random.RandomVector.class.isAssignableFrom(rvClass)) {
            throw new IllegalArgumentException("Class " + rvClass +
            " does not implement simkit.random.RandomVector interface");
        }
        RandomVector instance = null;
        try {
            instance = (RandomVector) rvClass.newInstance();
            instance.setParameters(params);
        }
        catch (IllegalAccessException e) {
            System.err.println(e);
            throw(new RuntimeException(e));
        }
        catch (InstantiationException e) {
            System.err.println(e);
            throw(new RuntimeException(e));
        }
        return instance;
    }
    
    /**
     * Creates a <CODE>RandomVector</CODE> instance supported by the
     * <CODE>RandomNumber</CODE> instance passed in.
     * @param rvClass The class object of the desired instance
     * @param params The desired parameters for the instance
     * @param rng An instance of <CODE>RandomNumber</CODE> to support this
     * RandomVector.
     * @return Instance of <CODE>RandomVector</CODE> based on the
     * class and the parameters.
     * @throws IllegalArgumentException If the className is <CODE>null</CODE> or
     * a class with that name cannot be found.
     */
    public static RandomVector getInstance(RandomNumber rng, Class<?> rvClass, Object... params) {
        RandomVector instance = getInstance(rvClass, params);
        instance.setRandomNumber(rng);
        return instance;
    }
    
    /**
     * Adds the given fully qualified package name to the list of packages
     * that will be searched when attempting to find RandomVectors by name.
     * @param newPackage given fully qualified package name
     */
    public static void addSearchPackage(String newPackage) {
        searchPackages.add(newPackage);
    }
    
    /**
     * 
     * @param packages Set of packages that will be searched when attempting to find
     * a RandomVector by name.
     */
    public static void setSearchPackages(Set<String> packages) {
        searchPackages = new LinkedHashSet<String>(packages);
    }
    
    /**
     * 
     * @return a shallow copy of the list of packages that will be searched 
     * when attempting to find a RandomVector by name.
     */
    public static Set<String> getSearchPackages() { 
        return new LinkedHashSet<String>(searchPackages); 
    }
    
    /**
     * Finds the RandomVector Class corresponding to the given name. First
     * attempts to find the RandomVector assuming the the name is fully qualified.
     * Then searches the "search packages." The search path defaults to "simit.random"
     * but additional search packages can be added.
     * @see #addSearchPackage(String)
     * @see #setSearchPackages(Set)
     * @param className given name
     * @return RandomVector Class corresponding to the given name
     */
    public static Class findFullyQualifiedNameFor(String className) {
        Class theClass = null;
        //        First see if name passed is "fully qualified"
        try {
            theClass = Thread.currentThread().getContextClassLoader().loadClass(className);
            return theClass;
        }
        //        If not, then try the search path
        catch (ClassNotFoundException e) {}
        for (String searchPackage : searchPackages) {
            if (verbose) {
                System.out.println("Checking " + searchPackage + "." + className);
            }
            try {
                theClass = Thread.currentThread().getContextClassLoader().loadClass(
                searchPackage + "." + className );
                if (!simkit.random.RandomVector.class.isAssignableFrom(theClass)) {
                    // make sure the last class doesn't get returned if
                    // it fails the criteria
                    theClass = null;
                    continue;
                }
            }
            catch (ClassNotFoundException e) { continue; }
        }
        if (verbose) {System.out.println("returning " + theClass);}
        return theClass;
        
    }
}