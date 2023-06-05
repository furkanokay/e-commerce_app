package com.commerce.ecommerce_app.controller;

import com.commerce.ecommerce_app.entity.*;
import com.commerce.ecommerce_app.repository.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class Controller {

    UserRepository userRepository;
    CreditCardRepository creditCardRepository;

    @GetMapping(value="/create")
    public String inventory(Model model){
        User newUser = new User();
        newUser.setEmail("asdasd@gm");
        newUser.setPassword("asdadf");
        newUser.setRole("admin");
        userRepository.save(newUser);

        CreditCard cc = new CreditCard();
        cc.setCardNumber("sadsadfg-sadas-dsad--asddd");
        cc.setCardDate("234/3214");
        cc.setSecurityNumber(722);
        cc.setOwnerOfCard(newUser);
        creditCardRepository.save(cc);


        return "inventory";
    }
}
