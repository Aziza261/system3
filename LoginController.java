

package com.example.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Test.Model.Staff;
import com.example.Test.Service.Login1Service;






 @Controller

 public class LoginController {
	 
	 @GetMapping("/login")
	    public String home(){
	        return "Login";
	    }
	 
	 
	 @Autowired 
	 Login1Service loginservice1;
	 
	 @PostMapping("/login")
	 public String login(Model model,@RequestParam String UserName, @RequestParam String password) {
		 List<Staff> login = loginservice1.login(UserName, password);
		 Staff staff = new Staff();
		 for(Staff st:login) {
			 staff.setRole(st.getRole());
		
		 } if(login.size()>0) {
			 if(staff.getRole().equals("Admin")) {
				 
				 return"redirect:/showRegister";
			 }if(staff.getRole().equals("traffic")) {
				 return "redirect:/stuff";
			 }else {
				 return "redirect:/Maombi2";
		}
		 }
		 else {
			 return "Login";
		 }
			 
		 }
		 
		
	 }

	 
 
 
