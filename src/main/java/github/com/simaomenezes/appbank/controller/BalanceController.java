package github.com.simaomenezes.appbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    /**
     * Welcome message
     * @return String
     */
    @GetMapping("/myBalance")
    public String getBalanceDetail(){
        return "Here are the account details from the DB";
    }


}
