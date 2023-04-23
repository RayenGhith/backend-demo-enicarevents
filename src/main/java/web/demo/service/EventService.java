package web.demo.service;

import org.springframework.stereotype.Service;
import web.demo.model.Event;

import java.util.List;

@Service
public interface EventService {

    public Event createEvent(Event ad);

    public List<Event> getEvents();

    public Event getEventbyId(Long id);
    public void deleteEvent(Long id);

    public Event updateEvent(Event a , Long id);


}
