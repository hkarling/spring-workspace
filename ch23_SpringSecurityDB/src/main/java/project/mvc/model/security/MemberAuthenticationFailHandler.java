package project.mvc.model.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

/**
 * 인증에 실패했을때 호출되는 객체
 */
@Component // id = memberAuthenticationFailHandler
public class MemberAuthenticationFailHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
	    AuthenticationException exception) throws IOException, ServletException {
	
	/* 인증에 실패했을때 해야할 일 */
	request.setAttribute("errorMessage", exception.getMessage());
	request.getRequestDispatcher("/WEB-INF/views/member/loginForm.jsp").forward(request, response);
    }
}
