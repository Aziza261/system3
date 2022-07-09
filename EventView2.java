package com.example.Test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Test.Service.EventService;

@Controller

public class EventView2 {
	@Autowired
	private EventService maombiService;
	
	@GetMapping("/Maombi2")
	public String  Maombi(Model model) {
		model.addAttribute("listMaombi", maombiService.getAllMaombi());
		return "ViewEvent2";
	}
		
	
	
	public String ViewMaombi(Model model) {
		model.addAttribute("listMaombi", maombiService.getAllMaombi());
		return "Maombi2";	
	}
	
	@GetMapping("/updateMaombi2/{Id}")
	public String showFormforupdate(@PathVariable (value = "Id") Integer Id, Model model) {
		com.example.Test.Model.Event maombi = maombiService.getMaombiById(Id);
		model.addAttribute("maombi", maombi);
		return "Updateuser";
	}
	
	@GetMapping("/deleteMaombi2/{Id}")
	public String deleteMaombi(@PathVariable (value = "Id") Integer Id) {
		this.maombiService.deleteMaombi(Id);
		
		return "redirect:/Maombi2";
	}
}
