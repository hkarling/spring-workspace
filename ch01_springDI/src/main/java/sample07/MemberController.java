package sample07;

public class MemberController {

	private MemberVo member1;
	private MemberVo member2;

	public MemberController() {
		System.out.println("MemberController 기본 생성자.");
	}
	
	public MemberController(MemberVo member) {
		System.out.println("MemberController(MemberVo member) call : " + member);
		System.out.println("아이디 : " + member.getId());
	}
	
	public MemberController(MemberVo member1, MemberVo member2) {
		System.out.println("MemberController(MemberVo member1, MemberVo member2) call");
		System.out.println("아이디 : " + member1.getId());
		System.out.println("아이디 : " + member2.getId());
	}
	
	public void setMemberVo(MemberVo memberVo) {
		System.out.println("setMemberVo(MemberVo memberVo) call : " + memberVo);
		this.member1 = memberVo;

		System.out.println("아이디 : " + memberVo.getId());
	}

	public void setMemberVo2(MemberVo memberVo2) {
		System.out.println("setMemberVo2(MemberVo memberVo2) call : " + memberVo2);
		this.member2 = memberVo2;
	}
}
