package com.joo.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.joo.s3.member.MemberDAO";
	
	public int memberUpdate(MemberDTO memberDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"memberUpdate", memberDTO);		
	}	
	
	public int memberDelete(MemberDTO memberDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"memberDelete", memberDTO);
		
	}

	//memberJoin 데이터를 받아서 db에 insert하는 메서드
	public int memberJoin(MemberDTO memberDTO)throws Exception{
		int result = sqlSession.insert(NAMESPACE+"memberJoin",memberDTO);
		return result;		
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		
		memberDTO=sqlSession.selectOne(NAMESPACE+"memberLogin", memberDTO);
		
		return memberDTO;
	}
}
