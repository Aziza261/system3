package com.example.Test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {
	@GetMapping("/home")
    public String home(){
        return "index";
    }
}
















