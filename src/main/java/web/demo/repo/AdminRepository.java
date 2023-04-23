package web.demo.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.demo.model.*;

@Repository
public interface AdminRepository extends CrudRepository<Admin,Integer> {

}
