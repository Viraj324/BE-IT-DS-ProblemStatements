import java.util.*;
import java.rmi.*;

interface ServerIntf extends Remote {
    public int add(int n1,int n2) throws RemoteException;
}