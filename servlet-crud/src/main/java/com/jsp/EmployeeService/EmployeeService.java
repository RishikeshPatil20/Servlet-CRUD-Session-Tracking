package com.jsp.EmployeeService;

import java.util.List;

import com.jsp.EmployeeDao.EmployeeDao;
import com.jsp.EmployeeDto.Employee;

public class EmployeeService {
	EmployeeDao employeeDao = new EmployeeDao();

	public Employee saveEmployee(Employee employee) {
		if (employee.getName() != null && employee.getEmail() != null && employee.getGender() != null
				&& employee.getSalary() > 0) {
			return employeeDao.saveEmployee(employee);

		}
		return null;
	}
	public boolean deleteEmployeeById(int id) {
		boolean e=employeeDao.deleteEmployeeById(id);
		return e;
	}
//	public Employee updateEmployeeByEmail(Employee employee) {
//		if (employee.getName() != null && employee.getEmail() != null && employee.getGender() != null
//				&& employee.getSalary() > 0) {
//			return employeeDao.updateEmployeeByIdEmail(employee);
//		}
//		return null;
//	}
	public Employee updateEmployeeByIdEmail(int id, String email, String old_email) {
		Employee employee=employeeDao.getEmployeeById(id);
		if(employee.getEmail().equals(old_email)) {
			employee.setEmail(email);
			return employeeDao.updateEmployeeByIdEmail(employee);
		}
		else {
			return null;
		}
		}
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}
}
