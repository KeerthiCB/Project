package com.rays;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				String userName = request.getParameter("username");
				String password = request.getParameter("password");
				HttpSession session = request.getSession();
				if(userName.equalsIgnoreCase("raysrmr") && password.equals("123456")) {
					/*Cookie co = new Cookie("user", userName);
					Cookie co1 = new Cookie("pass", password);
					response.addCookie(co);
					response.addCookie(co1);*/
					session.setAttribute("uname", userName);
					session.setAttribute("login", new Date());
					out.println("Login Successfull");
					out.println("<a href='HomePageServlet'>Home Page</a>");
				}else {
					out.println("Login Failed");
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
