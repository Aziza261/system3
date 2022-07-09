package com.example.Test.Service;

import java.util.List;
import java.util.Optional;

import com.example.Test.Model.Staff;

public interface StaffService {
	
	List<Staff> getAllStaff();
	Staff saveStaff(Staff staff);
	Staff getStaffById(Integer Id);
	
	void deleteStaff(Integer Id);
	
	
	
	
	void save(Staff staff);
	Optional<Staff> findById(Integer Id);
	
	

}
