package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        /* 기존 방식 */
//        MessageBean bean = new MessageBeanKorImpl();
//        bean.sayHello("참솔");
//        bean = new MessageBeanEngImpl();
//        bean.sayHello("Chamsol");

        ApplicationContext context = new ClassPathXmlApplicationContext("sample01/applicationContext.xml"); // 이게 일반적
//				new FileSystemXmlApplicationContext("src/main/java/sample01/applicationContext.xml");

        MessageBean bean = context.getBean("kor", MessageBean.class);
        bean.sayHello("참솔");

        bean = context.getBean("eng", MessageBean.class);
        bean.sayHello("Chamsol");
    }
}