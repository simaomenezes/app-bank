package github.com.simaomenezes.appbank.repository;

import github.com.simaomenezes.appbank.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
}
