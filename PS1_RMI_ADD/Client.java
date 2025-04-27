import java.util.*;
import java.rmi.*;
public class Client {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter String 2 : ");
        int n2 = sc.nextInt();
        try{
            String url = "rmi://localhost/Server";
            ServerIntf sinf = (ServerIntf) Naming.lookup(url);
            System.out.println("Largest string : "+ sinf.add(n1, n2));
        }catch(Exception e){
            System.out.println("Error at client : "+e);
        }
    }
}
