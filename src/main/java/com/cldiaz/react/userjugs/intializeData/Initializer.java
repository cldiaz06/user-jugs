package com.cldiaz.react.userjugs.intializeData;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cldiaz.react.userjugs.model.Event;
import com.cldiaz.react.userjugs.model.Group;
import com.cldiaz.react.userjugs.repositories.GroupRepository;

@Component
public class Initializer implements CommandLineRunner {

	private final GroupRepository repository;
	
	public Initializer(GroupRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void run(String... strings) throws Exception {
		Stream.of("Denver JUG", "Utah JUG", "Seattle JUG","Richmond JUG")
			.forEach(name -> repository.save(new Group(name))
				);
		
		Group djug = repository.findByName("Denver JUG");
		Event e = Event.builder().title("Full Stack Reactive")
						.description("Reactive with Spring Boot + React")
						.date(Instant.parse("2019-09-09T18:00:00.000Z"))
						.build();
		
		djug.setEvents(Collections.singleton(e));
		repository.save(djug);
		
		repository.findAll().forEach(System.out::println);

	}

}
