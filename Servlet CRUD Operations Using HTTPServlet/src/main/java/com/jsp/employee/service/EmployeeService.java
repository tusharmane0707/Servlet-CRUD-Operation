package com.jsp.employee.service;

import java.util.List;

import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;

public class EmployeeService {
	EmployeeDao employeeDao = new EmployeeDao();

	//save employee data
	public Employee saveEmployee(Employee employee) {
		if (employee.getName() != null && employee.getEmail() != null && employee.getGender() != null
				&& employee.getSalary() > 0) {

			return employeeDao.saveEmployee(employee);
		}
		return null;
	}

	//delete employee data
	public boolean deleteEmployeeById(int id) {
		return employeeDao.deleteEmployeeById(id);
	}

	//update employee email data
	public Employee updateEmployeeByIdEmail(int id, String email, String old_email) {
		Employee employee = employeeDao.getEmployeeById(id);
		if (employee.getEmail().equals(old_email)) {
			employee.setEmail(email);
			return employeeDao.updateEmployeeByEmail(employee);
		} else {
			return null;
		}
	}

	//get employee by id
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	//get all employee 
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
}
