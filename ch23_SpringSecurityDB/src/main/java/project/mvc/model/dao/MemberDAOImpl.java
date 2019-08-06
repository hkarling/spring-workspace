package project.mvc.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.mvc.model.dto.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Autowired
    private SqlSession session;
    
    @Override
    public int insertMember(Member member) {
	return session.insert("memberMapper.insertMember", member);
    }

    @Override
    public Member selectMemberById(String id) {
	// TODO Auto-generated method stub
	return null;
    }

}
