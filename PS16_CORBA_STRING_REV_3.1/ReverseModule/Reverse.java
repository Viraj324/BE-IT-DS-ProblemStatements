package ReverseModule;

public interface Reverse extends org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity {
    String reverse_string(String str);
}
