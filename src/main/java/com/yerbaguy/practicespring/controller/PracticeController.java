package com.yerbaguy.practicespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/practicecontroller")
public class PracticeController {
	
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
	 
		
	String message = "Hallo World";	
		
		
	return new ModelAndView("welcome", "message", message);
	}

}
