import java.util.*;
import java.rmi.*;

public class Client {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1 = sc.next();
        System.out.println("Enter String 2 : ");
        String s2 = sc.next();
        try{
            String url = "rmi://localhost/Server";
            ServerIntf sinf = (ServerIntf) Naming.lookup(url);
            System.out.println("lexicographically Largest string : "+sinf.compareStr(s1, s2));

        }catch(Exception e){
            System.out.println("Error at Client "+ e);
        }
    }    
}
