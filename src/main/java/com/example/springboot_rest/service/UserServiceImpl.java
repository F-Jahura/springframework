package com.example.springboot_rest.service;

import com.example.springboot_rest.dao.UserDAO;
import com.example.springboot_rest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Override
    @Transactional
    public List<User> getAllUsers(){
        return userDAO.getAllUsers();
    }
}
