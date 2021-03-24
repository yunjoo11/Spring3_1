package com.joo.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("memberLogin")
	public void memberLogin()throws Exception{
		
	}
	@RequestMapping(value="memberLogin", method=RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO)throws Exception{
		memberDTO=memberService.memberLogin(memberDTO);
		return "redirect:../";
	}
	@RequestMapping("memberJoin")
	public void memberJoin()throws Exception {
		
	}
	
	@RequestMapping(value="memberJoin", method=RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO)throws Exception {
		int result= memberService.memberJoin(memberDTO);
		return "redirect:../";
	}
	
}
