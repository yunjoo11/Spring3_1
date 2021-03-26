package com.joo.s3.account;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.joo.s3.member.MemberDTO;

@Repository
public class AccountDAO {

	@Autowired
	private SqlSession sqlSession; //mapper의 위치를 알고있음
	private final String NAMESPACE="com.joo.s3.account.AccountDAO.";

	
	

	public List<AccountDTO> getList(AccountDTO accountDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList", accountDTO);
	}

	public int setInsert(AccountDTO accountDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert", accountDTO);
	}
}
