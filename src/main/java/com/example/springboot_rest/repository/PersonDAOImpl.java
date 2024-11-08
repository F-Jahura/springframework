package com.example.springboot_rest.repository;

import com.example.springboot_rest.entity.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import java.util.List;


@Repository
public class PersonDAOImpl implements PersonDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Person> getAllPeople() {
        Session session = entityManager.unwrap(Session.class);
        Query<Person> query = session.createQuery("from Person", Person.class);
        List<Person> allPeople = query.getResultList();
        return allPeople;

    }

}
