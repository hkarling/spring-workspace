package project.mvc.model.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import project.mvc.model.dao.AuthoritiesDAO;
import project.mvc.model.dao.MemberDAO;

/**
 * 인증처리 객체
 */
@Component // id = memberAuthenticationProvider
public class MemberAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private MemberDAO memberDAO;
    @Autowired
    private AuthoritiesDAO authoritiesDAO;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    
    /*
     * 사용자가 로그인을 클릭하면 사용자의 정보를 UsernamePasswordAuthenticationTocken 객체로 만들어서
     * authenticate 메소드의 인수로 전달한다.
     * 전달된 authentication에서 id와 pass를 꺼내서 DB정보와 비교를 하고 실패하면 예외를 발생시킨다. -
     * AuthenticationFailureHandler가 실행된다.
     * 만약 정보가 일치하면 인증된 사용자의 정보를 UsernamePasswordAuthenticationTocken에 저장해서 리턴한다. :
     * 부여된 모든 권한과 개인정보를 리턴한다.
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

	return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
	// TODO Auto-generated method stub
	return false;
    }

}
