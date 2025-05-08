package github.com.simaomenezes.appbank.controller;

import github.com.simaomenezes.appbank.model.Accounts;
import github.com.simaomenezes.appbank.repository.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountsRepository repository;

    @GetMapping("/myAccount")
    public Accounts getAccountDetail(@RequestParam long customerId){
        return repository.findByCustomerId(customerId);
    }
}
