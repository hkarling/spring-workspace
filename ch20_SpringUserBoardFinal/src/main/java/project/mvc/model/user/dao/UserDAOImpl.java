package project.mvc.model.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.mvc.model.user.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {
    
    @Autowired
    private SqlSession session;
    
    @Override
    public UserDTO loginCheck(UserDTO userDTO) {
	return session.selectOne("userMapper.loginCheck", userDTO);
    }
}
