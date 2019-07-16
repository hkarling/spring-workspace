package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		// controller 호출 -> service 호출 -> dao 호출 -> 결과 출력
		ApplicationContext context = new ClassPathXmlApplicationContext("sample04/springDISetter.xml");
		StudentController controller = context.getBean("controller", StudentController.class);
		controller.insert();

	}
}
