package web.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.demo.model.User;
import web.demo.repo.UserRepository;
import web.demo.service.UserService;

import java.sql.Connection;
import java.util.List;

@Service
public class UserServiceImp implements UserService {


    Connection connection;
    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User usr) {
        return userRepository.save(usr);
    }

    @Override
    public List<User> getUsers() {
        return ((List<User>) userRepository.findAll());
    }

    @Override
    public User getUserbyId(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User a, String id) {
        User usr = userRepository.findById(id).get();
        usr.setMail(a.getMail());
        usr.setUsername(a.getUsername());
        usr.setPassword(a.getPassword());
        return userRepository.save(usr);
    }

    @Override
    public int loginValidation(String username, String password) {
        return 0;
    }
}
