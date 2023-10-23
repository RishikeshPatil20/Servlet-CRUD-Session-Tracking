package com.jsp.service;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerService {

	CustomerDao customerDao=new CustomerDao();
	public Customer saveCustomer(Customer customer) {
		if (customer.getCustomer_id()!=0 && customer.getCustomer_account_no()!=null && customer.getCustomer_password()!=null) {
			return customerDao.saveCustomer(customer);
		}
		return null;
	}
	public boolean deleteCustomerById(int id) {
		return customerDao.deleteCustomerById(id); 
	}
	
}
