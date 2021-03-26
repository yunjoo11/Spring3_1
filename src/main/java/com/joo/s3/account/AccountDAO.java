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


	//계좌개설 데이터를 받아서 db에 insert하는 메서드
	public int accountOpen(AccountDTO accountDTO)throws Exception{
		int result = sqlSession.insert(NAMESPACE+"accountOpen",accountDTO);
		return result;		
	}

	public List<AccountDTO> getList(AccountDTO accountDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList", accountDTO);
	}

	public int setInsert(AccountDTO accountDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert", accountDTO);
	}
}
