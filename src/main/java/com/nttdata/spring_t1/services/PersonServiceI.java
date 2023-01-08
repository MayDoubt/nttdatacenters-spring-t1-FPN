package com.nttdata.spring_t1.services;

import java.util.List;

import com.nttdata.spring_t1.repositories.Person;


/**
 * Taller 1 Spring
 * 
 * Person service interface
 * 
 * @author Fernando Pérez Nieto
 *
 */
public interface PersonServiceI {
	
	/**
	 * Add persons
	 * 
	 * @param List<Person> persons
	 */
	public void addPerson(final List<Person> building, Person newPerson);	

	/**
	 * Search all persons
	 * 
	 * @param List<Person> persons
	 */
	public void searchAll(final List<Person> building);
	
	/**
	 * Search person by name and surnames
	 * 
	 * @param name, surnames
	 */
	public String searchByNameAndSurnames(final List<Person> building, final String name, final String surnames);
}
