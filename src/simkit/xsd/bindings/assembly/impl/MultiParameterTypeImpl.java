//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.04.02 at 03:27:54 PST 
//


package simkit.xsd.bindings.assembly.impl;

public class MultiParameterTypeImpl implements simkit.xsd.bindings.assembly.MultiParameterType, com.sun.xml.bind.JAXBObject, simkit.xsd.bindings.assembly.impl.runtime.UnmarshallableObject, simkit.xsd.bindings.assembly.impl.runtime.XMLSerializable, simkit.xsd.bindings.assembly.impl.runtime.ValidatableObject
{

    protected java.lang.String _Type;
    protected com.sun.xml.bind.util.ListImpl _Parameters = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (simkit.xsd.bindings.assembly.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (simkit.xsd.bindings.assembly.MultiParameterType.class);
    }

    public java.lang.String getType() {
        return _Type;
    }

    public void setType(java.lang.String value) {
        _Type = value;
    }

    public java.util.List getParameters() {
        return _Parameters;
    }

    public simkit.xsd.bindings.assembly.impl.runtime.UnmarshallingEventHandler createUnmarshaller(simkit.xsd.bindings.assembly.impl.runtime.UnmarshallingContext context) {
        return new simkit.xsd.bindings.assembly.impl.MultiParameterTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(simkit.xsd.bindings.assembly.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Parameters.size();
        while (idx2 != len2) {
            if (_Parameters.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Parameters.get(idx2 ++)), "Parameters");
            } else {
                context.startElement("", "Parameters");
                int idx_0 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Parameters.get(idx_0 ++)), "Parameters");
                context.endNamespaceDecls();
                int idx_1 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Parameters.get(idx_1 ++)), "Parameters");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Parameters.get(idx2 ++)), "Parameters");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(simkit.xsd.bindings.assembly.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Parameters.size();
        context.startAttribute("", "type");
        try {
            context.text(((java.lang.String) _Type), "Type");
        } catch (java.lang.Exception e) {
            simkit.xsd.bindings.assembly.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        while (idx2 != len2) {
            if (_Parameters.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Parameters.get(idx2 ++)), "Parameters");
            } else {
                idx2 += 1;
            }
        }
    }

    public void serializeURIs(simkit.xsd.bindings.assembly.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Parameters.size();
        while (idx2 != len2) {
            if (_Parameters.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Parameters.get(idx2 ++)), "Parameters");
            } else {
                idx2 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (simkit.xsd.bindings.assembly.MultiParameterType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0002\u00bd\u0081\u0089ppsr\u0000\u001dcom.sun.msv.gra"
+"mmar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0000\u00b0\\2ppsr\u0000 com.sun.msv.grammar"
+".OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00b0\\\'sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001"
+"Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0006\u0000\u00b0\\$q\u0000~\u0000\fpsq\u0000~\u0000\u0006\u0000u\u0092\u00c2q\u0000~\u0000\fpsr\u0000\'com.sun.msv."
+"grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/su"
+"n/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq"
+"\u0000~\u0000\u0003\u0000:\u00c9`q\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0006\u0000:\u00c9Uppsq\u0000~\u0000\b\u0000:\u00c9Jq\u0000~\u0000\fpsr\u0000 com.sun.msv.g"
+"rammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0010xq"
+"\u0000~\u0000\u0003\u0000:\u00c9Gq\u0000~\u0000\fpsr\u00002com.sun.msv.grammar.Expression$AnyStringEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000b\u0001psr\u0000 com.sun.msv.grammar"
+".AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressi"
+"on\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019psr\u0000#com.sun.msv.grammar.SimpleN"
+"ameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnames"
+"paceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000-simkit.xsd.bindings.assembly.FactoryPar"
+"ametert\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000f\u0000:"
+"\u00c9`q\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0006\u0000:\u00c9Uppsq\u0000~\u0000\b\u0000:\u00c9Jq\u0000~\u0000\fpsq\u0000~\u0000\u0015\u0000:\u00c9Gq\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000"
+"~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+simkit.xsd.bindings.assembly.MultiParameter"
+"q\u0000~\u0000#sq\u0000~\u0000\u000f\u0000:\u00c9`q\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0006\u0000:\u00c9Uppsq\u0000~\u0000\b\u0000:\u00c9Jq\u0000~\u0000\fpsq\u0000~\u0000\u0015\u0000:\u00c9G"
+"q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.simkit.xsd.bindings.assembly.T"
+"erminalParameterq\u0000~\u0000#q\u0000~\u0000\u001esq\u0000~\u0000\u0015\u0002\r%Rppsr\u0000\u001bcom.sun.msv.gramma"
+"r.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L"
+"\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001m"
+"\'\u0012ppsr\u0000%com.sun.msv.datatype.xsd.SimpleURType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*"
+"com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com"
+".sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv"
+".datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L"
+"\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/Whi"
+"teSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\rany"
+"SimpleTypesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$P"
+"reserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpacePro"
+"cessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSe"
+"tExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\fpsr\u0000\u001bcom.sun.msv.util.S"
+"tringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq"
+"\u0000~\u0000<q\u0000~\u0000;sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000\u0000sr\u0000\"com.sun.msv.grammar.ExpressionP"
+"ool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionP"
+"ool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Clos"
+"edHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000H[\u0000\u0005tablet"
+"\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u000b\u0000\u0000\u00009pur\u0000![Lcom.sun."
+"msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppq\u0000~\u0000\u0005ppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000"
+"\rppq\u0000~\u0000\nppppppppppq\u0000~\u0000\u0007pq\u0000~\u0000\u0014q\u0000~\u0000&q\u0000~\u0000,q\u0000~\u0000\u000epppppppq\u0000~\u0000\u0013q\u0000~\u0000"
+"%q\u0000~\u0000+ppppppppppppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends simkit.xsd.bindings.assembly.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(simkit.xsd.bindings.assembly.impl.runtime.UnmarshallingContext context) {
            super(context, "-------");
        }

        protected Unmarshaller(simkit.xsd.bindings.assembly.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return simkit.xsd.bindings.assembly.impl.MultiParameterTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        if (("FactoryParameter" == ___local)&&("" == ___uri)) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.FactoryParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.FactoryParameterImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("MultiParameter" == ___local)&&("" == ___uri)) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.MultiParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.MultiParameterImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("TerminalParameter" == ___local)&&("" == ___uri)) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.TerminalParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.TerminalParameterImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Parameters" == ___local)&&("" == ___uri)) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.ParametersImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.ParametersImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Parameters" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (true) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.AnyTypeImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.AnyTypeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _Parameters.add(((simkit.xsd.bindings.assembly.impl.AnyTypeImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.AnyTypeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  3 :
                        if (("FactoryParameter" == ___local)&&("" == ___uri)) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.FactoryParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.FactoryParameterImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("MultiParameter" == ___local)&&("" == ___uri)) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.MultiParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.MultiParameterImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("TerminalParameter" == ___local)&&("" == ___uri)) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.TerminalParameterImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.TerminalParameterImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Parameters" == ___local)&&("" == ___uri)) {
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.ParametersImpl) spawnChildFromEnterElement((simkit.xsd.bindings.assembly.impl.ParametersImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Parameters" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        state = 6;
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
                _Type = value;
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
                    case  4 :
                        _Parameters.add(((simkit.xsd.bindings.assembly.impl.AnyTypeImpl) spawnChildFromLeaveElement((simkit.xsd.bindings.assembly.impl.AnyTypeImpl.class), 5, ___uri, ___local, ___qname)));
                        return ;
                    case  5 :
                        if (("Parameters" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  3 :
                        state = 6;
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
                    case  6 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        _Parameters.add(((simkit.xsd.bindings.assembly.impl.AnyTypeImpl) spawnChildFromEnterAttribute((simkit.xsd.bindings.assembly.impl.AnyTypeImpl.class), 5, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        if (("type" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
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
                    case  6 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        _Parameters.add(((simkit.xsd.bindings.assembly.impl.AnyTypeImpl) spawnChildFromLeaveAttribute((simkit.xsd.bindings.assembly.impl.AnyTypeImpl.class), 5, ___uri, ___local, ___qname)));
                        return ;
                    case  2 :
                        if (("type" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
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
                        case  4 :
                            _Parameters.add(((simkit.xsd.bindings.assembly.impl.AnyTypeImpl) spawnChildFromText((simkit.xsd.bindings.assembly.impl.AnyTypeImpl.class), 5, value)));
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "type");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                        case  3 :
                            state = 6;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
