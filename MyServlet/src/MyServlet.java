

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(name="MyServlet",urlPatterns = "/param")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contextPath=request.getContextPath();
		String servletPath=request.getServletPath();
		String pathInfo = request.getPathInfo();
		String test=request.getParameter("test");
		String toto=request.getParameter("toto");
		PrintWriter out = response.getWriter();
		out.append("<p>ContextPath: "+contextPath+"</p>");
		out.append("<p>ServletPath: "+servletPath+"</p>");
		out.append("<p>PathInfo: "+pathInfo+"</p>");
		out.append("<p>test: "+test+"</p>");
		out.append("<p>toto: "+toto+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
