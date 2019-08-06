package project.mvc.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.mvc.model.dto.Authority;

@Repository
public class AuthoritiesDAOImpl implements AuthoritiesDAO {

    @Autowired
    private SqlSession session;
    
    @Override
    public int insertAuthority(Authority authority) {
	return session.insert("authoritiesMapper.insertAuthority", authority);
    }

    @Override
    public List<Authority> selectAuthorityByUserName(String userName) {
	// TODO Auto-generated method stub
	return null;
    }

}
