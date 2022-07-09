package com.example.Test.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Test.Model.Event;

@Service

public interface EventService {
	List<Event> getAllMaombi();
	Event saveMaombi(Event maombi);
	Event getMaombiById(Integer Id);
	
	void deleteMaombi(Integer Id);
	
	

	

}
