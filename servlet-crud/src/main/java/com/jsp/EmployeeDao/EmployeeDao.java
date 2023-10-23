package com.jsp.EmployeeDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.EmployeeDto.Employee;


public class EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("devesh");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

//	save

	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}

//	delete

	public boolean deleteEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

//	update

	public Employee updateEmployeeByIdEmail(Employee employee) {
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return employee;
	}
	
	public List<Employee> getAllEmployee(){
		String sql ="SELECT e from Employee e";
		Query query=entityManager.createQuery(sql);
		List<Employee> employees=query.getResultList();
		return employees;
	}

	public Employee getEmployeeById(int id) {
		return entityManager.find(Employee.class, id);
	}
	
}
