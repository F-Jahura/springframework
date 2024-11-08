package com.example.springboot_rest.Controller;

import com.example.springboot_rest.entity.Person;
import com.example.springboot_rest.entity.User;
import com.example.springboot_rest.service.PersonService;
import com.example.springboot_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private UserService userService;

    @Autowired
    private PersonService personService;

    @GetMapping("/users")
    public List<User> showAllUsers() {
    List<User> allUsers = userService.getAllUsers();
    return allUsers;
}

@GetMapping("/person")
    public List<Person> showAllPeople(){
        List<Person> allPeople = personService.getAllPeople();
        return allPeople;
}

@GetMapping("/get-name")
    public Person getPerson(@RequestParam String name){
        Person personName = personService.getAllPeople().stream()
                .filter(a -> name.equals(a.getName()))
                .findFirst()
                .orElse(null);
        personService.getAllPeople().removeIf(a -> name.equals(a.getName()));
        return personName;
    }

}
