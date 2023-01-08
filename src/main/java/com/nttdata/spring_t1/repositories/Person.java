package com.nttdata.spring_t1.repositories;

/**
 * Taller 1 Spring
 * 
 * Person entity
 * 
 * @author Fernando Pérez Nieto
 *
 */
public class Person extends House{
	
	/** Person Id */
	private Long id;
	/** Person name */
	private String name;
	/** Person surnames */
	private String surnames;
	
	/**
	 * Person constructor
	 * 
	 * @param id
	 * @param name
	 * @param surnames
	 * @param floor
	 * @param door
	 */
	public Person(Long id, String name, String surnames, int floor, String door) {
		
		super(floor, door);
		this.id = id;
		this.name = name;
		this.surnames = surnames;
	}
	
	public Person() {
		
	}
	
	/**
	 * 
	 * @return person id 
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 * 			to set id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return person name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 * 				to set name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return person surnames
	 */
	public String getSurnames() {
		return surnames;
	}

	/**
	 * 
	 * @param surnames
	 * 				to set surnames
	 */
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", surnames=" + surnames + ", floor=" + getFloor() + ", door="
				+ getDoor() + "]";
	}
	
	
}