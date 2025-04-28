import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1)  Celsius to Fahrenheit ");
        System.out.println("2)  Fahrenheit to Celcius ");
        System.out.println("Enter Your choice : ");
        int ch = sc.nextInt();

        try{
            String url = "rmi://localhost/Server";
            ServerIntf sintf = (ServerIntf) Naming.lookup(url);
            switch(ch){
                case 1 : 
                    System.out.println("Enter the temp in Celcius : ");
                    double temp = sc.nextDouble();
                    System.out.println("Temp in Fahrenheit : "+ sintf.celToFaren(temp));
                    break;
                case 2 : 
                    System.out.println("Enter the temp in Fahrenheit : ");
                    double temp2 = sc.nextDouble();
                    System.out.println("Temp in Celcius : "+sintf.celToFaren(temp2));
                    break;
                default: 
                    System.out.println("Invalid input..!!");
            }
        }catch(Exception e){
            System.out.println("Error at client : "+e);
        }
    }
}
