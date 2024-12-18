package com.example.springboot_rest.repository;

import com.example.springboot_rest.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import java.util.List;





@Repository
public class UserDAOImpl implements UserDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers(){
        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("from User", User.class);
        List<User> allUsers = query.getResultList();
        return allUsers;

    }
}
