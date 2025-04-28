import java.util.*;
import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf{
    
    public ServerImpl() throws RemoteException{

    }

    public int mul(int n1,int n2) throws RemoteException{
        return n1 * n2;
    }
}
