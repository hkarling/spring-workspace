package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// 1. 기존방식
//		MessageBean bean = new MessageBeanKorImpl();
//		bean.sayHello("참솔");
//		
//		bean = new MessageBeanEngImpl();
//		bean.sayHello("Chamol");

		/**
		 * Spring을 이용한 객체 생성 및 주입 - spring 설정문서들을 작성한다. - spring container를 생성하여 관리한다.
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("sample01/applicationContext.xml"); // 이게 일반적
//				new FileSystemXmlApplicationContext("src/main/java/sample01/applicationContext.xml");

		MessageBean bean = context.getBean("kor", MessageBean.class);
		bean.sayHello("참솔");

		bean = context.getBean("eng", MessageBean.class);
		bean.sayHello("Chamsol");
	}
}
