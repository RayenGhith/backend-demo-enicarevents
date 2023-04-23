package web.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.demo.model.User;
import web.demo.service.UserService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public User createUser(@RequestBody User user) {
        User user1 = userService.createUser(user);
        return user1;
    }

    @GetMapping("/user/getall")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }
    @PutMapping("/user/update/{id}")
    public User updateUserbyid(@RequestBody User usr,@PathVariable("id") String id){
        return  userService.updateUser(usr,id);
    }
    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") String id){
        userService.deleteUser(id);
        return "user deleted successfully";
    }
    @GetMapping("/user/getuserbyid/{id}")
    public User getUserbyid(@PathVariable("id") String id){
        return userService.getUserbyId(id);
    }
}
