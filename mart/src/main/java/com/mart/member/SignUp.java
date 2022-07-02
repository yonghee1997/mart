package com.mart.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "member")
public class SignUp {

	@GetMapping("/signUp")
	public String goSignUp() {
		
		return "/member/signUp";
	}
}
