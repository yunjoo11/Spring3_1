package com.joo.s3.bankbook;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestExecutionListeners;

import com.joo.s3.MyAbstractTest;


public class BankBookDAOTest extends MyAbstractTest{
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test
	public void setWriteTest() throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("Test");
		bankBookDTO.setBookRate(0.12);
		bankBookDTO.setBookSale("Y");
		
		int result = bankBookDAO.setWrite(bankBookDTO);
		
		assertEquals(1, result);
	}

	
	

}
