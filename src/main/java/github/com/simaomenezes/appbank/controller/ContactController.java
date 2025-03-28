package github.com.simaomenezes.appbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    /**
     * Welcome message
     * @return String
     */
    @GetMapping("/contact")
    public String getContactDetail(){
        return "Here are the Contact details from the DB";
    }
}
