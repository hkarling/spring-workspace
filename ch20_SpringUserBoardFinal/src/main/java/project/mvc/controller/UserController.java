package project.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import project.mvc.model.user.dto.UserDTO;
import project.mvc.model.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    /**
     * 로그인 폼
     */
    @RequestMapping("/login")
    public String login() {
	return "user/login";
    }
    
    /**
     * 로그인 체크
     */
    @RequestMapping("/loginCheck")
    public String loginCheck(UserDTO userDTO, HttpSession session) {
	UserDTO dbuserDTO = userService.loginCheck(userDTO);
	//세션의 정보 저장.
	session.setAttribute("loginUser", dbuserDTO.getUserId());
	session.setAttribute("loginName", dbuserDTO.getName());
	return "redirect:/";
    }
    
    /**
     * 로그아웃 기능
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:/";
    }
}
