package com.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.Pro_Service;
import com.vo.MemberVo;

/**
 * Handles requests for the application home page.
*/
@Controller
public class MainController {
	
	@Resource(name="Pro_Service")
	public Pro_Service Pro_service; 
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String home(Locale locale, Model model, MemberVo membervo) throws Exception{
		
		System.out.println("====================");
		System.out.println("====================");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		String test ="main화면";
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("test", test);
		
		return "/Main/Main";
	}
	
	
	
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public String main(Locale local, Model model){
		System.out.println("main");
		String test = "main";
		model.addAttribute("test",test);
		
		return "/Main/Main";
	}
	
	
}
