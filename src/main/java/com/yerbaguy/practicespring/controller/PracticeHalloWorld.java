package com.yerbaguy.practicespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yerbaguy.practicespring.model.SayHallo;


@Controller
@RequestMapping("/practicecontroller")
public class PracticeHalloWorld {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(Model model) {
	 
//	String message = "<br><div style='text-align:center;'>"
//	+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
//	return new ModelAndView("welcome", "message", message);
		
//		String message = new String("lkjasdf");
//		System.out.println(message);
		
//		SayHallo sayHallo = new SayHallo();
//		sayHallo.setMessage("lkjasdf");
		
		
		ModelAndView mav = new ModelAndView("welcome");
//		mav.addObject("message", sayHallo);
		
		mav.addObject("msg", "test");
		
//		mav.setViewName("welcome");
		
	
		String message = "lkjasdflk";
		
		
		System.out.println(message);
		
		//model.addAttribute("message", message);
		
	//	return "welcome";
		
		return mav;
		
	//	return mav;
		
		//return new ModelAndView("welcome", "message", message);
		
	}
	

}
