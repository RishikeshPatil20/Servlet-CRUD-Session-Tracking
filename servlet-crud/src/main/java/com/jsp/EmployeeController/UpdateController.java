package com.jsp.EmployeeController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.EmployeeDto.Employee;
import com.jsp.EmployeeService.EmployeeService;

@WebServlet("/updateEmployee")
public class UpdateController extends HttpServlet {

	EmployeeService employeeService=new EmployeeService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String i=req.getParameter("id");
		String oldemail=req.getParameter("update_old_email");
		String email = req.getParameter("update_new_email");
		int id=Integer.parseInt(i);
		
//		String gender = req.getParameter("updategender");
//		String salary = req.getParameter("updatesalary");
//		String name = req.getParameter("updatename");		
//		double sal = Double.parseDouble(salary);		
//we have commented from this Employee employee = new Employee(); as we are creating a new employee not updating existence employee.
//		Employee employee = new Employee();
//		employee.setId(id);
//		employee.setName(name);
//		employee.setEmail(email);
//		employee.setGender(gender);
//		employee.setSalary(sal);
//
//		Employee e1=employeeService.updateEmployeeByEmail(employee);
//		if (e1 != null) {
//			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
//			requestDispatcher.forward(req, resp);
//		} else {
//			RequestDispatcher requestDispatcher = req.getRequestDispatcher("update.jsp");
//			requestDispatcher.include(req, resp);
	
		
	Employee employee= employeeService.updateEmployeeByIdEmail(id, email, oldemail);
	if(employee!=null){
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(req, resp);
	} else  {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("update.jsp");
		requestDispatcher.include(req, resp);
	}
	}
	}
