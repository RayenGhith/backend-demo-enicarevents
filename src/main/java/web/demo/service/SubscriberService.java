package web.demo.service;


import org.springframework.stereotype.Service;
import web.demo.model.Subscriber;
import web.demo.model.User;

import java.util.List;

@Service

public interface SubscriberService {

    public Subscriber createSubscriber(Subscriber sub);

    public List<Subscriber> getSubscribers();

    public Subscriber getSubscriberbyId(String mail);
    public void deleteSubscriber(String mail);

}
