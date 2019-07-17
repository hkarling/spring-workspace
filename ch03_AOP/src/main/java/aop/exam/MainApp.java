package aop.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/exam/applicationContext.xml");
		
		/**
		 * AOP ProxyServer 생성의 기본은 J2SE 기반 : interface를 구현한 타겟대상에서 advice를 적용할때는 반드시 interface를
		 * 이용하여 호출하여야 한다.
		 * 만약, AOP ProxyServer를 CGLIB기반으로 설정하면 interface로 호출하지 않아도 된다.
		 */
		MessageService service = context.getBean("target", MessageService.class);
		System.out.println("====== MessageService 호출 ======");		
		service.KorHello();
//		System.out.println("----------");
//		service.engHello("namename");
//		System.out.println("----------");
//		service.hello();
//		System.out.println("----------");
//		service.hello("이름이");
//		
//		UserService user = context.getBean("target2", UserService.class);
//		System.out.println("====== UserService 호출 ======");
//		user.testHello();
//		System.out.println("----------");
//		user.hello();
	}
}
