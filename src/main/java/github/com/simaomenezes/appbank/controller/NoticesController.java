package github.com.simaomenezes.appbank.controller;

import github.com.simaomenezes.appbank.model.Notice;
import github.com.simaomenezes.appbank.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequiredArgsConstructor
public class NoticesController {

    private final NoticeRepository repository;

    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getNoticesDetail(){
        List<Notice> returnList = repository.findAllActiveNotices();

        if(returnList != null){
            return ResponseEntity.ok().cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS)).body(returnList);
        } else {
            return null;
        }
    }
}
