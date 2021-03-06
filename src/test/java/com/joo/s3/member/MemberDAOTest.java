package com.joo.s3.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.joo.s3.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest{

	@Autowired
	private MemberDAO memberDAO;
	
	
	@Test
	public void memberUpdateTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id5");
		memberDTO.setPw("pw5");
		memberDTO.setName("id5");
		memberDTO.setPhone("01011112222");
		memberDTO.setEmail("id5@naver.com");
		int result=memberDAO.memberUpdate(memberDTO);
		
		assertEquals(1,result);
	}
	
	@Test
	public void memberDeleteTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id5");
		int result = memberDAO.memberDelete(memberDTO);
		
		assertEquals(1, result);
	}
	
	@Test
	public void memberJoinTest() throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id6");
		memberDTO.setPw("pw6");
		memberDTO.setName("id6");
		memberDTO.setPhone("01011112222");
		memberDTO.setEmail("id6@naver.com");
		
		int result= memberDAO.memberJoin(memberDTO);
		
		assertNotNull(result);
	}
	
	@Test
	public void memberLoginTest() throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("iu");
		memberDTO.setPw("pw1");
		
		MemberDTO result=memberDAO.memberLogin(memberDTO);
		
		assertNotNull(result);;
	}
	
}
