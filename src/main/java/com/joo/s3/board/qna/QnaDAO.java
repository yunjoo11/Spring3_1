package com.joo.s3.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.joo.s3.board.BoardDAO;
import com.joo.s3.board.BoardDTO;
import com.joo.s3.board.BoardFileDTO;
import com.joo.s3.util.Pager;
import com.joo.s3.util.Pager_backUp;

@Repository
public class QnaDAO implements BoardDAO{
	
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.joo.s3.board.qna.QnaDAO.";
	
	public int setReplyUpdate(QnaDTO qnaDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setReplyUpdate", qnaDTO);
	}
	
	public int setReply(QnaDTO qnaDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setReply", qnaDTO);
	}
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}

	@Override
	public long getTotalCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getTotalCount", pager);
	}

	@Override
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getSelect", boardDTO);
	}

	@Override
	public int setHitUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setHitUpdate", boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setInsert", boardDTO);
	}
	
	public int setFileInsert(BoardFileDTO boardFileDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setFileInsert", boardFileDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setUpdate", boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"setDelete", boardDTO);
	}
	

}