package com.gavin.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 696801515720053461L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep)
			throws ServletException, IOException {
		System.out.println("User Name --> " + req.getParameter("userName"));
		System.out.println("Password --> " + req.getParameter("password"));
		PrintWriter pw = rep.getWriter();
		pw.println("Here it is!");
		pw.close();
	}

}
