package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Customer;

public class CustomerDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Rishi");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Customer saveCustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
	
	public boolean deleteCustomerById(int id) {
		Customer customer=entityManager.find(Customer.class, id);
		if(customer !=null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public Customer updateCustomerByEmailPassword(Customer customer) {
		entityTransaction.begin();
		entityManager.merge(customer);
		entityTransaction.commit();
		return customer;
	}
}
