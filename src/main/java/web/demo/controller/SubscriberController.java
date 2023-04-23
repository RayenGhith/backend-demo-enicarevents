package web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.demo.model.Subscriber;
import web.demo.model.User;
import web.demo.service.SubscriberService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SubscriberController {

    @Autowired
    private SubscriberService subService;

    @PostMapping("/subscriber/add")
    public Subscriber createUser(@RequestBody Subscriber sub) {
        Subscriber sub1 = subService.createSubscriber(sub);
        return sub1;
    }

    @GetMapping("/subscriber/getall")
    public List<Subscriber> getAllSubscribers(){
        return subService.getSubscribers();
    }
}
