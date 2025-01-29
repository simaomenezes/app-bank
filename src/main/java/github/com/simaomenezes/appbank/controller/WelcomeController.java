package github.com.simaomenezes.appbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    /**
     * Welcome message
     * @return String
     */
    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Boot with security";
    }

    @GetMapping("/get")
    public String get(){

        String name = "Sima";
        return "get";
    }


    @GetMapping("/media/{num1}/{num2}")
    public double media(@PathVariable double num1, @PathVariable double num2){
        return (num1 + num2) / 2;
    }
}
