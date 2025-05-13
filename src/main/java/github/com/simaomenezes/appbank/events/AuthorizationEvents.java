package github.com.simaomenezes.appbank.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authorization.event.AuthorizationEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthorizationEvents {

    @EventListener
    public void onFailure(AuthorizationEvent deniedEvent){
        log.error("Authorization failed for the user : {} due to : {}", deniedEvent.getAuthentication().get()
                .getName(), deniedEvent.getAuthentication().toString());
    }
}
