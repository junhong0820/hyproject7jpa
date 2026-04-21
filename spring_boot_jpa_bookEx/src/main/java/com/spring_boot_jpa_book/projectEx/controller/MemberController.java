package com.spring_boot_jpa_book.projectEx.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_boot_jpa_book.projectEx.service.IMemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

	@Autowired
	@Qualifier("memberService")
	IMemberService memService;
	
	@GetMapping("/member/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@ResponseBody
	@PostMapping("/member/login")
	public String loginCheck(@RequestParam HashMap<String, Object> param, HttpSession session) {
		String result = memService.loginCheck(param);
		
		if(result.equals("success")) {
			session.setAttribute("sid", param.get("id"));
		}
		return result;
	}
	
	@GetMapping("/member/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}
}
