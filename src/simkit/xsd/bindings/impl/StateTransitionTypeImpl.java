//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.03.25 at 11:41:55 PST 
//


package simkit.xsd.bindings.impl;

public class StateTransitionTypeImpl implements simkit.xsd.bindings.StateTransitionType, com.sun.xml.bind.JAXBObject, simkit.xsd.bindings.impl.runtime.UnmarshallableObject, simkit.xsd.bindings.impl.runtime.XMLSerializable, simkit.xsd.bindings.impl.runtime.ValidatableObject
{

    protected simkit.xsd.bindings.OperationType _Operation;
    protected java.lang.Object _State;
    protected simkit.xsd.bindings.AssignmentType _Assignment;
    public final static java.lang.Class version = (simkit.xsd.bindings.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (simkit.xsd.bindings.StateTransitionType.class);
    }

    public simkit.xsd.bindings.OperationType getOperation() {
        return _Operation;
    }

    public void setOperation(simkit.xsd.bindings.OperationType value) {
        _Operation = value;
    }

    public java.lang.Object getState() {
        return _State;
    }

    public void setState(java.lang.Object value) {
        _State = value;
    }

    public simkit.xsd.bindings.AssignmentType getAssignment() {
        return _Assignment;
    }

    public void setAssignment(simkit.xsd.bindings.AssignmentType value) {
        _Assignment = value;
    }

    public simkit.xsd.bindings.impl.runtime.UnmarshallingEventHandler createUnmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
        return new simkit.xsd.bindings.impl.StateTransitionTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if ((_Operation == null)&&(_Assignment!= null)) {
            if (_Assignment instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Assignment), "Assignment");
            } else {
                context.startElement("", "Assignment");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Assignment), "Assignment");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Assignment), "Assignment");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Assignment), "Assignment");
                context.endElement();
            }
        } else {
            if ((_Operation!= null)&&(_Assignment == null)) {
                if (_Operation instanceof javax.xml.bind.Element) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _Operation), "Operation");
                } else {
                    context.startElement("", "Operation");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Operation), "Operation");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Operation), "Operation");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _Operation), "Operation");
                    context.endElement();
                }
            }
        }
    }

    public void serializeAttributes(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "state");
        try {
            context.text(context.onIDREF(((com.sun.xml.bind.marshaller.IdentifiableObject)((java.lang.Object) _State))), "State");
        } catch (java.lang.Exception e) {
            simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if ((_Operation == null)&&(_Assignment!= null)) {
            if (_Assignment instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Assignment), "Assignment");
            }
        } else {
            if ((_Operation!= null)&&(_Assignment == null)) {
                if (_Operation instanceof javax.xml.bind.Element) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Operation), "Operation");
                }
            }
        }
    }

    public void serializeURIs(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if ((_Operation == null)&&(_Assignment!= null)) {
            if (_Assignment instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Assignment), "Assignment");
            }
        } else {
            if ((_Operation!= null)&&(_Assignment == null)) {
                if (_Operation instanceof javax.xml.bind.Element) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Operation), "Operation");
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (simkit.xsd.bindings.StateTransitionType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\r\u00e4\u00a5\u0004ppsr\u0000\u001dcom.sun.msv.gra"
+"mmar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\n\u00e8\u00efmppsq\u0000~\u0000\u0006\u0007\u0090\u00d71ppsq\u0000~\u0000\u0006\u0005\u00fa\u00f9\u00b2p"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u0095\u00dd}pp\u0000sq\u0000~\u0000\u0006\u0001\u0095\u00ddrppsr\u0000 com.sun.msv.gram"
+"mar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u0095\u00ddgsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee"
+"\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bxq\u0000~\u0000\u0003\u0001\u0095\u00dddq\u0000~\u0000\u0013psr\u00002com.sun.ms"
+"v.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000"
+"\bsq\u0000~\u0000\u0012\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001d"
+"com.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gr"
+"ammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0018"
+"psr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalN"
+"amet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001fxq\u0000~\u0000\u001at\u0000\u001esimkit."
+"xsd.bindings.Assignmentt\u0000+http://java.sun.com/jaxb/xjc/dummy"
+"-elementssq\u0000~\u0000\n\u0004e\u001c3pp\u0000sq\u0000~\u0000\u0000\u0004e\u001c(ppsq\u0000~\u0000\n\u0001\u0095\u00dd}pp\u0000sq\u0000~\u0000\u0006\u0001\u0095\u00ddrpps"
+"q\u0000~\u0000\u000f\u0001\u0095\u00ddgq\u0000~\u0000\u0013psq\u0000~\u0000\u0014\u0001\u0095\u00dddq\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\"simki"
+"t.xsd.bindings.AssignmentTypeq\u0000~\u0000\"sq\u0000~\u0000\u0006\u0002\u00cf>\u00a6ppsq\u0000~\u0000\u0014\u0002\u00cf>\u009bq\u0000~\u0000"
+"\u0013psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/rel"
+"axng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/"
+"util/StringPair;xq\u0000~\u0000\u0003\u0001\u009du\u00feppsr\u0000\"com.sun.msv.datatype.xsd.Qna"
+"meType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003"
+"L\u0000\fnamespaceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lcom/sun"
+"/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org"
+"/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd."
+"WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expr"
+"ession$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.m"
+"sv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnamespaceUR"
+"Iq\u0000~\u0000\u001fxpq\u0000~\u00008q\u0000~\u00007sq\u0000~\u0000\u001et\u0000\u0004typet\u0000)http://www.w3.org/2001/XML"
+"Schema-instanceq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\nAssignmentt\u0000\u0000sq\u0000~\u0000\n\u0001\u0095\u00dd}pp\u0000sq\u0000~\u0000"
+"\u0006\u0001\u0095\u00ddrppsq\u0000~\u0000\u000f\u0001\u0095\u00ddgq\u0000~\u0000\u0013psq\u0000~\u0000\u0014\u0001\u0095\u00dddq\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001e"
+"t\u0000\u001dsimkit.xsd.bindings.Operationq\u0000~\u0000\"sq\u0000~\u0000\n\u0003X\u0018:pp\u0000sq\u0000~\u0000\u0000\u0003X\u0018/"
+"ppsq\u0000~\u0000\n\u0001\u0095\u00dd}pp\u0000sq\u0000~\u0000\u0006\u0001\u0095\u00ddrppsq\u0000~\u0000\u000f\u0001\u0095\u00ddgq\u0000~\u0000\u0013psq\u0000~\u0000\u0014\u0001\u0095\u00dddq\u0000~\u0000\u0013pq"
+"\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000!simkit.xsd.bindings.OperationTypeq\u0000~\u0000"
+"\"sq\u0000~\u0000\u0006\u0001\u00c2:\u00adppsq\u0000~\u0000\u0014\u0001\u00c2:\u00a2q\u0000~\u0000\u0013pq\u0000~\u00000sq\u0000~\u0000\u001eq\u0000~\u0000Aq\u0000~\u0000Bq\u0000~\u0000\u001dsq\u0000~\u0000"
+"\u001et\u0000\tOperationq\u0000~\u0000Esq\u0000~\u0000\u0014\u0002\u00fb\u00b5\u0092ppsq\u0000~\u0000-\u0001\u00a6h_ppsr\u0000\"com.sun.msv.da"
+"tatype.xsd.IDREFType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd."
+"NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001"
+"Z\u0000\risAlwaysValidxq\u0000~\u00002q\u0000~\u00007t\u0000\u0005IDREFq\u0000~\u0000;\u0000q\u0000~\u0000=sq\u0000~\u0000>q\u0000~\u0000`q\u0000~"
+"\u00007sq\u0000~\u0000\u001et\u0000\u0005stateq\u0000~\u0000Esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$"
+"ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHa"
+"sh\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000e[\u0000\u0005tablet\u0000![L"
+"com/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0010\u0000\u0000\u00009pur\u0000![Lcom.sun.msv."
+"grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppppppq\u0000"
+"~\u0000\u0007pppppppppppppppppq\u0000~\u0000$ppppppppppppppppppppppppppppppppq\u0000~"
+"\u0000\u0005ppppppppppppppppppppq\u0000~\u0000Mppppq\u0000~\u0000\u0011q\u0000~\u0000\'q\u0000~\u0000Hq\u0000~\u0000Pppq\u0000~\u0000+q\u0000"
+"~\u0000\bpppq\u0000~\u0000\u000eq\u0000~\u0000&q\u0000~\u0000Gq\u0000~\u0000Opppppppppppppppppppppppppppppppppp"
+"pppppppppppq\u0000~\u0000Tppppppppppppppq\u0000~\u0000\tpppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends simkit.xsd.bindings.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
            super(context, "---------");
        }

        protected Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return simkit.xsd.bindings.impl.StateTransitionTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "state");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  7 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "method");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        if (("Assignment" == ___local)&&("" == ___uri)) {
                            _Assignment = ((simkit.xsd.bindings.impl.AssignmentImpl) spawnChildFromEnterElement((simkit.xsd.bindings.impl.AssignmentImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Assignment" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        if (("Operation" == ___local)&&("" == ___uri)) {
                            _Operation = ((simkit.xsd.bindings.impl.OperationImpl) spawnChildFromEnterElement((simkit.xsd.bindings.impl.OperationImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Operation" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                context.addPatcher(new java.lang.Runnable() {


                    public void run() {
                        _State = ((java.lang.Object) context.getObjectFromId(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value)));
                    }

                }
                );
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "state");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  7 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  5 :
                        if (("Operation" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "method");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  8 :
                        if (("Assignment" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("state" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  7 :
                        if (("value" == ___local)&&("" == ___uri)) {
                            _Assignment = ((simkit.xsd.bindings.impl.AssignmentTypeImpl) spawnChildFromEnterAttribute((simkit.xsd.bindings.impl.AssignmentTypeImpl.class), 8, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  4 :
                        if (("method" == ___local)&&("" == ___uri)) {
                            _Operation = ((simkit.xsd.bindings.impl.OperationTypeImpl) spawnChildFromEnterAttribute((simkit.xsd.bindings.impl.OperationTypeImpl.class), 5, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "state");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  7 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "method");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        if (("state" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  6 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "state");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  7 :
                            attIdx = context.getAttribute("", "value");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  4 :
                            attIdx = context.getAttribute("", "method");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}