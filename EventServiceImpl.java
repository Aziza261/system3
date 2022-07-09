package com.example.Test.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.Model.Event;
import com.example.Test.Repository.EventRepository;

@Service

public class EventServiceImpl implements EventService {
	@Autowired
	private EventRepository maombiRepository;


	@Override
	public List<Event> getAllMaombi() {
		return maombiRepository.findAll();

	}

	@Override
	public Event saveMaombi(Event maombi) {
		return this.maombiRepository.save(maombi);
	}

	@Override
	public Event getMaombiById(Integer Id) {
		Optional<Event> optional = maombiRepository.findById(Id);
		Event maombi = null;
		
		if(optional.isPresent()) {
			
			maombi = optional.get();
		}else {
			
			throw new RuntimeException("maombi not found for id " + Id);
			
		}
		return maombi;
		
	}
	

	@Override
	public void deleteMaombi(Integer Id) {
		this.maombiRepository.deleteById(Id);
		
	}



	

	

}
