package com.example.Test.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Test.Model.Event;






@Repository

public interface EventRepository extends JpaRepository<Event, Integer> {

}
