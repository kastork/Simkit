//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.04.14 at 10:40:49 GMT-08:00 
//


package simkit.xsd.bindings;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/cygwin/home/rmgoldbe/CVS/Simkit/simkit/xml/simkit.xsd line 56)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Argument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}LocalVariable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}StateTransition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}Schedule"/>
 *           &lt;element ref="{}Cancel"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Coordinate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface EventType {


    /**
     * Gets the value of the Comment property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Comment property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getComment();

    /**
     * 
     * @return
     *     possible object is
     *     {@link simkit.xsd.bindings.CoordinateType}
     *     {@link simkit.xsd.bindings.Coordinate}
     */
    simkit.xsd.bindings.CoordinateType getCoordinate();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link simkit.xsd.bindings.CoordinateType}
     *     {@link simkit.xsd.bindings.Coordinate}
     */
    void setCoordinate(simkit.xsd.bindings.CoordinateType value);

    /**
     * Gets the value of the StateTransition property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the StateTransition property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateTransition().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link simkit.xsd.bindings.StateTransition}
     * {@link simkit.xsd.bindings.StateTransitionType}
     * 
     */
    java.util.List getStateTransition();

    /**
     * Gets the value of the LocalVariable property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the LocalVariable property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalVariable().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link simkit.xsd.bindings.LocalVariable}
     * {@link simkit.xsd.bindings.LocalVariableType}
     * 
     */
    java.util.List getLocalVariable();

    /**
     * Gets the value of the ScheduleOrCancel property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ScheduleOrCancel property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleOrCancel().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link simkit.xsd.bindings.Schedule}
     * {@link simkit.xsd.bindings.Cancel}
     * 
     */
    java.util.List getScheduleOrCancel();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getName();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setName(java.lang.String value);

    /**
     * Gets the value of the Argument property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Argument property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgument().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link simkit.xsd.bindings.Argument}
     * {@link simkit.xsd.bindings.ArgumentType}
     * 
     */
    java.util.List getArgument();

}
