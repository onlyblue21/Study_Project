package com.Controller;

import java.util.ArrayList;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.Pro_Service;
import com.vo.MemberVo;

@Controller
public class MemberController {

	@Resource(name="Pro_Service")
	public Pro_Service Pro_service; 
	
	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
	public String memberjoin(Locale locale, Model model) {
		
		System.out.println("회원가입 화면");
		String test ="회원가입 화면";
		model.addAttribute("test", test);
		
		return "/Member/MemberJoin";
	}
	@RequestMapping(value = "/memberjoin_j", method = RequestMethod.POST)
	public String memberjoin_j(Locale locale, Model model, MemberVo membervo) throws Exception{
		
		int firstvalue=0;
		if(!membervo.getId().equals(null) || !membervo.getId().equals("") ){
		
			membervo.setUser_level(firstvalue);
			membervo.setUser_exp(firstvalue);
			membervo.setAccess_count(firstvalue);
			membervo.setMember_point(firstvalue);
			membervo.setSts("");
			
			Pro_service.memberjoin(membervo);
			model.addAttribute("member",membervo);
			System.out.println("회원가입 완료!");
		}
		
		
		return "/Main/Main";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Locale local, Model model, MemberVo membervo)throws Exception {
		System.out.println("login");
		System.out.println("id,pw 값 불러와서 로그인함");
		
		boolean _login = false;
		_login = Pro_service.Login(membervo);
		
		if(_login){
			System.out.println("LOGIN 성공");
			model.addAttribute("logincheck",membervo);
		}else{
			model.addAttribute("login","ID가 없습니다.");
			return "/Main/Main";
		}
		
		
		String test = "login됨";
		model.addAttribute("test",test);
		
		return "/Main/Main";
	}
	
	
}
