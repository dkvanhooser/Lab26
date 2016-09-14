package com.vanhooser.lab26;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//		model.addAttribute("serverTime", formattedDate );
		
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {
		
		
		
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		
		
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(@Valid @ModelAttribute("userForm") User userForm,
            BindingResult result, Map<String, Object> model) {
 
        if (result.hasErrors()) {
            return "welcome";
        }
 
        return "welcome";
    }
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		
		
		
		return "index";
	}
	
}
