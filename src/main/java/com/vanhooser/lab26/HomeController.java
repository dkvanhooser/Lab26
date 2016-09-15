package com.vanhooser.lab26;

import java.util.Map;
import java.util.Collections;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {		
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
		User user = new User();
		model.put("userForm", user);
		return "index";
	}
	@RequestMapping(value = "/loginfailed", method = RequestMethod.POST)
	public String welcomeBack(Map<String, Object> model) {
		User user = new User();
		model.put("userForm", user);
		return "index";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView doLogin(@Valid @ModelAttribute("userForm") User userForm,
            BindingResult result, Map<String, Object> model) {
		ModelAndView mv;
        if (result.hasErrors()) {
        	mv = new ModelAndView("index");
            return mv;
        }
        if(DAO.userAndPassValidator(userForm)){
        	 mv = new ModelAndView("welcome");
        	return mv;	
        }else 
        
	return new ModelAndView("loginfailed");
	}
}
