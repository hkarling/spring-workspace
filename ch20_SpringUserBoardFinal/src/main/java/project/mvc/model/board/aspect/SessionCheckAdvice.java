package project.mvc.model.board.aspect;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 자료실(등록, 검색, 상세, 수정, 삭제, 다운로드 등등을 접근할때 세션 유무를 체크할 공통 기능
 */
@Component
@Aspect
public class SessionCheckAdvice {

    @Before("execution(public * project.mvc.controller.Board*.*(..))")
    public void sessionCheck(JoinPoint joinPoint) {
	HttpSession session = (HttpSession) joinPoint.getArgs()[0];
	if(session == null || session.getAttribute("loginUser") == null)
	    throw new RuntimeException("로그인이 안되었습니다.");
    }
}
