//1.6) Celsius to Fahrenheit Conversion Server: Implement multi-threaded client/server 
//Process communication using RMI for Celsius to Fahrenheit Conversion Server 
//on 2 different machines. 


import java.util.*;
import java.rmi.*;

interface ServerIntf extends Remote {

    public double celToFaren(double temp) throws RemoteException;
    public double farenToCel(double temp) throws RemoteException;
}