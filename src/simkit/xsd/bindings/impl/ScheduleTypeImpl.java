//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.03.24 at 03:22:43 PST 
//


package simkit.xsd.bindings.impl;

public class ScheduleTypeImpl implements simkit.xsd.bindings.ScheduleType, com.sun.xml.bind.JAXBObject, simkit.xsd.bindings.impl.runtime.UnmarshallableObject, simkit.xsd.bindings.impl.runtime.XMLSerializable, simkit.xsd.bindings.impl.runtime.ValidatableObject
{

    protected java.lang.String _Delay;
    protected com.sun.xml.bind.util.ListImpl _EdgeParameter = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected java.lang.String _Condition;
    protected java.lang.Object _Event;
    protected java.lang.String _Priority;
    public final static java.lang.Class version = (simkit.xsd.bindings.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (simkit.xsd.bindings.ScheduleType.class);
    }

    public java.lang.String getDelay() {
        if (_Delay == null) {
            return "0.0";
        } else {
            return _Delay;
        }
    }

    public void setDelay(java.lang.String value) {
        _Delay = value;
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

    public java.lang.String getPriority() {
        if (_Priority == null) {
            return "0.0";
        } else {
            return _Priority;
        }
    }

    public void setPriority(java.lang.String value) {
        _Priority = value;
    }

    public simkit.xsd.bindings.impl.runtime.UnmarshallingEventHandler createUnmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
        return new simkit.xsd.bindings.impl.ScheduleTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _EdgeParameter.size();
        while (idx2 != len2) {
            if (_EdgeParameter.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx2 ++)), "EdgeParameter");
            } else {
                context.startElement("", "EdgeParameter");
                int idx_0 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx_0 ++)), "EdgeParameter");
                context.endNamespaceDecls();
                int idx_1 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx_1 ++)), "EdgeParameter");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx2 ++)), "EdgeParameter");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _EdgeParameter.size();
        if (_Delay!= null) {
            context.startAttribute("", "delay");
            try {
                context.text(((java.lang.String) _Delay), "Delay");
            } catch (java.lang.Exception e) {
                simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Condition!= null) {
            context.startAttribute("", "condition");
            try {
                context.text(((java.lang.String) _Condition), "Condition");
            } catch (java.lang.Exception e) {
                simkit.xsd.bindings.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Priority!= null) {
            context.startAttribute("", "priority");
            try {
                context.text(((java.lang.String) _Priority), "Priority");
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
        while (idx2 != len2) {
            if (_EdgeParameter.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx2 ++)), "EdgeParameter");
            } else {
                idx2 += 1;
            }
        }
    }

    public void serializeURIs(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _EdgeParameter.size();
        while (idx2 != len2) {
            if (_EdgeParameter.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EdgeParameter.get(idx2 ++)), "EdgeParameter");
            } else {
                idx2 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (simkit.xsd.bindings.ScheduleType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\nC\u008a\u00fbppsq\u0000~\u0000\u0000\u0007\u00e9^0ppsq\u0000~\u0000\u0000\u0004"
+"\u00ed\u00f0\u00ecppsq\u0000~\u0000\u0000\u0002\u00b5^Lppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0001\u0000\u00bc$\fppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003"
+"\u0000\u00bc$\u0001sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\t\u0000\u00bc#\u00feq\u0000"
+"~\u0000\u000fpsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u00000.\u0089q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\t\u00000.~ppsq\u0000~\u0000\u000b\u00000.sq\u0000~"
+"\u0000\u000fpsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000"
+"\u0002L\u0000\tnameClassq\u0000~\u0000\u0012xq\u0000~\u0000\u0003\u00000.pq\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Ex"
+"pression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001psr\u0000"
+" com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv."
+"grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expres"
+"sion$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u001bpsr\u0000#com.sun"
+".msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/"
+"lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000!simkit.xsd.bindings"
+".EdgeParametert\u0000+http://java.sun.com/jaxb/xjc/dummy-elements"
+"sq\u0000~\u0000\u0011\u0000\u008b\u00f5sq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000\u0000\u008b\u00f5hppsq\u0000~\u0000\u0011\u00000.\u0089pp\u0000sq\u0000~\u0000\t\u00000.~ppsq\u0000~\u0000\u000b"
+"\u00000.sq\u0000~\u0000\u000fpsq\u0000~\u0000\u0017\u00000.pq\u0000~\u0000\u000fpq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%simkit.xsd"
+".bindings.EdgeParameterTypeq\u0000~\u0000%sq\u0000~\u0000\t\u0000[\u00c6\u00dappsq\u0000~\u0000\u0017\u0000[\u00c6\u00cfq\u0000~\u0000\u000fp"
+"sr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relax"
+"ng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/ut"
+"il/StringPair;xq\u0000~\u0000\u0003\u0000\n\u00b4Tppsr\u0000\"com.sun.msv.datatype.xsd.Qname"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000"
+"\fnamespaceUriq\u0000~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom/sun/m"
+"sv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2"
+"001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpace"
+"Processor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Wh"
+"iteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expres"
+"sion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.msv"
+".util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespaceURIq"
+"\u0000~\u0000\"xpq\u0000~\u0000;q\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSc"
+"hema-instanceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\rEdgeParametert\u0000\u0000q\u0000~\u0000 sq\u0000~\u0000\t\u0001\u00f9:;pp"
+"sq\u0000~\u0000\u0017\u0001\u00f9:0q\u0000~\u0000\u000fpsq\u0000~\u00000\u0001\u00cft\u00a1ppsr\u0000%com.sun.msv.datatype.xsd.Sim"
+"pleURType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00005q\u0000~\u0000:t\u0000\ranySimpleTypesr\u00005com.sun.m"
+"sv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"=q\u0000~\u0000@sq\u0000~\u0000Aq\u0000~\u0000Nq\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0005delayq\u0000~\u0000Hq\u0000~\u0000 sq\u0000~\u0000\t\u00028\u0092\u009bppsq"
+"\u0000~\u0000\u0017\u00028\u0092\u0090q\u0000~\u0000\u000fpq\u0000~\u0000Ksq\u0000~\u0000!t\u0000\tconditionq\u0000~\u0000Hq\u0000~\u0000 sq\u0000~\u0000\t\u0002\u00fbm?pps"
+"q\u0000~\u0000\u0017\u0002\u00fbm4q\u0000~\u0000\u000fpq\u0000~\u0000Ksq\u0000~\u0000!t\u0000\bpriorityq\u0000~\u0000Hq\u0000~\u0000 sq\u0000~\u0000\u0017\u0002Z,\u00c6pps"
+"q\u0000~\u00000\u0000\u008d\u00dc\\ppsr\u0000\"com.sun.msv.datatype.xsd.IDREFType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.su"
+"n.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datat"
+"ype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00005q\u0000~\u0000:t\u0000\u0005I"
+"DREFq\u0000~\u0000>\u0000q\u0000~\u0000@sq\u0000~\u0000Aq\u0000~\u0000cq\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0005eventq\u0000~\u0000Hsr\u0000\"com.su"
+"n.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/su"
+"n/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gr"
+"ammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresho"
+"ldL\u0000\u0006parentq\u0000~\u0000h[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;"
+"xp\u0000\u0000\u0000\u0010\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000x"
+"p\u0000\u0000\u0000\u00bfpppppppq\u0000~\u0000\u0016q\u0000~\u0000*ppppppppq\u0000~\u0000\u0006q\u0000~\u0000\u0015q\u0000~\u0000)ppppppppppppppp"
+"pppppppppppppppppppppppq\u0000~\u0000Xpppppppppppppppppppppppppppppppp"
+"pq\u0000~\u0000.pppppppppppppppppppppppppq\u0000~\u0000\u0005pppppppq\u0000~\u0000\'pppppppppppp"
+"ppppppq\u0000~\u0000\u0007ppppppppppppppq\u0000~\u0000\bpppq\u0000~\u0000Ipppq\u0000~\u0000\u0010ppq\u0000~\u0000\rq\u0000~\u0000Tpp"
+"pppppppq\u0000~\u0000\npppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends simkit.xsd.bindings.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
            super(context, "----------------");
        }

        protected Unmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return simkit.xsd.bindings.impl.ScheduleTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  12 :
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            _EdgeParameter.add(((simkit.xsd.bindings.impl.EdgeParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.impl.EdgeParameterImpl.class), 13, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 14;
                            return ;
                        }
                        state = 13;
                        continue outer;
                    case  14 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "condition");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  9 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 12;
                            continue outer;
                        }
                        break;
                    case  13 :
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            _EdgeParameter.add(((simkit.xsd.bindings.impl.EdgeParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.impl.EdgeParameterImpl.class), 13, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 14;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "delay");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "priority");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 9;
                            continue outer;
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
                _Condition = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
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

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Delay = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Priority = value;
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
                    case  15 :
                        if (("EdgeParameter" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 13;
                            return ;
                        }
                        break;
                    case  12 :
                        state = 13;
                        continue outer;
                    case  14 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "condition");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  9 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 12;
                            continue outer;
                        }
                        break;
                    case  13 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "delay");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "priority");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 9;
                            continue outer;
                        }
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
                    case  12 :
                        state = 13;
                        continue outer;
                    case  14 :
                        if (("value" == ___local)&&("" == ___uri)) {
                            _EdgeParameter.add(((simkit.xsd.bindings.impl.EdgeParameterTypeImpl) spawnChildFromEnterAttribute((simkit.xsd.bindings.impl.EdgeParameterTypeImpl.class), 15, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  3 :
                        if (("condition" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  9 :
                        if (("event" == ___local)&&("" == ___uri)) {
                            state = 10;
                            return ;
                        }
                        break;
                    case  13 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("delay" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        if (("priority" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
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
                    case  12 :
                        state = 13;
                        continue outer;
                    case  11 :
                        if (("event" == ___local)&&("" == ___uri)) {
                            state = 12;
                            return ;
                        }
                        break;
                    case  14 :
                        attIdx = context.getAttribute("", "value");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "condition");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  8 :
                        if (("priority" == ___local)&&("" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("", "event");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 12;
                            continue outer;
                        }
                        break;
                    case  13 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "delay");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  5 :
                        if (("condition" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "priority");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  2 :
                        if (("delay" == ___local)&&("" == ___uri)) {
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
                        case  12 :
                            state = 13;
                            continue outer;
                        case  7 :
                            eatText4(value);
                            state = 8;
                            return ;
                        case  1 :
                            eatText3(value);
                            state = 2;
                            return ;
                        case  14 :
                            attIdx = context.getAttribute("", "value");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  3 :
                            attIdx = context.getAttribute("", "condition");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 6;
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  10 :
                            eatText2(value);
                            state = 11;
                            return ;
                        case  9 :
                            attIdx = context.getAttribute("", "event");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 12;
                                continue outer;
                            }
                            break;
                        case  13 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "delay");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText3(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  6 :
                            attIdx = context.getAttribute("", "priority");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText4(v);
                                state = 9;
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  4 :
                            eatText1(value);
                            state = 5;
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
