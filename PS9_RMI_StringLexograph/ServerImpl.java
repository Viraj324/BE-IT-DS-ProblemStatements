import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
public class ServerImpl extends UnicastRemoteObject implements ServerIntf{
    public ServerImpl() throws RemoteException{

    }

    public String compareStr(String s1,String s2){
        String larger = s1.compareTo(s2) > 0 ? s1 : s2;
        return larger;
    }
}
