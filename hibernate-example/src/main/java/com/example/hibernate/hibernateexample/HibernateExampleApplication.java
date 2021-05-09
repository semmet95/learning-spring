package com.example.hibernate.hibernateexample;

import com.example.hibernate.hibernateexample.dao.PersonDAO;
import com.example.hibernate.hibernateexample.model.Person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HibernateExampleApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonDAO personDAO = context.getBean(PersonDAO.class);

		Person person = new Person();
		
		SpringApplication.run(HibernateExampleApplication.class, args);

		context.close();
		
	}

}
