package com.example.Test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Test.Model.Staff;
import com.example.Test.Service.StaffService;
@Controller

public class StaffController {
	@Autowired
	private StaffService staffService;
	
	
	@GetMapping("/Register")
    public String home(){
        return "Register";
    }

	
	
	
	@GetMapping("/RegisterView")
	public String ViewRegister(Model model) {
		model.addAttribute("listStaff", staffService.getAllStaff());
		return "Register";
	}

	@GetMapping("/showRegister")
	public String showRegister(Model model) {
		Staff staffs = new Staff();
		model.addAttribute("staff", staffs);
		return "Register";
	}
	
	
	@PostMapping("/saveRegister")
	public String saveStaff(@ModelAttribute("staff")Staff staff ) {
	staffService.saveStaff(staff);
	return "redirect:/RegisterView";
	
	}
	
	@GetMapping("/updateuser/{Id}")
	public String showFormforupdate(@PathVariable (value = "Id") Integer Id, Model model) {
		Staff staff = staffService.getStaffById(Id);
		model.addAttribute("staff", staff);
		return "Updateuser";
	}
	
	
	@GetMapping("/deleteStaff/{Id}")
	public String deleteStaff(@PathVariable (value = "Id") Integer Id) {
		this.staffService.deleteStaff(Id);
		
		return "redirect:/RegisterView";
	}
	
	
	/*
	 * @GetMapping("/showStaff") public String showStaff(Model model) {
	 * 
	 * Staff staff = new Staff(); model.addAttribute(staff, staff); return
	 * "Register";
	 * 
	 * }
	 * 
	 */


}
