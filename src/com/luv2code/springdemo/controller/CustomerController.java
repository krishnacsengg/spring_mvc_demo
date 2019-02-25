package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.luv2code.springdemo.DAO.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	
	@RequestMapping("/list")
	public String processForm(Model theModel){
		
		List<Customer> customerList = customerDAO.getCustomer();
		
		theModel.addAttribute("customers",customerList);
		
		return "list-customers";
	}



}
