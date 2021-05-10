package com.joo.s3.board;

import java.util.List;

import com.joo.s3.util.Pager;
import com.joo.s3.util.Pager_backUp;

public interface BoardDAO {
	//상수, 추상메서드
	//접근 지정자는 무조건 public abstract
	
	
	//list
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	//전체 글의 갯수
	public long getTotalCount(Pager pager)throws Exception;
	
	//글 조회
	public BoardDTO getSelect(BoardDTO boardDTO)throws Exception;
	
	//hit update
	public int setHitUpdate(BoardDTO boardDTO)throws Exception;
	
	//글 추가
	public int setInsert(BoardDTO boardDTO)throws Exception;
	
	//글 수정
	public int setUpdate(BoardDTO boardDTO)throws Exception;
	
	//글 삭제
	public int setDelete(BoardDTO boardDTO)throws Exception;
	
	
	

}