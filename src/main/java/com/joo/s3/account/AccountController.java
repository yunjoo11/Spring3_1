package com.joo.s3.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/account/**")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@RequestMapping("accountList")
	public void accountList()throws Exception {
		
	}
	
}
