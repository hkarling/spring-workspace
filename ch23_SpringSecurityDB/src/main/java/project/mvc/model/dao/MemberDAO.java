package project.mvc.model.dao;

import project.mvc.model.dto.Member;

public interface MemberDAO {
  /**
   *  회원가입
   * */
	int insertMember(Member member);
	
	
	/**
	 * ID에 해당하는 회원정보 검색
	 * */
	Member selectMemberById(String id);
}
