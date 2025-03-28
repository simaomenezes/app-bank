package github.com.simaomenezes.appbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    /**
     * Welcome message
     * @return String
     */
    @GetMapping("/notices")
    public String getNoticesDetail(){
        return "Here are the Notices details from the DB";
    }
}
