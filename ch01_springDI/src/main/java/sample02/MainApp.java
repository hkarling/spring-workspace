package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample02/springDIConstructor.xml");
		
//		System.out.println("------------------ 기존방법 -----------------");
//		MemberDAO memberDAO = new MemberDAO();
//		Member member = new Member("king","1234",23,"서울");
//		MemberService service = new MemberService(memberDAO, member);
//		service.insert();
		
		System.out.println("------------------ MainApp ----------------");
		MemberService service = context.getBean("service", MemberService.class);
		service.insert();
		
	}
}
