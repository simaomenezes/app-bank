package github.com.simaomenezes.appbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    /**
     * Welcome message
     * @return String
     */
    @GetMapping("/myCards")
    public String getCardsDetail(){
        return "Here are the Cards details from the DB";
    }
}
