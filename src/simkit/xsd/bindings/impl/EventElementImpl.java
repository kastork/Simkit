//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.03.23 at 11:39:48 PST 
//


package simkit.xsd.bindings.impl;

public class EventElementImpl
    extends simkit.xsd.bindings.impl.EventTypeImpl
    implements simkit.xsd.bindings.EventElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, simkit.xsd.bindings.impl.runtime.UnmarshallableObject, simkit.xsd.bindings.impl.runtime.XMLSerializable, simkit.xsd.bindings.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (simkit.xsd.bindings.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (simkit.xsd.bindings.EventElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Event";
    }

    public simkit.xsd.bindings.impl.runtime.UnmarshallingEventHandler createUnmarshaller(simkit.xsd.bindings.impl.runtime.UnmarshallingContext context) {
        return new simkit.xsd.bindings.impl.EventElementImpl.Unmarshaller(context);
    }

    public void serializeBody(simkit.xsd.bindings.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "Event");
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
        return (simkit.xsd.bindings.EventElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0016\u00ff\u0017>p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0016\u00ff\u00173ppsq\u0000~\u0000\u0007\u0015\u00ddtoppsq\u0000~\u0000\u0007\u0013\u00f0\u00ac\u0013ppsq\u0000~\u0000\u0007\u0010\u00ed\u00f3\u00c4ppsq\u0000~\u0000\u0007\u000b\u00d8\u009a<ppsq\u0000~"
+"\u0000\u0007\u00075\u00c8\u001appsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u0011"
+"ySppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.s"
+"un.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0002\u0011yHsr\u0000\u0011j"
+"ava.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000\u0002\u0011yEq\u0000~\u0000\u0015p\u0000sq\u0000~"
+"\u0000\u0007\u0002\u0011y:ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLo"
+"rg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/su"
+"n/msv/util/StringPair;xq\u0000~\u0000\u0004\u0000\u00ca\u00f6\u00d1q\u0000~\u0000\u0015psr\u0000#com.sun.msv.dataty"
+"pe.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv."
+"datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dat"
+"atype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xs"
+"d.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/Stri"
+"ng;L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd"
+"/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000"
+"\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Pres"
+"erve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProces"
+"sor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.util.Str"
+"ingPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~"
+"\u0000$q\u0000~\u0000#sq\u0000~\u0000\u000f\u0001F\u0082dppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001F\u0082Yq\u0000~\u0000\u0015psq\u0000~\u0000\u0018\u0000\u0081\u00b2\u000b"
+"ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001dq\u0000~"
+"\u0000#t\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$C"
+"ollapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000&q\u0000~\u0000)sq\u0000~\u0000*q\u0000~\u00002q\u0000~\u0000#sr\u0000#com.sun.msv"
+".grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnames"
+"paceURIq\u0000~\u0000 xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000"
+"\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000com.sun"
+".msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000"
+"\u0000\tsq\u0000~\u0000\u0014\u0001psq\u0000~\u00006t\u0000\u0007Commentt\u0000\u0000q\u0000~\u0000<sq\u0000~\u0000\u000f\u0005$N\u00c2ppsq\u0000~\u0000\u0011\u0005$N\u00b7q\u0000~\u0000"
+"\u0015psq\u0000~\u0000\u000f\u0005$N\u00b4q\u0000~\u0000\u0015psq\u0000~\u0000\u0000\u0001\u0081\\\u001dq\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u000f\u0001\u0081\\\u0012ppsq\u0000~\u0000\u0011\u0001\u0081\\\u0007q\u0000~"
+"\u0000\u0015psq\u0000~\u0000-\u0001\u0081\\\u0004q\u0000~\u0000\u0015psr\u00002com.sun.msv.grammar.Expression$AnyStr"
+"ingExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bq\u0000~\u0000=q\u0000~\u0000Isr\u0000 com.sun.msv."
+"grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00007q\u0000~\u0000<sq\u0000~\u00006t\u0000#simkit.xs"
+"d.bindings.ArgumentElementt\u0000+http://java.sun.com/jaxb/xjc/du"
+"mmy-elementssq\u0000~\u0000\u0000\u0003\u00a2\u00f2\u0095q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007\u0003\u00a2\u00f2\u008appsq\u0000~\u0000\u0000\u0001\u0081\\\u001dpp\u0000sq\u0000~\u0000\u000f"
+"\u0001\u0081\\\u0012ppsq\u0000~\u0000\u0011\u0001\u0081\\\u0007q\u0000~\u0000\u0015psq\u0000~\u0000-\u0001\u0081\\\u0004q\u0000~\u0000\u0015pq\u0000~\u0000Iq\u0000~\u0000Kq\u0000~\u0000<sq\u0000~\u00006t"
+"\u0000 simkit.xsd.bindings.ArgumentTypeq\u0000~\u0000Nsq\u0000~\u0000\u000f\u0002!\u0096hppsq\u0000~\u0000-\u0002!\u0096"
+"]q\u0000~\u0000\u0015pq\u0000~\u0000/sq\u0000~\u00006q\u0000~\u00009q\u0000~\u0000:q\u0000~\u0000<sq\u0000~\u00006t\u0000\bArgumentq\u0000~\u0000@q\u0000~\u0000<"
+"sq\u0000~\u0000\u000f\u0004\u00a2\u00d2\u001dppsq\u0000~\u0000\u0011\u0004\u00a2\u00d2\u0012q\u0000~\u0000\u0015psq\u0000~\u0000\u000f\u0004\u00a2\u00d2\u000fq\u0000~\u0000\u0015psq\u0000~\u0000\u0000\u0001\u0081\\\u001dq\u0000~\u0000\u0015p"
+"\u0000sq\u0000~\u0000\u000f\u0001\u0081\\\u0012ppsq\u0000~\u0000\u0011\u0001\u0081\\\u0007q\u0000~\u0000\u0015psq\u0000~\u0000-\u0001\u0081\\\u0004q\u0000~\u0000\u0015pq\u0000~\u0000Iq\u0000~\u0000Kq\u0000~\u0000<"
+"sq\u0000~\u00006t\u0000(simkit.xsd.bindings.LocalVariableElementq\u0000~\u0000Nsq\u0000~\u0000\u0000"
+"\u0003!u\u00f0q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007\u0003!u\u00e5ppsq\u0000~\u0000\u0000\u0001\u0081\\\u001dpp\u0000sq\u0000~\u0000\u000f\u0001\u0081\\\u0012ppsq\u0000~\u0000\u0011\u0001\u0081\\\u0007q\u0000"
+"~\u0000\u0015psq\u0000~\u0000-\u0001\u0081\\\u0004q\u0000~\u0000\u0015pq\u0000~\u0000Iq\u0000~\u0000Kq\u0000~\u0000<sq\u0000~\u00006t\u0000%simkit.xsd.bindi"
+"ngs.LocalVariableTypeq\u0000~\u0000Nsq\u0000~\u0000\u000f\u0001\u00a0\u0019\u00c3ppsq\u0000~\u0000-\u0001\u00a0\u0019\u00b8q\u0000~\u0000\u0015pq\u0000~\u0000/s"
+"q\u0000~\u00006q\u0000~\u00009q\u0000~\u0000:q\u0000~\u0000<sq\u0000~\u00006t\u0000\rLocalVariableq\u0000~\u0000@q\u0000~\u0000<sq\u0000~\u0000\u000f\u0005\u0015"
+"Y\u0083ppsq\u0000~\u0000\u0011\u0005\u0015Yxq\u0000~\u0000\u0015psq\u0000~\u0000\u000f\u0005\u0015Yuq\u0000~\u0000\u0015psq\u0000~\u0000\u0000\u0001\u0081\\\u001dq\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u000f\u0001"
+"\u0081\\\u0012ppsq\u0000~\u0000\u0011\u0001\u0081\\\u0007q\u0000~\u0000\u0015psq\u0000~\u0000-\u0001\u0081\\\u0004q\u0000~\u0000\u0015pq\u0000~\u0000Iq\u0000~\u0000Kq\u0000~\u0000<sq\u0000~\u00006t\u0000"
+"*simkit.xsd.bindings.StateTransitionElementq\u0000~\u0000Nsq\u0000~\u0000\u0000\u0003\u0093\u00fdVq\u0000"
+"~\u0000\u0015p\u0000sq\u0000~\u0000\u0007\u0003\u0093\u00fdKppsq\u0000~\u0000\u0000\u0001\u0081\\\u001dpp\u0000sq\u0000~\u0000\u000f\u0001\u0081\\\u0012ppsq\u0000~\u0000\u0011\u0001\u0081\\\u0007q\u0000~\u0000\u0015psq"
+"\u0000~\u0000-\u0001\u0081\\\u0004q\u0000~\u0000\u0015pq\u0000~\u0000Iq\u0000~\u0000Kq\u0000~\u0000<sq\u0000~\u00006t\u0000\'simkit.xsd.bindings.St"
+"ateTransitionTypeq\u0000~\u0000Nsq\u0000~\u0000\u000f\u0002\u0012\u00a1)ppsq\u0000~\u0000-\u0002\u0012\u00a1\u001eq\u0000~\u0000\u0015pq\u0000~\u0000/sq\u0000~\u0000"
+"6q\u0000~\u00009q\u0000~\u0000:q\u0000~\u0000<sq\u0000~\u00006t\u0000\u000fStateTransitionq\u0000~\u0000@q\u0000~\u0000<sq\u0000~\u0000\u000f\u0003\u0002\u00b8J"
+"ppsq\u0000~\u0000\u0011\u0003\u0002\u00b8?q\u0000~\u0000\u0015psq\u0000~\u0000\u000f\u0003\u0002\u00b8<q\u0000~\u0000\u0015psq\u0000~\u0000\u0000\u0001\u0081\\\u001dq\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u000f\u0001\u0081\\"
+"\u0012ppsq\u0000~\u0000\u0011\u0001\u0081\\\u0007q\u0000~\u0000\u0015psq\u0000~\u0000-\u0001\u0081\\\u0004q\u0000~\u0000\u0015pq\u0000~\u0000Iq\u0000~\u0000Kq\u0000~\u0000<sq\u0000~\u00006t\u0000!s"
+"imkit.xsd.bindings.CancelElementq\u0000~\u0000Nsq\u0000~\u0000\u0000\u0001\u0081\\\u001dq\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u000f"
+"\u0001\u0081\\\u0012ppsq\u0000~\u0000\u0011\u0001\u0081\\\u0007q\u0000~\u0000\u0015psq\u0000~\u0000-\u0001\u0081\\\u0004q\u0000~\u0000\u0015pq\u0000~\u0000Iq\u0000~\u0000Kq\u0000~\u0000<sq\u0000~\u00006t"
+"\u0000#simkit.xsd.bindings.ScheduleElementq\u0000~\u0000Nq\u0000~\u0000<sq\u0000~\u0000-\u0001\u00ec\u00c8Wpps"
+"q\u0000~\u0000\u0018\u0001\u001e\u00b1\u00a9ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.m"
+"sv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001cq\u0000~\u0000#t\u0000\u0002IDq\u0000~\u00004\u0000q\u0000"
+"~\u0000)sq\u0000~\u0000*q\u0000~\u0000\u009dq\u0000~\u0000#sq\u0000~\u00006t\u0000\u0004nameq\u0000~\u0000@sq\u0000~\u0000\u000f\u0001!\u00a2\u00bfppsq\u0000~\u0000-\u0001!\u00a2\u00b4q"
+"\u0000~\u0000\u0015pq\u0000~\u0000/sq\u0000~\u00006q\u0000~\u00009q\u0000~\u0000:q\u0000~\u0000<sq\u0000~\u00006t\u0000\u0005Eventq\u0000~\u0000@sr\u0000\"com.su"
+"n.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/su"
+"n/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gr"
+"ammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresho"
+"ldL\u0000\u0006parentq\u0000~\u0000\u00a7[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;"
+"xp\u0000\u0000\u0000-\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000x"
+"p\u0000\u0000\u0000\u00bfq\u0000~\u0000\tpppq\u0000~\u0000,pq\u0000~\u0000Apq\u0000~\u0000\nppppq\u0000~\u0000Pppppppppppppppppppppp"
+"q\u0000~\u0000\u0017ppppppq\u0000~\u0000Wpppppq\u0000~\u0000\u000bq\u0000~\u0000\u0013ppppppppppq\u0000~\u0000\u0010ppppppppq\u0000~\u0000^p"
+"q\u0000~\u0000\u000eq\u0000~\u0000]ppppppppppq\u0000~\u0000\\ppppppq\u0000~\u0000fppppq\u0000~\u0000\fppppppppppppq\u0000~"
+"\u0000tppq\u0000~\u0000spppppppq\u0000~\u0000mppq\u0000~\u0000rppq\u0000~\u0000\u008appq\u0000~\u0000\u0089q\u0000~\u0000|pppppq\u0000~\u0000Fq\u0000~"
+"\u0000Sq\u0000~\u0000aq\u0000~\u0000iq\u0000~\u0000wq\u0000~\u0000\u007fq\u0000~\u0000\u008dq\u0000~\u0000\u0093q\u0000~\u0000\u0088ppq\u0000~\u0000Eq\u0000~\u0000Rq\u0000~\u0000`q\u0000~\u0000hq"
+"\u0000~\u0000vq\u0000~\u0000~q\u0000~\u0000\u008cq\u0000~\u0000\u0092ppppq\u0000~\u0000\u0083q\u0000~\u0000\rppppppppppppppppppq\u0000~\u0000\u00a1pppp"
+"q\u0000~\u0000Cppq\u0000~\u0000Bpppp"));
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
            return simkit.xsd.bindings.impl.EventElementImpl.this;
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
                    case  1 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("Event" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
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
                    case  2 :
                        if (("Event" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "name");
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
                        if (("name" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((simkit.xsd.bindings.impl.EventTypeImpl)simkit.xsd.bindings.impl.EventElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("", "name");
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
                            attIdx = context.getAttribute("", "name");
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
