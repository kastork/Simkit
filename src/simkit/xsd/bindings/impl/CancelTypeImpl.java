//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.04.15 at 03:17:15 PDT 
//


package simkit.xsd.bindings.impl;

public class CancelTypeImpl implements simkit.xsd.bindings.CancelType, com.sun.xml.bind.JAXBObject, simkit.xsd.bindings.impl.runtime.UnmarshallableObject, simkit.xsd.bindings.impl.runtime.XMLSerializable, simkit.xsd.bindings.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _EdgeParameter = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected java.lang.String _Condition;
    protected java.lang.Object _Event;
    public final static java.lang.Class version = (simkit.xsd.bindings.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (simkit.xsd.bindings.CancelType.class);
    }

    public java.util.List getEdgeParameter() {
        return _EdgeParameter;
    }

    public java.lang.String getCondition() {
        return _Condition;
    }

    public void setCondition(java.lang.String value) {
        _Condition = value;
    }

    public java.lang.Object getEvent() {
        return _Event;
    }

    public void setEvent(java.lang.Object value) {
        _Event = value;
    }

    public simkit.xsd.bindings.impl.runtime.UnmarshallingEventHandler createUnmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
        return new simkit.xsd.bindings.impl.CancelTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _EdgeParameter.size();
        while (idx1 != len1) {
            if (_EdgeParameter.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx1 ++)), "EdgeParameter");
            } else {
                context.startElement("", "EdgeParameter");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx_0 ++)), "EdgeParameter");
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx_1 ++)), "EdgeParameter");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx1 ++)), "EdgeParameter");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _EdgeParameter.size();
        if (_Condition!= null) {
            context.startAttribute("", "condition");
            try {
                context.text(((java.lang.String) _Condition), "Condition");
            } catch (java.lang.Exception e) {
                simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        context.startAttribute("", "event");
        try {
            context.text(context.onIDREF(((com.sun.xml.bind.marshaller.IdentifiableObject)((java.lang.Object) _Event))), "Event");
        } catch (java.lang.Exception e) {
            simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        while (idx1 != len1) {
            if (_EdgeParameter.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx1 ++)), "EdgeParameter");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _EdgeParameter.size();
        while (idx1 != len1) {
            if (_EdgeParameter.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx1 ++)), "EdgeParameter");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (simkit.xsd.bindings.CancelType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0007\u0084V\'ppsq\u0000~\u0000\u0000\u0005;*\u0091ppsr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0002J\u0081~ppsr\u0000 com.sun"
+".msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar."
+"UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0002J\u0081ssr\u0000\u0011java.lang.Boolea"
+"n\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0007\u0002J\u0081pq\u0000~\u0000\rpsr\u0000\'com.sun.msv.gram"
+"mar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/ms"
+"v/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003"
+"\u0000w\u0082wq\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0007\u0000w\u0082lppsq\u0000~\u0000\t\u0000w\u0082aq\u0000~\u0000\rpsr\u0000 com.sun.msv.gramm"
+"ar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0010xq\u0000~\u0000\u0003"
+"\u0000w\u0082^q\u0000~\u0000\rpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\f\u0001psr\u0000 com.sun.msv.grammar.Any"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019psr\u0000#com.sun.msv.grammar.SimpleNameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespace"
+"URIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000!simkit.xsd.bindings.EdgeParametert\u0000+http://"
+"java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000f\u0001\u00d2\u00fe\u00f7q\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0000\u0001"
+"\u00d2\u00fe\u00ecppsq\u0000~\u0000\u000f\u0000w\u0082wpp\u0000sq\u0000~\u0000\u0007\u0000w\u0082lppsq\u0000~\u0000\t\u0000w\u0082aq\u0000~\u0000\rpsq\u0000~\u0000\u0015\u0000w\u0082^q\u0000~\u0000"
+"\rpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000%simkit.xsd.bindings.EdgeParameterT"
+"ypeq\u0000~\u0000#sq\u0000~\u0000\u0007\u0001[|pppsq\u0000~\u0000\u0015\u0001[|eq\u0000~\u0000\rpsr\u0000\u001bcom.sun.msv.grammar."
+"DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006"
+"exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0000\u00c0\u00f1\u00fc"
+"ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.s"
+"un.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun."
+"msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.data"
+"type.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btyp"
+"eNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpa"
+"ceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u0000"
+"5com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00009q\u0000~\u00008sq\u0000~\u0000\u001ft\u0000"
+"\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001f"
+"t\u0000\rEdgeParametert\u0000\u0000q\u0000~\u0000\u001esq\u0000~\u0000\u0007\u0002\u00f0\u00a9\u000eppsq\u0000~\u0000\u0015\u0002\u00f0\u00a9\u0003q\u0000~\u0000\rpsq\u0000~\u0000.\u0001\u00ed"
+"\u001b\u001bppsr\u0000%com.sun.msv.datatype.xsd.SimpleURType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u00003q\u0000~\u00008t\u0000\ranySimpleTypesr\u00005com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000Lq\u0000~\u00008sq"
+"\u0000~\u0000\u001ft\u0000\tconditionq\u0000~\u0000Fq\u0000~\u0000\u001esq\u0000~\u0000\u0015\u0002I+\u0091ppsq\u0000~\u0000.\u0001\u00ef\u00b4\u00ceppsr\u0000\"com.su"
+"n.msv.datatype.xsd.IDREFType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datat"
+"ype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.To"
+"kenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00003q\u0000~\u00008t\u0000\u0005IDREFq\u0000~\u0000<\u0000q\u0000~\u0000>sq\u0000~\u0000?"
+"q\u0000~\u0000Yq\u0000~\u00008sq\u0000~\u0000\u001ft\u0000\u0005eventq\u0000~\u0000Fsr\u0000\"com.sun.msv.grammar.Express"
+"ionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Express"
+"ionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$"
+"ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000^[\u0000\u0005ta"
+"blet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\f\u0000\u0000\u00009pur\u0000![Lcom."
+"sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppq\u0000~\u0000\u000ep"
+"pq\u0000~\u0000\u000bpq\u0000~\u0000\u0014q\u0000~\u0000(pppppppq\u0000~\u0000\bpq\u0000~\u0000\u0013q\u0000~\u0000\'q\u0000~\u0000Gpq\u0000~\u0000\u0005ppppppppp"
+"ppppppppppppppppq\u0000~\u0000\u0006ppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppq\u0000~\u0000,pppppppppppppppppppppppppppppppppppppppppq"
+"\u0000~\u0000%ppppppppppppppppppppppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends simkit.xsd.bindings.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return simkit.xsd.bindings.impl.CancelTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "condition");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            _EdgeParameter.add(((simkit.xsd.bindings.impl.EdgeParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.impl.EdgeParameterImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  6 :
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            _EdgeParameter.add(((simkit.xsd.bindings.impl.EdgeParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.impl.EdgeParameterImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
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
                        _Event = ((java.lang.Object) context.getObjectFromId(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value)));
                    }

                }
                );
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Condition = value;
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
                    case  7 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  8 :
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "condition");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        state = 9;
                        continue outer;
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
                    case  7 :
                        if (("value" == ___local)&&("" == ___uri)) {
                            _EdgeParameter.add(((simkit.xsd.bindings.impl.EdgeParameterTypeImpl) spawnChildFromEnterAttribute((simkit.xsd.bindings.impl.EdgeParameterTypeImpl.class), 8, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  3 :
                        if (("event" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        if (("condition" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        state = 9;
                        continue outer;
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
                    case  7 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        if (("condition" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "condition");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  9 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  5 :
                        if (("event" == ___local)&&("" == ___uri)) {
                            state = 6;
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
                        case  7 :
                            attIdx = context.getAttribute("", "value");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  3 :
                            attIdx = context.getAttribute("", "event");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 6;
                                continue outer;
                            }
                            break;
                        case  0 :
                            attIdx = context.getAttribute("", "condition");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  9 :
                            revertToParentFromText(value);
                            return ;
                        case  6 :
                            state = 9;
                            continue outer;
                        case  4 :
                            eatText1(value);
                            state = 5;
                            return ;
                        case  1 :
                            eatText2(value);
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
