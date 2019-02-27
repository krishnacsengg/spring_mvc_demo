package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.DAO.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustomer() {
		//
		return customerDAO.getCustomer();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		 customerDAO.saveCustomer(theCustomer);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerID) {
		
		customerDAO.deleteCustomer(customerID);
		
	}

}
