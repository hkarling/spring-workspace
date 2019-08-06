package project.mvc.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.mvc.model.dao.AuthoritiesDAO;
import project.mvc.model.dao.MemberDAO;
import project.mvc.model.dto.Authority;
import project.mvc.model.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;
    @Autowired
    private AuthoritiesDAO authoritiesDAO;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public int joinMember(Member member) {
	/* 패스워드를 암호화해서 저장 */
	member.setPassword(passwordEncoder.encode(member.getPassword()));

	/* 회원가입하고 */
	int result = memberDAO.insertMember(member);
	if (result == 0)
	    throw new RuntimeException("가입이 되지 않았습니다.");

	/* 가입이 성공하면 권한 추가 */
	result = authoritiesDAO.insertAuthority(new Authority(member.getId(), RoleConstant.ROLE_MEMBER));
	if (result == 0)
	    throw new RuntimeException("멤버 권한 부여에 오류가 발생하였습니다.");

	if (member.getUserType().equals("1")) {
	    result = authoritiesDAO.insertAuthority(new Authority(member.getId(), RoleConstant.ROLE_ADMIN));
	    if (result == 0)
		throw new RuntimeException("관리자 권한 부여에 오류가 발생하였습니다.");
	}

	return 1;
    }

}
