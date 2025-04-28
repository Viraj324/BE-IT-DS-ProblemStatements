// 1.2) Multiplication Server: Implement multi-threaded client/server Process communication using RMI for Multiplication of Numbers on 2 different machines.
import java.util.*;
import java.rmi.*;

public interface ServerIntf extends Remote{
    public int mul(int n1,int n2) throws RemoteException;
}