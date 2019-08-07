package project.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import project.mvc.model.dto.Member;
import project.mvc.model.service.MemberService;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/loginForm")
    public String loginForm() {
	return "member/loginForm";
    }

    /**
     * 가입 폼으로 연결
     */
    @RequestMapping("/member/joinForm")
    public void joinForm() {
    }

    /**
     * 가입하기
     */
    @RequestMapping("/member/join")
    public String join(Member member) {
	memberService.joinMember(member);
	return "member/joinSuccess";
    }

    /**
     * 관리자 메인
     */
    @RequestMapping("/admin/main")
    public void adminMain() {
	
    }
    
    @RequestMapping("/member/main")
    public void memberMain() {
	
    }
    
    @ExceptionHandler(RuntimeException.class)
    public ModelAndView error(RuntimeException ex) {
	return new ModelAndView("error/errorMessage", "message", ex.getMessage());
    }
}
