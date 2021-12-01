package com.example.webfejlesztes_beadando_2.controller;

import com.example.webfejlesztes_beadando_2.repositroy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    String getUserData(Model model){
        model.addAttribute("usernames", userRepository.getAllUserNames());
        model.addAttribute("allcolor", userRepository.getAllcolor());
        return "getusernames";
    }

}
