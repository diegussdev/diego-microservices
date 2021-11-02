package com.dieguss3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.dieguss3.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}

	public Person update(Person person) {
		return person;
	}

	public void delete(String id) {

	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();

		for (int i = 0; i < 8; i++) {
			Person person =  mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Diego");
		person.setLastName("Perez da Costa");
		person.setAddress("Street Name, 123");
		person.setGender("Male");

		return person;
	}

	private Person mockPerson(int i) {
		Person person = new Person();

		person.setId(counter.incrementAndGet());
		person.setFirstName("Person Name " + i);
		person.setLastName("Last Name " + i);
		person.setAddress("Street Name, " + i);
		person.setGender("Male");
		return person;
	}
}
