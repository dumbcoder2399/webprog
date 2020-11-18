import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyServlet extends HttpServlet {

 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html;charset=UTF-8");
 try (PrintWriter out = response.getWriter()) {


 String username = request.getParameter("username");
 String password = request.getParameter("pass");
 String email = request.getParameter("email");
 out.write("Hello : "+username+"<br>");
 out.write("Your registered email id is : "+email+"<br>");
 out.write("Your password is : "+password);









 }catch(Exception e)
 { }

 }

 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 processRequest(request, response);
 }

 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 processRequest(request, response);
 }

 @Override
 public String getServletInfo() {
 return "Short description";
 }
}