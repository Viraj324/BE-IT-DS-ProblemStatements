import java.util.*;
import java.rmi.*;

interface ServerIntf extends Remote {
    public int add(int n1,int n2) throws RemoteException;
}



//Steps to run 
/*
 * 1) Open terminal 1
 * run "javac *.java"
 * then run "rmiresgistry"
 * 
 * 2) Open terminal 2 
 * run "java server"
 * 
 * 3) Open terminal 3 
 * run "java client"
 * enter the input 
 * ans the ouptut will be displayed 
 *
 */
