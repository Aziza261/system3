package com.example.Test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffDash {
	
	@GetMapping("/stuff")
    public String home(){
        return "StaffDash";
    }

}
