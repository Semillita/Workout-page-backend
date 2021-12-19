package io.semillita.workoutpageserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/event")
public class EventController {

	private EventService eventService;
	
	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}
	
	@PostMapping
	public ResponseEntity<Event> saveEvent(@RequestBody Event event) {
		return new ResponseEntity<>(eventService.saveEvent(event), HttpStatus.CREATED);
	}
}