package com.example.springboot_rest.repository;

import com.example.springboot_rest.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
}
