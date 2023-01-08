package com.nttdata.spring_t1.repositories;

/**
 * Taller 1 Spring
 * 
 * House entity
 * 
 * @author Fernando Pérez Nieto
 *
 */
public class House {
	
	/** Building floor */
	private int floor;
	/** Door */
	private String door;
	
	/**
	 * House constructor
	 * 
	 * @param floor
	 * @param door
	 */
	public House(int floor, String door) {

		this.floor = floor;
		this.door = door;
	}
	
	public House() {
		
	}
	
	/**
	 * 
	 * @return house floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * 
	 * @param floor
	 * 				to set the floor
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * 
	 * @return house door
	 */
	public String getDoor() {
		return door;
	}

	/**
	 * 
	 * @param door
	 * 				to set the door
	 */
	public void setDoor(String door) {
		this.door = door;
	}
	
}