//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.04.02 at 03:27:54 PST 
//


package simkit.xsd.bindings.assembly.impl;

public class PropertyChangeListenerConnectionImpl
    extends simkit.xsd.bindings.assembly.impl.PropertyChangeListenerConnectionTypeImpl
    implements simkit.xsd.bindings.assembly.PropertyChangeListenerConnection, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, simkit.xsd.bindings.assembly.impl.runtime.UnmarshallableObject, simkit.xsd.bindings.assembly.impl.runtime.XMLSerializable, simkit.xsd.bindings.assembly.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (simkit.xsd.bindings.assembly.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (simkit.xsd.bindings.assembly.PropertyChangeListenerConnection.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "PropertyChangeListenerConnection";
    }

    public simkit.xsd.bindings.assembly.impl.runtime.UnmarshallingEventHandler createUnmarshaller(simkit.xsd.bindings.assembly.impl.runtime.UnmarshallingContext context) {
        return new simkit.xsd.bindings.assembly.impl.PropertyChangeListenerConnectionImpl.Unmarshaller(context);
    }

    public void serializeBody(simkit.xsd.bindings.assembly.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "PropertyChangeListenerConnection");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(simkit.xsd.bindings.assembly.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(simkit.xsd.bindings.assembly.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (simkit.xsd.bindings.assembly.PropertyChangeListenerConnection.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0007\u00f0\u00ea\u00a8p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0007\u00f0\u00ea\u009dppsq\u0000~\u0000\u0007\u0006\u00db\u00d1\u00a7ppsq\u0000~\u0000\u0007\u0005\u008b\u00d2ippsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0002\u00b6\u0085\u00aepps"
+"r\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxn"
+"g/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/uti"
+"l/StringPair;xq\u0000~\u0000\u0004\u0000\u00d3\u00c6\u00b3ppsr\u0000\"com.sun.msv.datatype.xsd.IDREFT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com"
+".sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidx"
+"r\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%"
+"com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun."
+"msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012"
+"Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0019L\u0000\nwhiteSpacet\u0000.Lcom/sun/m"
+"sv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2"
+"001/XMLSchemat\u0000\u0005IDREFsr\u00005com.sun.msv.datatype.xsd.WhiteSpace"
+"Processor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Wh"
+"iteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000sr\u00000com.sun.msv.grammar.Expre"
+"ssion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nsr\u0000\u0011java.lang.Bo"
+"olean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0"
+"t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0019L\u0000\fnamespaceURIq\u0000~\u0000\u0019xpq\u0000~\u0000\u001dq\u0000~\u0000\u001cs"
+"r\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNam"
+"eq\u0000~\u0000\u0019L\u0000\fnamespaceURIq\u0000~\u0000\u0019xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\blistenert\u0000\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u00d5L\u00b6ppsq\u0000~\u0000\f\u0002\u00d5L\u00abq\u0000~\u0000$psq\u0000~\u0000\u000e\u0001m\'\u0012ppsr\u0000%com.su"
+"n.msv.datatype.xsd.SimpleURType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0016q\u0000~\u0000\u001ct\u0000\ranyS"
+"impleTypesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Pr"
+"eserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001fq\u0000~\u0000\"sq\u0000~\u0000%q\u0000~\u00002q\u0000~\u0000\u001csq\u0000~\u0000\'t\u0000\bpropert"
+"yq\u0000~\u0000+sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tsq\u0000~\u0000#\u0001psq\u0000~\u0000\f\u0001O\u00ff9ppq\u0000~\u0000\u0011sq\u0000~\u0000\'t\u0000\u0006sourceq"
+"\u0000~\u0000+sq\u0000~\u0000,\u0001\u0015\u0018\u00f1ppsq\u0000~\u0000\f\u0001\u0015\u0018\u00e6q\u0000~\u0000$psq\u0000~\u0000\u000e\u0000\u00f1\u008e\u009eppsr\u0000\"com.sun.msv."
+"datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0016q\u0000~\u0000\u001ct\u0000\u0005QNameq\u0000~\u0000 q\u0000~"
+"\u0000\"sq\u0000~\u0000%q\u0000~\u0000Cq\u0000~\u0000\u001csq\u0000~\u0000\'t\u0000\u0004typet\u0000)http://www.w3.org/2001/XML"
+"Schema-instanceq\u0000~\u00009sq\u0000~\u0000\'t\u0000 PropertyChangeListenerConnectio"
+"nq\u0000~\u0000+sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bex"
+"pTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr"
+"\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000"
+"\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000K[\u0000\u0005tablet\u0000![Lcom/sun/msv/gra"
+"mmar/Expression;xp\u0000\u0000\u0000\u0005\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Express"
+"ion;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppppppppppppq\u0000~\u0000-ppppq\u0000~\u0000\tpp"
+"pppppppppppppppppppppppppppppppppq\u0000~\u0000\npppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppq\u0000~\u0000>pppppppppppppppppppq\u0000~\u0000\u000bpppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends simkit.xsd.bindings.assembly.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(simkit.xsd.bindings.assembly.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(simkit.xsd.bindings.assembly.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return simkit.xsd.bindings.assembly.impl.PropertyChangeListenerConnectionImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("PropertyChangeListenerConnection" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "listener");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("PropertyChangeListenerConnection" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "listener");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("listener" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((simkit.xsd.bindings.assembly.impl.PropertyChangeListenerConnectionTypeImpl)simkit.xsd.bindings.assembly.impl.PropertyChangeListenerConnectionImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "listener");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
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
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "listener");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}