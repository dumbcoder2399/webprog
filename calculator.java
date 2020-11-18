package Server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Calculator")
public class Calculator {
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "cal")
    public Double cal(@WebParam(name = "first") double first, @WebParam(name = "second") double second, @WebParam(name = "op") char op) {
        //TODO write your implementation code here:
        switch(op)
        {
            case '+':
            {
                double ans;
                ans=first+second;
                return ans;
            }
            case '-':
            {
                double ans;
                ans=first-second;
                return ans;
            }
            case '*':
            {
                double ans;
                ans=first*second;
                return ans;
            }
            case '/':
            {
                double ans;
                ans=first/second;
                return ans;
            }
            default:
            {
                return null;
            }
        }
    }
}