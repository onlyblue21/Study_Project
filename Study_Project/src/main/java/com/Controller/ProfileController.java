package com.Controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
*/
@Controller
public class ProfileController {
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public String profile(Locale local, Model model){
		System.out.println("profile");
		String test = "profile";
		model.addAttribute("test",test);
		
		return "/profile/profile";
	}
	
	
	@RequestMapping(value = "/profileconfim" , method = RequestMethod.POST)
	public String profileconfim(Locale local, Model model){
		System.out.println("profileconfim");
		
		return "/Main/Main";
	}
	
	
}
