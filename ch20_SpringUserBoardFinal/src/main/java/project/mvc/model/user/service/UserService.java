package project.mvc.model.user.service;

import project.mvc.model.user.dto.UserDTO;

public interface UserService {
	/**
	 * 로그인 체크
	 * */
   UserDTO loginCheck(UserDTO userDTO);
}
