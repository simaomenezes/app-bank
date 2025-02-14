package github.com.simaomenezes.appbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    /**
     * Welcome message
     * @return String
     */
    @GetMapping("/myAccount")
    public String getAccountDetail(){
        return "Here are the account details from the DB";
    }
}
