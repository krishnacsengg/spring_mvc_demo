package com.luv2code.springdemo.DAO;

import java.util.List;
import com.luv2code.springdemo.entity.Customer;


public interface CustomerDAO {
	
	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);

	public void deleteCustomer(int customerID);

	public Customer getCustomerDetails(int customerID);


}
