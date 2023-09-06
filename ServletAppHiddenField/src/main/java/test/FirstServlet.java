package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	  throws ServletException,IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		StudentBean sb=new RetrieveDAO().retrieve(req);
		if(sb==null) {
			pw.println("Invalid Student id...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("input.html");
			rd.include(req, res);
		}
		else {
				pw.println("<form action='second' method='GET'>");
				pw.println
				("<input type='hidden' value='"+sb.getSid()+"' name='id'>");
				pw.println
				("<input type='hidden' value='"+sb.getSname()+"' name='name'>");
				pw.println
				("<input type='hidden' value='"+sb.getEnglish()+"' name='english'>");
				pw.println
				("<input type='hidden' value='"+sb.getHindi()+"' name='hindi'>");
				pw.println
				("<input type='hidden' value='"+sb.getMath()+"' name='math'>");
				pw.println
				("<input type='hidden' value='"+sb.getScience()+"' name='science'>");
				pw.println
				("<input type='hidden' value='"+sb.getSocscience()+"' name='socscience'>");
				pw.println
				("<input type='hidden' value='"+sb.getSanskrit()+"' name='sanskrit'>");
				pw.println("<input type='submit' value='ViewStudentDetails'>");
				pw.println("</form>");
			}
			
		}
	}

