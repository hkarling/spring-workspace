package sample06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample06/applicationContext06-2.xml");
		
		ListBean bean = context.getBean("listBean", ListBean.class);
		System.out.println("----------------------------------");
		for(int i : bean.getIntList()) {
			System.out.println(i);
		}
		System.out.println("----------------------------------");
		for(String str: bean.getStrList()) {
			System.out.println(str);
		}
		System.out.println("----------------------------------");
		for(Customer customer : bean.getCustomerList()) {
			System.out.println(customer);
		}
	}
}
