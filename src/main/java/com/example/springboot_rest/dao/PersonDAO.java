package com.example.springboot_rest.dao;

import com.example.springboot_rest.entity.Person;

import java.util.List;

public interface PersonDAO {
    public List<Person> getAllPeople();
}
