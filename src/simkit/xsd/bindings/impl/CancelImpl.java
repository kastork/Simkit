//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.04.14 at 10:40:49 GMT-08:00 
//


package simkit.xsd.bindings.impl;

public class CancelImpl
    extends simkit.xsd.bindings.impl.CancelTypeImpl
    implements simkit.xsd.bindings.Cancel, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, simkit.xsd.bindings.impl.runtime.UnmarshallableObject, simkit.xsd.bindings.impl.runtime.XMLSerializable, simkit.xsd.bindings.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (simkit.xsd.bindings.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (simkit.xsd.bindings.Cancel.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Cancel";
    }

    public simkit.xsd.bindings.impl.runtime.UnmarshallingEventHandler createUnmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
        return new simkit.xsd.bindings.impl.CancelImpl.Unmarshaller(context);
    }

    public void serializeBody(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "Cancel");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (simkit.xsd.bindings.Cancel.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0006\u00e9\u00a2hp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0006\u00e9\u00a2]ppsq\u0000~\u0000\u0007\u0005l\u00ce\u008eppsq\u0000~\u0000\u0007\u0003D6\u00d5ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u001c\u0093\u001cppsr\u0000 com.sun.msv.grammar.OneOrMor"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0002\u001c\u0093\u0011sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuex"
+"p\u0000psq\u0000~\u0000\f\u0002\u001c\u0093\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0000\u0000J~\u0018q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\f\u0000J~\rppsq\u0000~\u0000\u000e\u0000J~\u0002q\u0000"
+"~\u0000\u0012psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~"
+"\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000J}\u00ffq\u0000~\u0000\u0012psr\u00002com.sun.msv.grammar.E"
+"xpression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u0011\u0001psr"
+"\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv"
+".grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expre"
+"ssion$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bpsr\u0000#com.su"
+"n.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava"
+"/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000!simkit.xsd.binding"
+"s.EdgeParametert\u0000+http://java.sun.com/jaxb/xjc/dummy-element"
+"ssq\u0000~\u0000\u0000\u0001\u00d2\u0014\u00f4q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u0007\u0001\u00d2\u0014\u00e9ppsq\u0000~\u0000\u0000\u0000J~\u0018pp\u0000sq\u0000~\u0000\f\u0000J~\rppsq\u0000~\u0000"
+"\u000e\u0000J~\u0002q\u0000~\u0000\u0012psq\u0000~\u0000\u0017\u0000J}\u00ffq\u0000~\u0000\u0012pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%simkit.xs"
+"d.bindings.EdgeParameterTypeq\u0000~\u0000%sq\u0000~\u0000\f\u0001\u0087\u0096\u00ccppsq\u0000~\u0000\u0017\u0001\u0087\u0096\u00c1q\u0000~\u0000\u0012"
+"psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/rela"
+"xng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/u"
+"til/StringPair;xq\u0000~\u0000\u0004\u0000\u00abT\u00fbppsr\u0000\"com.sun.msv.datatype.xsd.Qnam"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\fnamespaceUriq\u0000~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom/sun/"
+"msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/"
+"2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpac"
+"eProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expre"
+"ssion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.ms"
+"v.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespaceURI"
+"q\u0000~\u0000\"xpq\u0000~\u0000;q\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLS"
+"chema-instanceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\rEdgeParametert\u0000\u0000q\u0000~\u0000 sq\u0000~\u0000\u0017\u0001\'\u00a3\u00b4p"
+"psq\u0000~\u00000\u0000\u00da,\u00ffppsr\u0000\"com.sun.msv.datatype.xsd.IDREFType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com."
+"sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.dat"
+"atype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00005q\u0000~\u0000:t\u0000"
+"\u0005IDREFq\u0000~\u0000>\u0000q\u0000~\u0000@sq\u0000~\u0000Aq\u0000~\u0000Pq\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0005eventq\u0000~\u0000Hsq\u0000~\u0000\f\u0002("
+"\u0097\u00b4ppsq\u0000~\u0000\u0017\u0002(\u0097\u00a9q\u0000~\u0000\u0012psq\u0000~\u00000\u0000|8\u0095ppsr\u0000%com.sun.msv.datatype.xsd"
+".SimpleURType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00005q\u0000~\u0000:t\u0000\ranySimpleTypesr\u00005com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000=q\u0000~\u0000@sq\u0000~\u0000Aq\u0000~\u0000Yq\u0000~\u0000:sq\u0000~\u0000!t\u0000\tconditionq\u0000~\u0000Hq\u0000~\u0000 sq\u0000~\u0000\f"
+"\u0001|\u00d3\u00cappsq\u0000~\u0000\u0017\u0001|\u00d3\u00bfq\u0000~\u0000\u0012pq\u0000~\u00003sq\u0000~\u0000!q\u0000~\u0000Dq\u0000~\u0000Eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0006Can"
+"celq\u0000~\u0000Hsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\b"
+"expTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xp"
+"sr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004"
+"I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000e[\u0000\u0005tablet\u0000![Lcom/sun/msv/g"
+"rammar/Expression;xp\u0000\u0000\u0000\u000e\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expre"
+"ssion;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppppppppq\u0000~\u0000\u0013ppq\u0000~\u0000\'q"
+"\u0000~\u0000\u0010ppq\u0000~\u0000\u000bppppppq\u0000~\u0000.q\u0000~\u0000\rppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000_ppq\u0000~\u0000\tpp"
+"ppppppppppppppppppppppppppppq\u0000~\u0000\u0016q\u0000~\u0000*q\u0000~\u0000Tppppppppq\u0000~\u0000\u0015q\u0000~\u0000"
+")pppppppppppppppppppppppq\u0000~\u0000\np"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends simkit.xsd.bindings.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return simkit.xsd.bindings.impl.CancelImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("Cancel" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
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
                    case  2 :
                        if (("Cancel" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                    case  1 :
                        if (("event" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((simkit.xsd.bindings.impl.CancelTypeImpl)simkit.xsd.bindings.impl.CancelImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
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
                    case  1 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
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
                        case  1 :
                            attIdx = context.getAttribute("", "event");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  3 :
                            revertToParentFromText(value);
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
