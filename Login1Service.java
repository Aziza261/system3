package com.example.Test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.Model.Staff;
import com.example.Test.Repository.StaffRepository;


@Service

public class Login1Service {
	@Autowired StaffRepository staffRepository;
	
	public List<Staff> login(String UserName, String password) {
		
		return staffRepository.findByUserNameAndPassword(UserName, password);
	}

}
