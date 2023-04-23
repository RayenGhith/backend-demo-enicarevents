package web.demo.service;


import org.springframework.stereotype.Service;
import web.demo.model.User;

import java.util.List;

@Service
public interface UserService {
    public User createUser(User ad);

    public List<User> getUsers();

    public User getUserbyId(String id);
    public void deleteUser(String id);

    public User updateUser(User a , String id);

    //jarrabha
    public int loginValidation(String username,String password);

}
