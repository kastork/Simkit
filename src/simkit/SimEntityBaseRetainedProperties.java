package simkit;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Work around for BasicSimEntity clearing all added properties when 
 * reset() is invoked.  The (inefficient) trick is to save a copy of 
 * all the added properties, then call super.reset(), and finally
 * regurgitate the saved properties back.
 *
 * @version $Id$
 * @author ahbuss
 */
public class SimEntityBaseRetainedProperties extends SimEntityBase {
    
    protected Map<String, Object> savedProperties;
    
    private boolean retainAddedProperties;
    
    public SimEntityBaseRetainedProperties(String name, Priority priority) {
        super(name, priority);
        setRetainAddedProperties(true);
    }
    
    public SimEntityBaseRetainedProperties(String name) {
        this(name, DEFAULT_PRIORITY);
    }
    
    public SimEntityBaseRetainedProperties(Priority priority) {
        this(DEFAULT_ENTITY_NAME, priority);
    }

    public void setSavedProperties(Map<String, Object> savedProperties) {
        this.savedProperties = savedProperties;
    }
    
    public SimEntityBaseRetainedProperties() {
        this(DEFAULT_ENTITY_NAME, DEFAULT_PRIORITY);
    }
    
    /**
     * If retainAddedProperties is set to true (default), reconstruct
     * all added properties.  Otherwise, discard them (a call ti super.reset()
     * suffices for this).
     */
    @Override
    public void reset() {
        if (!isRetainAddedProperties()) {
            super.reset();
        } else {
            LinkedHashMap<String, Object> tempSavedProperties = new LinkedHashMap<>();
            String[] addedProperties = property.getAddedProperties();
            for (String savedProperty : addedProperties) {
                tempSavedProperties.put(savedProperty, getProperty(savedProperty));
            }
            super.reset();
            for (String addedProperty : tempSavedProperties.keySet()) {
                setProperty(addedProperty, tempSavedProperties.get(addedProperty));
            }
        }
    }
    
    public boolean isRetainAddedProperties() {
        return retainAddedProperties;
    }

    public void setRetainAddedProperties(boolean retainAddedProperties) {
        this.retainAddedProperties = retainAddedProperties;
    }
}