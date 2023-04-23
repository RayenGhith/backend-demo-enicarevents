package web.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.demo.model.Newsletter;

@Repository
public interface NewsletterRepository extends CrudRepository<Newsletter, Long> {
}
