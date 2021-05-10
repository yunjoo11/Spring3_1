package com.joo.s3.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.joo.s3.util.FileManager;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private FileManager fileManager;
	
	public int memberUpdate(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberUpdate(memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO,HttpSession session)throws Exception{
		MemberFileDTO memberFileDTO = memberDAO.getMemberFile(memberDTO);	
		boolean check = fileManager.delete("member", memberFileDTO.getFileName(), session);
		return memberDAO.memberDelete(memberDTO);
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		memberDTO = memberDAO.memberLogin(memberDTO);
		//MemberFileDTO memberFileDTO = memberDAO.memberLoginFile(memberDTO);
		//memberDTO.setMemberFileDTO(memberFileDTO);
		return memberDTO;
	}
	
	public int memberJoin(MemberDTO memberDTO, MultipartFile avatar, HttpSession session)throws Exception{
		String fileName= fileManager.save("member", avatar, session);
		
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setId(memberDTO.getId());
		memberFileDTO.setOrigineName(avatar.getOriginalFilename());
		memberFileDTO.setFileName(fileName);
		
		int result = memberDAO.memberJoin(memberDTO);
		result = memberDAO.setFileInsert(memberFileDTO);
		
		
		return result;
	}
	
}
