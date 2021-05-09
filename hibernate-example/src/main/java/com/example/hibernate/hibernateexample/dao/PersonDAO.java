package com.example.hibernate.hibernateexample.dao;

import java.util.List;

import com.example.hibernate.hibernateexample.model.Person;


public interface PersonDAO {
    public void save(Person P);

    public List<Person> list();
    
}
