package com.joo.s3.board;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.joo.s3.util.Pager;

public interface BoardService {
	
	//list
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	//글 조회
	public BoardDTO getSelect(BoardDTO boardDTO)throws Exception;
	
	//글 추가
	public int setInsert(BoardDTO boardDTO, MultipartFile [] files)throws Exception;
	
	//글 수정
	public int setUpdate(BoardDTO boardDTO)throws Exception;
	
	//글 삭제
	public int setDelete(BoardDTO boardDTO)throws Exception;

}