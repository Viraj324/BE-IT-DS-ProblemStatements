import java.util.*;
import java.rmi.*;

interface ServerIntf extends Remote{
    public String compareStr(String s1,String s2) throws RemoteException;
}