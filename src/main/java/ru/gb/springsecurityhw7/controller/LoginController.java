package ru.gb.springsecurityhw7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/public-data")
    public String userPage() {
        return "public_page";
    }

    @GetMapping("/private-data")
    public String adminPage() {
        return "private_page";
    }

    @GetMapping("/")
    public String accessDenied() {
        return "access_denied";
    }

}
