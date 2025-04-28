package ReverseModule;

public abstract class ReversePOA extends org.omg.PortableServer.Servant implements ReverseModule.ReverseOperations, org.omg.CORBA.portable.InvokeHandler {

    public ReverseModule.Reverse _this() {
        return ReverseModule.ReverseHelper.narrow(
super._this_object());
    }

    public ReverseModule.Reverse _this(org.omg.CORBA.ORB orb) {
        return ReverseModule.ReverseHelper.narrow(super._this_object(orb));
    }

    private static String[] __ids = { "IDL:ReverseModule/Reverse:1.0" };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectId) {
        return (String[]) __ids.clone();
    }
}