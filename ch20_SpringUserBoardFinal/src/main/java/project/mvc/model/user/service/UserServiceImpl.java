package project.mvc.model.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.mvc.model.user.dao.UserDAO;
import project.mvc.model.user.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    
    @Override
    public UserDTO loginCheck(UserDTO userDTO) {
	UserDTO dbDTO = userDAO.loginCheck(userDTO);
	if(dbDTO == null)
	    throw new RuntimeException("아이디 또는 비밀번호를 다시 확인하세요.");
	return dbDTO;
    }
}
