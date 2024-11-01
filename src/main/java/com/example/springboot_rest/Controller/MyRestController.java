package com.example.springboot_rest.Controller;

import com.example.springboot_rest.entity.User;
import com.example.springboot_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllUsers() {
    List<User> allUsers = userService.getAllUsers();
    return allUsers;
}

}
