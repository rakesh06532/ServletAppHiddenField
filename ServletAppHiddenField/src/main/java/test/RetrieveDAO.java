package test;
import java.sql.*;

import javax.servlet.http.HttpServletRequest;

public class RetrieveDAO {
	public StudentBean sb=null;
	public StudentBean retrieve(HttpServletRequest req){
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement
					("select * from student where sid=?");
			ps.setInt(1, Integer.parseInt(req.getParameter("id")));
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				sb=new StudentBean();
				sb.setSid(rs.getInt(1));
				sb.setSname(rs.getString(2));
				sb.setMath(rs.getInt(3));
				sb.setEnglish(rs.getInt(4));
				sb.setHindi(rs.getInt(5));
				sb.setScience(rs.getInt(6));
				sb.setSocscience(rs.getInt(7));
				sb.setSanskrit(rs.getInt(8));
			}
		}catch(Exception e) {e.printStackTrace();}
		return sb;
	}
	

}
