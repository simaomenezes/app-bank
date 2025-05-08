package github.com.simaomenezes.appbank.controller;

import github.com.simaomenezes.appbank.model.Cards;
import github.com.simaomenezes.appbank.repository.CardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardsController {

    private final CardsRepository repository;

    @GetMapping("/myCards")
    public List<Cards> getCardDetails(@RequestParam long id) {
        List<Cards> cards = repository.findByCustomerId(id);
        if (cards != null ) {
            return cards;
        }else {
            return null;
        }
    }
}
