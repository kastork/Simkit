//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.04.14 at 10:40:49 GMT-08:00 
//


package simkit.xsd.bindings.impl;

public class LocalVariableTypeImpl implements simkit.xsd.bindings.LocalVariableType, com.sun.xml.bind.JAXBObject, simkit.xsd.bindings.impl.runtime.UnmarshallableObject, simkit.xsd.bindings.impl.runtime.XMLSerializable, simkit.xsd.bindings.impl.runtime.ValidatableObject
{

    protected java.lang.String _Type;
    protected java.lang.String _Value;
    protected com.sun.xml.bind.util.ListImpl _Comment = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected java.lang.String _Name;
    public final static java.lang.Class version = (simkit.xsd.bindings.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (simkit.xsd.bindings.LocalVariableType.class);
    }

    public java.lang.String getType() {
        return _Type;
    }

    public void setType(java.lang.String value) {
        _Type = value;
    }

    public java.lang.String getValue() {
        return _Value;
    }

    public void setValue(java.lang.String value) {
        _Value = value;
    }

    public java.util.List getComment() {
        return _Comment;
    }

    public java.lang.String getName() {
        return _Name;
    }

    public void setName(java.lang.String value) {
        _Name = value;
    }

    public simkit.xsd.bindings.impl.runtime.UnmarshallingEventHandler createUnmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
        return new simkit.xsd.bindings.impl.LocalVariableTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = _Comment.size();
        while (idx3 != len3) {
            context.startElement("", "Comment");
            int idx_0 = idx3;
            try {
                idx_0 += 1;
            } catch (java.lang.Exception e) {
                simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endNamespaceDecls();
            int idx_1 = idx3;
            try {
                idx_1 += 1;
            } catch (java.lang.Exception e) {
                simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttributes();
            try {
                context.text(((java.lang.String) _Comment.get(idx3 ++)), "Comment");
            } catch (java.lang.Exception e) {
                simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = _Comment.size();
        context.startAttribute("", "type");
        try {
            context.text(((java.lang.String) _Type), "Type");
        } catch (java.lang.Exception e) {
            simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        context.startAttribute("", "value");
        try {
            context.text(((java.lang.String) _Value), "Value");
        } catch (java.lang.Exception e) {
            simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        context.startAttribute("", "name");
        try {
            context.text(((java.lang.String) _Name), "Name");
        } catch (java.lang.Exception e) {
            simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        while (idx3 != len3) {
            try {
                idx3 += 1;
            } catch (java.lang.Exception e) {
                simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
    }

    public void serializeURIs(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = _Comment.size();
        while (idx3 != len3) {
            try {
                idx3 += 1;
            } catch (java.lang.Exception e) {
                simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (simkit.xsd.bindings.LocalVariableType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0006\u0088W\u0005ppsq\u0000~\u0000\u0000\u0005A\'\u00a9ppsq\u0000~\u0000\u0000\u0002"
+"\u00c8.lppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u00021\u00e28p"
+"psr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun."
+"msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u00021\u00e2-sr\u0000\u0011java"
+".lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar."
+"trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gr"
+"ammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u00021\u00e2*"
+"q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0000\u00021\u00e2\u001fppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004nam"
+"et\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0000\u00b2\u00c6\u00b6ppsr\u0000#com.sun.msv"
+".datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.s"
+"un.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun."
+"msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.data"
+"type.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/la"
+"ng/String;L\u0000\btypeNameq\u0000~\u0000\u001cL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datat"
+"ype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLS"
+"chemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcess"
+"or$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpac"
+"eProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$N"
+"ullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.msv.util."
+"StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001cL\u0000\fnamespaceURIq\u0000~\u0000\u001cxp"
+"q\u0000~\u0000 q\u0000~\u0000\u001fsq\u0000~\u0000\b\u0001\u007f\u001bdppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0010xq\u0000~\u0000\u0003\u0001\u007f\u001bYq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000"
+"\u00abT\u00fbppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0019"
+"q\u0000~\u0000\u001ft\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcesso"
+"r$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\"q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000.q\u0000~\u0000\u001fsr\u0000#com.sun."
+"msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001cL\u0000\fna"
+"mespaceURIq\u0000~\u0000\u001cxr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"pt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000com."
+"sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"\u0003\u0000\u0000\u0000\tsq\u0000~\u0000\r\u0001psq\u0000~\u00002t\u0000\u0007Commentt\u0000\u0000q\u0000~\u00008sq\u0000~\u0000)\u0000\u0096L/ppsq\u0000~\u0000\u0014\u0000|8\u0095p"
+"psr\u0000%com.sun.msv.datatype.xsd.SimpleURType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0019q"
+"\u0000~\u0000\u001ft\u0000\ranySimpleTypeq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000Aq\u0000~\u0000\u001fsq\u0000~\u00002t\u0000\u0004typeq"
+"\u0000~\u0000<sq\u0000~\u0000)\u0002x\u00f98ppq\u0000~\u0000>sq\u0000~\u00002t\u0000\u0005valueq\u0000~\u0000<sq\u0000~\u0000)\u0001G/Wppq\u0000~\u0000>sq\u0000"
+"~\u00002t\u0000\u0004nameq\u0000~\u0000<sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Closed"
+"Hash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N"
+"\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000L[\u0000\u0005tablet\u0000![Lcom/su"
+"n/msv/grammar/Expression;xp\u0000\u0000\u0000\u0007\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.gramma"
+"r.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppppppppppppq\u0000~\u0000\u0006pp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0013pppppppppppppq\u0000~\u0000\fppp"
+"pppppppq\u0000~\u0000\tpppppppppppppq\u0000~\u0000(pppppppppppppppppppppppq\u0000~\u0000\u0007pp"
+"q\u0000~\u0000\u0005pppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends simkit.xsd.bindings.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return simkit.xsd.bindings.impl.LocalVariableTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  12 :
                        if (("Comment" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        if (("Comment" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 9;
                            continue outer;
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
                _Value = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Type = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Name = value;
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
                    case  12 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 9;
                            continue outer;
                        }
                        break;
                    case  11 :
                        if (("Comment" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 12;
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
                    case  12 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  3 :
                        if (("value" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        if (("type" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("name" == ___local)&&("" == ___uri)) {
                            state = 7;
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
                    case  12 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  5 :
                        if (("value" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 9;
                            continue outer;
                        }
                        break;
                    case  8 :
                        if (("name" == ___local)&&("" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("type" == ___local)&&("" == ___uri)) {
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
                        case  10 :
                            eatText4(value);
                            state = 11;
                            return ;
                        case  12 :
                            revertToParentFromText(value);
                            return ;
                        case  9 :
                            state = 12;
                            continue outer;
                        case  1 :
                            eatText2(value);
                            state = 2;
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "value");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 6;
                                continue outer;
                            }
                            break;
                        case  0 :
                            attIdx = context.getAttribute("", "type");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  4 :
                            eatText1(value);
                            state = 5;
                            return ;
                        case  6 :
                            attIdx = context.getAttribute("", "name");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText3(v);
                                state = 9;
                                continue outer;
                            }
                            break;
                        case  7 :
                            eatText3(value);
                            state = 8;
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Comment.add(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
