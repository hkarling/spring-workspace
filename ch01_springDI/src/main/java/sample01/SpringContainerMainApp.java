package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainerMainApp {

	public static void main(String[] args) {

		/**
		 * SpringContainer의 종류
		 * 
		 * - BeanFactory
		 *  : 객체의 생성과 소멸까지의 lifeCycle을 관리
		 * 
		 * - ApplicationContext
		 *  : BeanFactory의 확장으로 BeanFactory + 국제화(다국어)지원, 메세지처리등 더
		 *    많은 부가기능을 제공함으로 ApplicationContext를 더 많이 사용한다.
		 *  : 사전초기화(객체를 미리생성)
		 *    동일한 id를 여러번 getBean으로 받으면 모두동일한 객체를 반환
		 *    scope=singleton 이라 그렇다.
		 *  : scope="prototype" 설정하면 지역초기화(필요해질때 생성)
		 *  
		 * - WebApplicationContext
		 *  : 웹사이트를 구축할때 사용하는 Container
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample01/applicationContext.xml");
		
		MessageBean bean1 = context.getBean("kor", MessageBean.class);
		MessageBean bean2 = context.getBean("eng", MessageBean.class);
		MessageBean bean3 = context.getBean("eng2", MessageBean.class);
		MessageBean bean4 = context.getBean("eng", MessageBean.class);
		
		System.out.println("bean1=" + bean1);
		System.out.println("bean2=" + bean2);
		System.out.println("bean3=" + bean3);
		System.out.println("bean4=" + bean4);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
