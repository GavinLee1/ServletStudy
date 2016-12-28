package com.gavin.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class loginServlet extends HttpServlet {
	
	private static final Logger log = LoggerFactory.getLogger(loginServlet.class);
	
	private static final long serialVersionUID = 696801515720053461L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep)
			throws ServletException, IOException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		log.debug("Entered the doGet Method");
		log.debug("User Name --> " + req.getParameter("userName"));
		log.debug("Password --> " + req.getParameter("password"));

		PrintWriter pw = resp.getWriter();
		pw.println("Processed by the servlet alreadt!");
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		log.debug("Entered the doPost Method");
		log.debug("User Name --> " + req.getParameter("userName"));
		log.debug("Password --> " + req.getParameter("password"));
		
		PrintWriter pw = resp.getWriter();
		pw.println("Here it is!");
		pw.close();
	}
	
	

}
