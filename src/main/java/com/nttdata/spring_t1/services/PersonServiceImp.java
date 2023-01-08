package com.nttdata.spring_t1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.spring_t1.repositories.Person;

/**
 * Taller 1 Spring
 * 
 * House entity
 * 
 * @author Fernando Pérez Nieto
 *
 */
@Service
public class PersonServiceImp implements PersonServiceI {
	
	@Override
	public void addPerson(List<Person> building, Person newPerson) {
		
		Boolean sameDoor = Boolean.FALSE;
		// Check if this door already has an owner
		for(Person person : building) {
			if(person.getFloor() == newPerson.getFloor() && person.getDoor().equalsIgnoreCase(newPerson.getDoor())) {
				System.out.println("Cannot be two person with the same letter door in the same floor");
				sameDoor = Boolean.TRUE;
				break;
			} 
		}
		
		// If it's not, add it to the building
		if(Boolean.FALSE.equals(sameDoor)) {
			building.add(newPerson);
		}
	}
	
	/** List all the person in the building */
	@Override
	public void searchAll(List<Person> building) {

		String persona = "";
		
		for(Person person : building) {
			
			persona = person.toString();
			System.out.println(persona);
		}
				
	}
	
	/** Search by name and surname */
	@Override
	public String searchByNameAndSurnames(List<Person> building, String name, String surnames) {

		String persona = "";
		
		for(Person person : building) {
			
			if(person.getName().equals(name) && person.getSurnames().equals(surnames)) {
				
				persona = person.toString();
			}
		}
		return persona;		
	}


}