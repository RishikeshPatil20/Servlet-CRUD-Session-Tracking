package com.jsp.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/save")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("pwd");

		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("sessionname", name);
		httpSession.setAttribute("sessionpassword", password);
			
			PrintWriter printwriter = resp.getWriter();
			printwriter.write("<html><body><h1>" + "Welcome " + name + "</h1></body></html>");
			printwriter.write("<html><body><a href='servlet2'>Go to Servlet2</a></body></html>");

//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("demo.jsp");
//		requestDispatcher.forward(req, resp);

	}
}
