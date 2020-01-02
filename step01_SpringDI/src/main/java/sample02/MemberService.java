package sample02;

public class MemberService {
    private MemberDAO memberDAO;
    private Member member;

    public MemberService() {
        System.out.println("MemberService 호출..");
    }

    public MemberService(MemberDAO memberDAO, Member member) {
        System.out.println("MemberService(MemberDAO memberDAO, Member member) 호출..");
        System.out.println("memberDAO=" + memberDAO);
        System.out.println("member=" + member);
        this.memberDAO = memberDAO;
        this.member = member;
    }

    public void insert() {
        memberDAO.insert(member);
    }
}
