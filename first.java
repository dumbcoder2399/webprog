package Client;
import java.util.Scanner;
public class First {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Client.Calculator_Service service = new Client.Calculator_Service();
        Client.Calculator port = service.getCalculatorPort();
        System.out.println("Enter First Value");
        double first=sc.nextDouble();
        System.out.println("Enter Second Value");
        double second=sc.nextDouble();
        System.out.println("Enter Operator Value");
        String opr=sc.next();
        char op=opr.charAt(0);
        System.out.println( port.cal(first, second, op));  
    }
}