package web.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.demo.model.Event;
import web.demo.service.EventService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EventsController {

    @Autowired
    private EventService eventService;

    @PostMapping("/event/add")
    public Event createEvent(@RequestBody Event e) {
        Event ev = eventService.createEvent(e);
        return ev;
    }

    @GetMapping("/event/getall")
    public List<Event> getAllEvents(){
        return eventService.getEvents();
    }
    @PutMapping("/event/update/{id}")
    public Event updateEventbyid(@RequestBody Event eve,@PathVariable("id") Long id){
        return  eventService.updateEvent(eve,id);
    }
    @DeleteMapping("/event/delete/{id}")
    public String deleteEvent(@PathVariable("id") Long id){
        eventService.deleteEvent(id);
        return "event deleted successfully";
    }
    @GetMapping("/event/getadminbyid/{id}")
    public Event getadminbyid(@PathVariable("id") Long id){
        return eventService.getEventbyId(id);
    }

}
