import java.util.*;
import java.rmi.*;
import java.rmi.server.*;

public class Server {
    public static void main(String args[]){

        try{
            ServerImpl simpl = new ServerImpl();
            Naming.rebind("Server", simpl);
            System.out.println("Server Started..!!");
        }catch(Exception e){
            System.out.println("Error at Server : "+e.getMessage());
        }
    }
}
