package web.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.demo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,String> {


}
