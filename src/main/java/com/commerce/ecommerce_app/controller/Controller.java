package com.commerce.ecommerce_app.controller;

import com.commerce.ecommerce_app.entity.*;
import com.commerce.ecommerce_app.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value="/create")
    public String inventory(Model model){
        User newUser = new User();
        newUser.setId(1123);
        newUser.setEmail("asdasd@gm");
        newUser.setPassword("asdadf");
        newUser.setRole("amdin");
        userRepository.save(newUser);

        return "inventory";
    }
}
