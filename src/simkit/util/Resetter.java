package simkit.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import simkit.BasicSimEntity;
import simkit.SimEvent;

/**
 * 
 * @version $Id$
 * @author  ahbuss
 */
public class Resetter extends BasicSimEntity {
    
    /**
     *
     */    
    public static final String DEFAULT_RESETTER_NAME = "reset";
    
    private LinkedHashMap<Object, Method> resetters;
    
    public Resetter() {
        resetters = new LinkedHashMap<Object, Method>();
    }
    
    /**
     * For all reigstered "resetters", invoke their declared
     * "reset" method (typically the "reset()" method)
     */    
    @Override
    public void reset() {
        super.reset();
        for (Object resetter : resetters.keySet()) {
            Method resetMethod = resetters.get(resetter);
            try {
                resetMethod.invoke(resetter, (Object[]) null);
            }
            catch (InvocationTargetException e) {
                throw new RuntimeException(e.getTargetException().toString());
            }
            catch (Throwable t) {
                throw new RuntimeException(t.toString());
            }
        }
    }
    
    /**
     * Add a resetter using the default reset method name
     * ("reset").
     * @param resetter Object to be reset
     */    
    public void addResetter(Object resetter) {
        addResetter(resetter, DEFAULT_RESETTER_NAME);
    }
    
    /**
     * The reset method should be public and have no arguments.
     * @param resetter Object to be reset
     * @param resetMethodName Name of reset method
     */    
    public void addResetter(Object resetter, String resetMethodName) {
        try {
            Method resetMethod = resetter.getClass().getMethod(
                resetMethodName, (Class[]) null
            );
            
            resetters.put(resetter, resetMethod);
        }
        catch (NoSuchMethodException e) {
            throw new RuntimeException(e.toString());
        }
    }
    
    /**
     * Removes given object.  If the object has not been
     * previously added, there is no error.
     * @param resetter Objcet to be removed
     */    
    public void removeResetter(Object resetter) {
        resetters.remove(resetter);
    }
    
    /**
     * Remove all resetters.
     */    
    public void clear() {
        resetters.clear();
    }
    
    /**
     * Shallow copy of keyset for resetters Map.
     * @return All registered resetters in a Set
     */    
    public Set<Object> getResetters() {
        return new LinkedHashSet<Object>(resetters.keySet());
    }
    
    /**
     *
     * @return All registered resetters in an Object[] array
     */    
    public Object[] getResettersAsArray() {
        return resetters.keySet().toArray();
    }
    
    /**
     * Does nothing
     * @param event Heard SimEvent
     */    
    public void handleSimEvent(SimEvent event) {
    }    
    
    /**
     * Does nothing.
     * @param event Previosuly scheduled SimEvent
     */    
    public void processSimEvent(SimEvent event) {
    }
    
}
