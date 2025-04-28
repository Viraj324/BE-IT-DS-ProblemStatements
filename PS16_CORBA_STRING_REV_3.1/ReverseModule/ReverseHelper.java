package ReverseModule;

abstract public class ReverseHelper {
    private static String _id = "IDL:ReverseModule/Reverse:1.0";

    public static void insert(final org.omg.CORBA.Any a, final ReverseModule.Reverse that) {
        throw new org.omg.CORBA.MARSHAL();
    }

    public static ReverseModule.Reverse extract(final org.omg.CORBA.Any a) {
        throw new org.omg.CORBA.MARSHAL();
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;

    public static org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            __typeCode = org.omg.CORBA.ORB.init().create_interface_tc(ReverseHelper.id(), "Reverse");
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static ReverseModule.Reverse read(final org.omg.CORBA.portable.InputStream istream) {
        return narrow(istream.read_Object(_ReverseStub.class));
    }

    public static void write(final org.omg.CORBA.portable.OutputStream ostream, final ReverseModule.Reverse value) {
        ostream.write_Object((org.omg.CORBA.Object) value);
    }

    public static ReverseModule.Reverse narrow(final java.lang.Object obj) {
        if (obj == null)
            return null;
        else if (obj instanceof ReverseModule.Reverse)
            return (ReverseModule.Reverse) obj;
        else
            throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
    }

    public static ReverseModule.Reverse narrow(final org.omg.CORBA.Object obj) {
        if (obj == null)
            return null;
        else if (obj instanceof ReverseModule.Reverse)
            return (ReverseModule.Reverse) obj;
        else
            throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
    }
}
