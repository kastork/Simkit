//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.04.14 at 10:40:49 GMT-08:00 
//


package simkit.xsd.bindings;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the simkit.xsd.bindings package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends simkit.xsd.bindings.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap();
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static simkit.xsd.bindings.impl.runtime.GrammarInfo grammarInfo = new simkit.xsd.bindings.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (simkit.xsd.bindings.ObjectFactory.class));
    public final static java.lang.Class version = (simkit.xsd.bindings.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((simkit.xsd.bindings.ScheduleType.class), "simkit.xsd.bindings.impl.ScheduleTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.Coordinate.class), "simkit.xsd.bindings.impl.CoordinateImpl");
        defaultImplementations.put((simkit.xsd.bindings.Parameter.class), "simkit.xsd.bindings.impl.ParameterImpl");
        defaultImplementations.put((simkit.xsd.bindings.Comment.class), "simkit.xsd.bindings.impl.CommentImpl");
        defaultImplementations.put((simkit.xsd.bindings.EventType.class), "simkit.xsd.bindings.impl.EventTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.LocalVariableType.class), "simkit.xsd.bindings.impl.LocalVariableTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.SimkitModuleType.class), "simkit.xsd.bindings.impl.SimkitModuleTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.StateTransition.class), "simkit.xsd.bindings.impl.StateTransitionImpl");
        defaultImplementations.put((simkit.xsd.bindings.OperationType.class), "simkit.xsd.bindings.impl.OperationTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.CoordinateType.class), "simkit.xsd.bindings.impl.CoordinateTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.Assignment.class), "simkit.xsd.bindings.impl.AssignmentImpl");
        defaultImplementations.put((simkit.xsd.bindings.Argument.class), "simkit.xsd.bindings.impl.ArgumentImpl");
        defaultImplementations.put((simkit.xsd.bindings.Operation.class), "simkit.xsd.bindings.impl.OperationImpl");
        defaultImplementations.put((simkit.xsd.bindings.Event.class), "simkit.xsd.bindings.impl.EventImpl");
        defaultImplementations.put((simkit.xsd.bindings.CancelType.class), "simkit.xsd.bindings.impl.CancelTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.ParameterType.class), "simkit.xsd.bindings.impl.ParameterTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.AssignmentType.class), "simkit.xsd.bindings.impl.AssignmentTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.ArgumentType.class), "simkit.xsd.bindings.impl.ArgumentTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.SimkitModule.class), "simkit.xsd.bindings.impl.SimkitModuleImpl");
        defaultImplementations.put((simkit.xsd.bindings.Cancel.class), "simkit.xsd.bindings.impl.CancelImpl");
        defaultImplementations.put((simkit.xsd.bindings.EdgeParameter.class), "simkit.xsd.bindings.impl.EdgeParameterImpl");
        defaultImplementations.put((simkit.xsd.bindings.Schedule.class), "simkit.xsd.bindings.impl.ScheduleImpl");
        defaultImplementations.put((simkit.xsd.bindings.StateVariableType.class), "simkit.xsd.bindings.impl.StateVariableTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.LocalVariable.class), "simkit.xsd.bindings.impl.LocalVariableImpl");
        defaultImplementations.put((simkit.xsd.bindings.StateVariable.class), "simkit.xsd.bindings.impl.StateVariableImpl");
        defaultImplementations.put((simkit.xsd.bindings.EdgeParameterType.class), "simkit.xsd.bindings.impl.EdgeParameterTypeImpl");
        defaultImplementations.put((simkit.xsd.bindings.StateTransitionType.class), "simkit.xsd.bindings.impl.StateTransitionTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("", "Cancel"), (simkit.xsd.bindings.Cancel.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "Comment"), (simkit.xsd.bindings.Comment.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "EdgeParameter"), (simkit.xsd.bindings.EdgeParameter.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "Schedule"), (simkit.xsd.bindings.Schedule.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "Assignment"), (simkit.xsd.bindings.Assignment.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "StateTransition"), (simkit.xsd.bindings.StateTransition.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "Operation"), (simkit.xsd.bindings.Operation.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "StateVariable"), (simkit.xsd.bindings.StateVariable.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "Coordinate"), (simkit.xsd.bindings.Coordinate.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "LocalVariable"), (simkit.xsd.bindings.LocalVariable.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "Event"), (simkit.xsd.bindings.Event.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "SimkitModule"), (simkit.xsd.bindings.SimkitModule.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "Parameter"), (simkit.xsd.bindings.Parameter.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "Argument"), (simkit.xsd.bindings.Argument.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: simkit.xsd.bindings
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of ScheduleType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.ScheduleType createScheduleType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.ScheduleTypeImpl();
    }

    /**
     * Create an instance of Coordinate
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Coordinate createCoordinate()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.CoordinateImpl();
    }

    /**
     * Create an instance of Parameter
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Parameter createParameter()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.ParameterImpl();
    }

    /**
     * Create an instance of Comment
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Comment createComment()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.CommentImpl();
    }

    /**
     * Create an instance of Comment
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Comment createComment(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.CommentImpl(value);
    }

    /**
     * Create an instance of EventType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.EventType createEventType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.EventTypeImpl();
    }

    /**
     * Create an instance of LocalVariableType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.LocalVariableType createLocalVariableType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.LocalVariableTypeImpl();
    }

    /**
     * Create an instance of SimkitModuleType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.SimkitModuleType createSimkitModuleType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.SimkitModuleTypeImpl();
    }

    /**
     * Create an instance of StateTransition
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.StateTransition createStateTransition()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.StateTransitionImpl();
    }

    /**
     * Create an instance of OperationType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.OperationType createOperationType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.OperationTypeImpl();
    }

    /**
     * Create an instance of CoordinateType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.CoordinateType createCoordinateType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.CoordinateTypeImpl();
    }

    /**
     * Create an instance of Assignment
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Assignment createAssignment()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.AssignmentImpl();
    }

    /**
     * Create an instance of Argument
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Argument createArgument()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.ArgumentImpl();
    }

    /**
     * Create an instance of Operation
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Operation createOperation()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.OperationImpl();
    }

    /**
     * Create an instance of Event
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Event createEvent()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.EventImpl();
    }

    /**
     * Create an instance of CancelType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.CancelType createCancelType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.CancelTypeImpl();
    }

    /**
     * Create an instance of ParameterType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.ParameterType createParameterType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.ParameterTypeImpl();
    }

    /**
     * Create an instance of AssignmentType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.AssignmentType createAssignmentType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.AssignmentTypeImpl();
    }

    /**
     * Create an instance of ArgumentType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.ArgumentType createArgumentType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.ArgumentTypeImpl();
    }

    /**
     * Create an instance of SimkitModule
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.SimkitModule createSimkitModule()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.SimkitModuleImpl();
    }

    /**
     * Create an instance of Cancel
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Cancel createCancel()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.CancelImpl();
    }

    /**
     * Create an instance of EdgeParameter
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.EdgeParameter createEdgeParameter()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.EdgeParameterImpl();
    }

    /**
     * Create an instance of Schedule
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.Schedule createSchedule()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.ScheduleImpl();
    }

    /**
     * Create an instance of StateVariableType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.StateVariableType createStateVariableType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.StateVariableTypeImpl();
    }

    /**
     * Create an instance of LocalVariable
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.LocalVariable createLocalVariable()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.LocalVariableImpl();
    }

    /**
     * Create an instance of StateVariable
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.StateVariable createStateVariable()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.StateVariableImpl();
    }

    /**
     * Create an instance of EdgeParameterType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.EdgeParameterType createEdgeParameterType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.EdgeParameterTypeImpl();
    }

    /**
     * Create an instance of StateTransitionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public simkit.xsd.bindings.StateTransitionType createStateTransitionType()
        throws javax.xml.bind.JAXBException
    {
        return new simkit.xsd.bindings.impl.StateTransitionTypeImpl();
    }

}
