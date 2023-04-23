package web.demo.service;


import org.springframework.stereotype.Service;
import web.demo.model.Newsletter;

@Service

public interface NewsletterService {

    public Newsletter createNewsletter(Newsletter ad);

    public Newsletter getNewsletterbyId(Long id);
    public void deleteNewsletter(Long id);

    public Newsletter updateNewsletter(Newsletter a , Long id);
}
