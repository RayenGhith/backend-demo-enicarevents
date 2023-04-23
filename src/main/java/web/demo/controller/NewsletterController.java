package web.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.demo.model.Newsletter;
import web.demo.service.NewsletterService;

@RestController
@CrossOrigin(origins = "*")
public class NewsletterController {

    @Autowired
    private NewsletterService newsService;

    @PostMapping("/newsletter/add")
    public Newsletter createEvent(@RequestBody Newsletter e) {
        Newsletter ev = newsService.createNewsletter(e);
        return ev;
    }

    @PutMapping("/newsletter/update/{id}")
    public Newsletter updateEventbyid(@RequestBody Newsletter eve,@PathVariable("id") Long id){
        return  newsService.updateNewsletter(eve,id);
    }

    @DeleteMapping("/newsletter/delete/{id}")
    public String deleteNewsletter(@PathVariable("id") Long id){
        newsService.deleteNewsletter(id);
        return "newsletter deleted successfully";
    }
}
