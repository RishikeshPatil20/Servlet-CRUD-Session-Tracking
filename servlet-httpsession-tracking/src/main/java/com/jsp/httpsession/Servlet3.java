package com.jsp.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		String pwd = (String) httpSession.getAttribute("sessionpassword");
		System.out.println(pwd);

		httpSession.removeAttribute("sessionname");
		httpSession.removeAttribute("sessionpassword");
		httpSession.invalidate();
	}
}
