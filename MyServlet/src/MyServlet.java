

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(name="MyServlet",urlPatterns = "/MyServlet")
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
		String filter = request.getParameter("filter");
		PrintWriter out = response.getWriter();
		out.append("<p>ContextPath: "+contextPath+"</p>");
		out.append("<p>ServletPath: "+servletPath+"</p>");
		out.append("<p>PathInfo: "+pathInfo+"</p>");
		out.append("<p>test: "+test+"</p>");
		out.append("<p>toto: "+toto+"</p>");
		out.append("<p>filter: "+filter+"</p>");
		out.append("<h2>Header Values</h2>");
		
		Enumeration headerNames=request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName=(String)headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.append(String.format("<p>Header: %s, valeur: %s", headerName,headerValue));
		}
		
		out.append("<h2>Session</h2>");
		HttpSession session = (HttpSession)request.getSession();
		String first="John"; String last="Doe";
		session.setAttribute("firstname", first);
		session.setAttribute("lastname", last);
		
		Enumeration ee = session.getAttributeNames();
		while (ee.hasMoreElements()) {
			String attr = (String) ee.nextElement();
			String tmp = (String) session.getAttribute(attr);
			out.append("<p>"+attr+": "+tmp+"</p>");
		}
		
		out.append("<h2>Cookies</h2>");
		
		Cookie cookie = new Cookie("monCookie", "cookie-ok");
		cookie.setMaxAge(100*1000*60);
		response.addCookie(cookie);
		
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			out.println("name="+c.getName()+" value="+c.getValue()+"\n");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
