package com.example.Test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Test.Model.Staff;
@Repository

public interface StaffRepository extends JpaRepository<Staff, Integer> {
	List<Staff> findByUserNameAndPassword(String userName, String Password);

}
