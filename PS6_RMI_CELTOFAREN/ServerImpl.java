import java.util.*;
import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf{
    
    public ServerImpl() throws RemoteException{

    }

    public double celToFaren(double temp) throws RemoteException{

        return (temp * 9/5)  + 32;
    }

    public double farenToCel(double temp) throws RemoteException{

        return (temp * 9/5)  + 32;
    }
}
