package com.demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelpDeskURL implements Servlet {

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inside init method...");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside service method...");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy method...");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("Inside ServletConfig method...");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("Inside getServletInfo method...");
		return null;
	}

}
