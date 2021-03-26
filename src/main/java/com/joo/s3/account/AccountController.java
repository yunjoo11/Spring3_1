package com.joo.s3.account;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joo.s3.member.MemberDTO;

@Controller
@RequestMapping(value="/account/**")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("accountInsert")
	public String setInsert(AccountDTO accountDTO, HttpSession session)throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		int result = accountService.setInsert(accountDTO);
		return "redirect:./accountList";

	}
	
	
	@RequestMapping("accountList")
	public void getList()throws Exception{}

	
}
