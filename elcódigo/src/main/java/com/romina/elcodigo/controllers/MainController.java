package com.romina.elcodigo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	   @RequestMapping(value="/login")
	    public String login() {
		   
		   return "index.jsp";
	   }
	   
	   @RequestMapping(value="/login", method=RequestMethod.POST)
	   public String login(@RequestParam(value="password") String password) {
		   if (password.equals("bushido")) {
	            return "redirect:/code";
		   }
		   else {
			   return "redirect:/createError";
		   }
	   }
	
	@RequestMapping("/code")
    public String code() {
		   
	   return "code.jsp";
	}
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/login";
	}
}