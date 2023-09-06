package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	  throws ServletException ,IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("********Student Details***********");
		pw.println("<br>Student Id : "+req.getParameter("id"));
		pw.println("<br>Student Name : "+req.getParameter("name"));
		pw.println("<br>Student English marks : "+req.getParameter("english"));
		pw.println("<br>Student Hindi marks : "+req.getParameter("hindi"));
		pw.println("<br>Student math marks : "+req.getParameter("math"));
		pw.println("<br>Student Science marks : "+req.getParameter("science"));
		pw.println("<br>Student Social Science marks : "+req.getParameter("socscience"));
		pw.println("<br>Student Sanskrit marks : "+req.getParameter("sanskrit"));
	}

}
