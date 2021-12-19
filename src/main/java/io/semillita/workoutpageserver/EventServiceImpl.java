package io.semillita.workoutpageserver;

import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

	public EventRepository eventRepository;
	
	public EventServiceImpl(EventRepository eventRepository) {
		super();
		this.eventRepository = eventRepository;
	}

	@Override
	public Event saveEvent(Event event) {
		return eventRepository.save(event);
	}
	
}
