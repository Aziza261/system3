package com.example.Test.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.Test.Model.Staff;
import com.example.Test.Repository.StaffRepository;



@Service
public class StaffServiceImpl  implements StaffService {
	@Autowired
	private StaffRepository staffRepository;
	private CrudRepository<Staff, Integer> serviceRepository;

	@Override
	public List<Staff> getAllStaff() {
		return staffRepository.findAll() ;
		
	}

	@Override
	public Staff saveStaff(Staff staff) {
		return staffRepository.save(staff);
		
	}

	@Override
	public Staff getStaffById(Integer Id) {
		Optional<Staff> optional = staffRepository.findById(Id);
		Staff staff = null;
		
		if(optional.isPresent()) {
			
			staff = optional.get();
		}else {
			
			throw new RuntimeException("Staff not found for id " + Id);
			
		}
		return  staff; 

		

	}

	@Override
	public void deleteStaff(Integer Id) {
		this.staffRepository.deleteById(Id);
		
	}

	@Override
	public void save(Staff staff) {
		// TODO Auto-generated method stub
		this.staffRepository.save(staff);
		
	}

	@Override
	public Optional<Staff> findById(Integer Id) {
		// TODO Auto-generated method stub
		return staffRepository.findById(Id) ;
	}

	
	
	
}
