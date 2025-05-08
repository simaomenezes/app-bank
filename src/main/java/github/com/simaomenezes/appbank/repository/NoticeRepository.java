package github.com.simaomenezes.appbank.repository;

import github.com.simaomenezes.appbank.model.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {

    @Query(value = "select * from notice_details where now() between notice_details.notic_beg_dt and notice_details.notic_end_dt;", nativeQuery = true)
    List<Notice> findAllActiveNotices();
}
