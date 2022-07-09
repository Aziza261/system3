package com.example.Test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Test.Model.Staff;
import com.example.Test.Service.StaffService;


@Controller

public class Staff2Controller {
	@Autowired
	StaffService staffServices;
	
	@GetMapping("/showUserRegister")
	public String showUserRegister(Model model) {
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "UserRegister";
	}
	
	
	

	
	@PostMapping("/saveUserRegister")
	public String saveStaff(@ModelAttribute("staff") Staff staff){
//		Staff staff = new Staff();
	staffServices.saveStaff(staff);
	return "redirect:/login";

}
}
