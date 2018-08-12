package spring.request.controllers;

import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.acess.obj.interfaces.UserCRUD;
import spring.business.model.frames.User;

@Controller
public class IndexSignupLoginModuleControllers {
	
private UserCRUD userDao;

@RequestMapping(value = "/welcome", method = RequestMethod.GET )	
public ModelAndView welcome() {
	return new ModelAndView("index");	
}

@RequestMapping(value = "/signup", method = RequestMethod.GET )	
public ModelAndView signup() {
return new ModelAndView("signup");	
}

@RequestMapping(value = "signup/registration", method = RequestMethod.POST )	
public ModelAndView signupFromSubmit(@ModelAttribute("user") User user, BindingResult result) {
//public ModelAndView signupFromSubmit(@RequestParam Map<String,String> binder) {
	
	if(result.hasErrors()) {
		ModelAndView model = new ModelAndView("signup");
		return model;
	}
	
	
	try {
		System.out.println(user.getCity());
		System.out.println(user.getEmailId());
		userDao.createUser(user);
	} catch (IllegalStateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("in controller");
	
	
return new ModelAndView("index");	
}

public UserCRUD getUserDao() {
	return userDao;
}

@Autowired
@Qualifier("UserDaoImplBean")
public void setUserDao(UserCRUD userDao) {
	System.out.println("set DAO");
	this.userDao = userDao;
}


}
