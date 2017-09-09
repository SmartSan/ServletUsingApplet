
import java.io*;
import javax.servlet.*;
import javax.servlet.http.*;

public class appletservlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws 
IOException,ServletException
{
PrintWriter out=res.getWriter();
String s1=req.getParameter("usr");
String s2=req.getParameter("msg");
out.println("<h1>Name:"+s1"<h1>");
out.println("<marquee>Message:"+s2+"</marquee>");
}
}
