package com.luv2code.spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/form")
	public String form(){		
		return "form";
	}
	@RequestMapping("/")
	public String home(){		
		return "Home";
	}
	@RequestMapping("/show")
	public String show(){		
		return "show";
	}


}
