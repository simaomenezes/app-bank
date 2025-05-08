package github.com.simaomenezes.appbank.controller;

import github.com.simaomenezes.appbank.model.Loans;
import github.com.simaomenezes.appbank.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoansController {

    private final LoanRepository repository;

    @GetMapping("/myLoans")
    public List<Loans> getLoansDetail(@RequestParam long customerId){
        return repository.findByCustomerIdOrderByStartDtDesc(customerId);
    }
}
