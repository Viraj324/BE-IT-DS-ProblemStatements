import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
public class ServerImpl extends UnicastRemoteObject implements ServerIntf{
    public ServerImpl() throws RemoteException{

    }

    public String compareStr(String s1,String s2){
        if(s1.length() > s2.length()){
            return s1;
        }else{
            return s2;
        }
    }
}
