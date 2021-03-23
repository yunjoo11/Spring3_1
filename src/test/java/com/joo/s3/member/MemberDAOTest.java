package com.joo.s3.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.joo.s3.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest{

	@Autowired
	private MemberDAO memberDAO ;
	
	@Test
	public void memberLoginTest() throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("iu");
		memberDTO.setPw("pw1");
		
		MemberDTO result=memberDAO.memberLogin(memberDTO);
		
		assertEquals(1, result);
	}
	
}
