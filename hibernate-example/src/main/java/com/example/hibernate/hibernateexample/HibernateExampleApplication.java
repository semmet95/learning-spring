package com.example.hibernate.hibernateexample;

import java.util.List;

import com.example.hibernate.hibernateexample.dao.PersonDAO;
import com.example.hibernate.hibernateexample.model.Person;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class HibernateExampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HibernateExampleApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonDAO personDAO = context.getBean(PersonDAO.class);

		Person person = new Person();
		person.setName("Pankaj");
		person.setCountry("India");

		personDAO.save(person);
		System.out.println("Person::"+person);

		List<Person> list = personDAO.list();
		for(Person p: list) {
			System.out.println("Person list::"+p);
		}

		context.close();
	}
}
