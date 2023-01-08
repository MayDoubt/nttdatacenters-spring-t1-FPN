package com.nttdata.spring_t1;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring_t1.repositories.Person;
import com.nttdata.spring_t1.services.PersonServiceI;


/**
 * Proyecto Spring Boot
 * 
 * Clase Principal
 * 
 * @author Pablo Dominguez
 *
 */
@SpringBootApplication
public class NttdataSpringApplication implements CommandLineRunner {

	/** Person service */
	@Autowired	
	private PersonServiceI personService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttdataSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Create person
		Person p1 = new Person(1L, "Juan Alberto", "Reyes Gómez", 1, "A");
		Person p2 = new Person(2L, "Maria", "Lopez Galvez", 1, "C");
		Person p3 = new Person(3L, "Juanillo", "Pinganillo", 2, "B");
		Person p4 = new Person(4L, "Lucas", "Ocampos Omargaritas", 2, "A");
		Person p5 = new Person(5L, "Bertin", "Osborne", 3, "B");
		Person p6 = new Person(6L, "James", "Bond Bond", 3, "B");
		
		//Create the building
		List<Person> building = new ArrayList<>();
		personService.addPerson(building, p1);
		personService.addPerson(building, p2);
		personService.addPerson(building, p3);
		personService.addPerson(building, p4);
		personService.addPerson(building, p5);
		personService.addPerson(building, p6);

		//Show all the person
		System.out.println("\nTodos los inquilinos");
		System.out.println("-------------------------");
		personService.searchAll(building); 
		System.out.println("\n");
		
		//Buscar por nombre y apellidos
		System.out.println("Busqueda por nombre y apellidos");
		System.out.println("-------------------------");
		System.out.println(personService.searchByNameAndSurnames(building, "Lucas", "Ocampos Omargaritas"));
	}

}
