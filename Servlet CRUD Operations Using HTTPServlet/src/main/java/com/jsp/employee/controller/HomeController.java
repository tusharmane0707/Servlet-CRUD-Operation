package com.jsp.employee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")	//we pass the url-pattern (form action) in annotation then no need to write web.xml file
public class HomeController extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String save=req.getParameter("save");
			String delete=req.getParameter("delete");
			String update=req.getParameter("update");
			String getid=req.getParameter("getid");
			String getall=req.getParameter("getall");
			
			
			if(save!=null) {
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("save.jsp");	//string type
				requestDispatcher.forward(req, resp);
			}else
				if(delete!=null) {
					RequestDispatcher requestDispatcher=req.getRequestDispatcher("delete.jsp");
					requestDispatcher.forward(req, resp);
				}else
					if(update!=null) {
						RequestDispatcher requestDispatcher=req.getRequestDispatcher("update.jsp");
						requestDispatcher.forward(req, resp);
					}else
						if(getid!=null) {
							RequestDispatcher requestDispatcher=req.getRequestDispatcher("getid.jsp");
							requestDispatcher.forward(req, resp);
						}else
							if(getall!=null) {
								RequestDispatcher requestDispatcher=req.getRequestDispatcher("getall.jsp");
								requestDispatcher.forward(req, resp);
							}
			
//			PrintWriter printWriter=	resp.getWriter();	//this display result in web page
//			printWriter.write("<html><body><h1>" + "User " +name +" is Saved Successfully "+  "</h1></body></html>");
			
		}

	


}
