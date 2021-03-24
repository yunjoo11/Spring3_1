package com.joo.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int setUpdate(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setDelete(bankBookDTO);
	}
	
	public List<BankBookDTO> getList()throws Exception{
		
		return bankBookDAO.getList();
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO)throws Exception{
		
		return bankBookDAO.getSelect(bankBookDTO);
	}
	
}
