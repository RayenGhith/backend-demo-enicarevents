package web.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.demo.model.Event;
import web.demo.repo.EventRepository;
import web.demo.service.EventService;

import java.util.List;

@Service
public class EventServiceImp implements EventService {


    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event createEvent(Event ev) {
        return eventRepository.save(ev);
    }

    @Override
    public List<Event> getEvents() {
        return ((List<Event>) eventRepository.findAll());
    }

    @Override
    public Event getEventbyId(Long id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public Event updateEvent(Event a, Long id) {
        Event event = eventRepository.findById(id).get();
        event.setId(a.getId());
        event.setTitle(a.getTitle());
        event.setDescription(a.getDescription());
        event.setDate(a.getDate());
        return eventRepository.save(event);
    }
}
