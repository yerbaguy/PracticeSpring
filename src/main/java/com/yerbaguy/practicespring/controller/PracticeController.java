package com.yerbaguy.practicespring.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.yerbaguy.practicespring.model.SayHallo;


@Controller
public class PracticeController  {

	
	@RequestMapping( value = {"/","/welcome"}, method = RequestMethod.GET)
	//@RequestMapping( value = {"/","/welcome"})
	//@Path("/welcome")
	public ModelAndView halloWorld(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		
		//ModelAndView model = new ModelAndView("welcome");
		
		SayHallo sayHallo = new SayHallo();
		
		sayHallo.setHallo("lkjasdf");
		
		//String getMessage = sayHallo.getHallo();
		
	//	model.addAttribute("message", sayHallo.getHallo());
		
		//String message="lkjasdlkf";
		
		//model.addObject("msg", "lkajsdflkjasd");
		
		//return "welcome";
		return new ModelAndView("welcome", "command", new SayHallo());
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String yesHalloWorld(@ModelAttribute("SpringWeb") SayHallo sayHallo, ModelMap model) {
		
		
		
		//System.out.println(message);
		sayHallo.setHallo("lkjasdf");
		String message = sayHallo.getHallo();
		
		System.out.println("Message:" + message);
		
		//String message = "lkjasdf";
		
		//Map<String,Object> map = new HashMap<String, Object>();
		
		//map.put("message", sayHallo.getHallo());
		
		model.addAttribute("hallo", sayHallo.getHallo());
		
		//ModelAndView mav = new ModelAndView("welcome");
		
		//return new ModelAndView("welcome", "message", message);
		return "welcome";
	}
	
	
}
