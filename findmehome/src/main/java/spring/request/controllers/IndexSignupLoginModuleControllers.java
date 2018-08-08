package spring.request.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IndexSignupLoginModuleControllers {

@RequestMapping(value = "/welcome", method = RequestMethod.GET )	
public ModelAndView welcome() {
	return new ModelAndView("index");	
}

@RequestMapping(value = "/signup", method = RequestMethod.GET )	
public ModelAndView signup() {
return new ModelAndView("signup");	
}
	
	
}
