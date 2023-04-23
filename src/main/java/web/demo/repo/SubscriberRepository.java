package web.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.demo.model.Subscriber;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, String> {
}
