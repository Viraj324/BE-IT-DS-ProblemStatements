import java.util.*;
import java.rmi.*;
import java.rmi.server.*;

public class Client {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number 1 : ");
        int n2 = sc.nextInt();
        
        try{
            String url = "rmi://localhost/Server";
            ServerIntf sintf = (ServerIntf) Naming.lookup(url);
            System.out.println("The Product : "+sintf.mul(n1, n2));
        }catch(Exception e){
            System.out.println("Error at Client : "+e);
        }
    }
}
