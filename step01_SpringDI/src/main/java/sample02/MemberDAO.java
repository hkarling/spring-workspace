package sample02;

public class MemberDAO {

    public MemberDAO() {
        System.out.println("MemberDAO 호출..");
    }

    public void insert(Member member) {
        System.out.println("MemberDAO의 insert 호출..");
        System.out.println("id=" + member.getId());
        System.out.println("pwd=" + member.getPwd());
        System.out.println("age=" + member.getAge());
        System.out.println("addr=" + member.getAddr());
    }
}
