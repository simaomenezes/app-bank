package github.com.simaomenezes.appbank.repository;

import github.com.simaomenezes.appbank.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ContactRepository extends CrudRepository<Contact, String> {
}
