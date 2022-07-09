package com.example.Test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
		@GetMapping("cost")
	    public String home(){
	        return "Customer";
	    }
}


