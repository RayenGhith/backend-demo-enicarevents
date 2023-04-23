package web.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.demo.model.Subscriber;
import web.demo.model.User;
import web.demo.repo.SubscriberRepository;
import web.demo.service.SubscriberService;

import java.util.List;

@Service
public class SubscriberServiceImp implements SubscriberService {

    @Autowired
    private SubscriberRepository subRepo;
    @Override
    public Subscriber createSubscriber(Subscriber sub) {
        return subRepo.save(sub);
    }

    @Override
    public List<Subscriber> getSubscribers() {
        return ((List<Subscriber>) subRepo.findAll());
    }

    @Override
    public Subscriber getSubscriberbyId(String mail) {
        return subRepo.findById(mail).get();
    }

    @Override
    public void deleteSubscriber(String mail) {
        subRepo.deleteById(mail);
    }

}
