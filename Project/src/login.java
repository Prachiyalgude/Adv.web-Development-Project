

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	//	PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
	    String password = request.getParameter("password");
	    
	    
	    if(user.equals("abc") && password.equals("abc"))
	    {
	    	HttpSession session = request.getSession();
	    	session.setAttribute("user", user);
	    	response.sendRedirect("MyhealthRecord.html");
	    }
	    
	    
	    
	    
	 
	    /**
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","12345");
		      Statement stmt = con.createStatement();
		      ResultSet rs = stmt.executeQuery("select name,password from usertb where name='"+user+"' and password='"+password+"'");

		     
		      
		      if(rs.next())
			    {
			    	HttpSession session = request.getSession();
			        session.setAttribute("user", user);
			    	response.sendRedirect("http://localhost:8083/Project/MyhealthRecord.html");
			    	
			    }
			    else {
			    	
			    	
			    	out.println("Wrong id and password");
			    }
		      
		      
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	 */   
	}
	

}
