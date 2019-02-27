package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.DAO.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping("/list")
	public String processForm(Model theModel){
		
		List<Customer> customerList = customerService.getCustomer();
		
		theModel.addAttribute("customers",customerList);
		
		return "list-customers";
	}
	
	@RequestMapping("/customerAddForm")
	public String addCustomer(Model theModel){
		
		Customer thecustomer = new Customer();
		
		theModel.addAttribute("customer", thecustomer);
		
		
		return "customerForm";
	}
	
	@RequestMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer ){
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int customerID){
		
		customerService.deleteCustomer(customerID);
		
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/update")
	public String updateCustomer(@RequestParam("customerId") int customerID, Model theModel){
		
		Customer theCustomer = customerService.getCustomerDetails(customerID);
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customerForm";
	}


  
}
