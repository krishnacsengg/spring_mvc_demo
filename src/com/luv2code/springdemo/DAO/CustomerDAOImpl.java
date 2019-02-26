package com.luv2code.springdemo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomer() {
		// get the hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Create query
		
		Query<Customer> theQuery = currentSession.createQuery("from Customer",Customer.class);
		
		// Execute query and get result
		 List<Customer> customersList = theQuery.getResultList();
		// return result
		 
		return customersList;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		//
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save the customer ... finally LOL
		currentSession.save(theCustomer);
		
	}

}
