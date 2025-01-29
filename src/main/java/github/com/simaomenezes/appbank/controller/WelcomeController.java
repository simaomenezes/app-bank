package github.com.simaomenezes.appbank.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    public String sayWelcome(){
        return "Welcome to Spring Boot with out security";
    }
}
