//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.04.02 at 03:27:54 PST 
//


package simkit.xsd.bindings.assembly;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/rmgold/CVS/Simkit/simkit/xsd/assembly/assembly.xsd line 52)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="listener" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface PropertyChangeListenerConnectionType {


    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getProperty();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setProperty(java.lang.String value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object}
     */
    java.lang.Object getSource();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object}
     */
    void setSource(java.lang.Object value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object}
     */
    java.lang.Object getListener();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object}
     */
    void setListener(java.lang.Object value);

}