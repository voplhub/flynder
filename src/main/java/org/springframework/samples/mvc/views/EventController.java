package org.springframework.samples.mvc.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("event/")
public class EventController {

	@Autowired
	private FBEventsService fbEventsService;


	@RequestMapping(value="get", method=RequestMethod.GET)
	public  void get() {
		 fbEventsService.getEvents();
	}





}
