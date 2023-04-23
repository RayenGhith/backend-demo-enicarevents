package web.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.demo.model.Event;
import web.demo.model.Newsletter;
import web.demo.repo.NewsletterRepository;
import web.demo.service.NewsletterService;

@Service
public class NewsletterServiceImp implements NewsletterService {

    @Autowired
    private NewsletterRepository newsRepo;

    @Override
    public Newsletter createNewsletter(Newsletter ad) {
        return newsRepo.save(ad);
    }

    @Override
    public Newsletter getNewsletterbyId(Long id) {
        return newsRepo.findById(id).get();
    }

    @Override
    public void deleteNewsletter(Long id) {
        newsRepo.deleteById(id);
    }

    @Override
    public Newsletter updateNewsletter(Newsletter a, Long id) {
        Newsletter news = newsRepo.findById(id).get();
        news.setId(a.getId());
        news.setTitle(a.getTitle());
        news.setDescription(a.getDescription());
        return newsRepo.save(news);
    }
}
