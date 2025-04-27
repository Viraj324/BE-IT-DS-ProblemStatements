import java.util.*;
import java.rmi.RemoteException;
import java.rmi.server.*;
public class ServerImpl extends UnicastRemoteObject implements ServerIntf{

    public ServerImpl() throws RemoteException{

    }
    
    public int add(int n1, int n2) throws RemoteException {
        return n1+n2;
    }
    
}
