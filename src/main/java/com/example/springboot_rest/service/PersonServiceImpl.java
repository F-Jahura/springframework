package com.example.springboot_rest.service;


import com.example.springboot_rest.dao.PersonDAO;
import com.example.springboot_rest.dao.UserDAO;
import com.example.springboot_rest.entity.Person;
import com.example.springboot_rest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;
    @Override
    @Transactional
    public List<Person> getAllPeople()
    {
        return personDAO.getAllPeople();
    }
}

