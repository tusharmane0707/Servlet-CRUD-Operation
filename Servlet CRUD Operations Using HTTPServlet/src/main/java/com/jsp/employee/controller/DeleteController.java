package com.jsp.employee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

@WebServlet("/delete")
public class DeleteController extends HttpServlet{
	EmployeeService employeeService=new EmployeeService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		Integer id1=Integer.parseInt(id);
		
		boolean flag=	employeeService.deleteEmployeeById(id1);
		
		if(flag==true) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("delete.jsp");
			requestDispatcher.include(req, resp);
		}
	}	
	
}
