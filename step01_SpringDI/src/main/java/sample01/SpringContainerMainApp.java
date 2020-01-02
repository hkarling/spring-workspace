package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainerMainApp {
    public static void main(String[] args) {

        /**
         * Spring Container의 종류
         *  - BeanFactory
         *    : 객체의 생성과 소멸까지 객체를 관리한다.
         *
         *  - ApplicationContext
         *    : BeanFactory의 확장으로 BeanFactory + 국제화 (다국어지원, 메시지처리 등 더 많은 부가기능을 제공)
         *      ApplicationContext를 더 많이 쓴다.
         *    : 사전초기화 (객체를 미리 생성한다)
         *      동일한 id를 여러번 getBean으로 받으면 모두 동일한 객체를 반환한다. scope="singleton" by default
         *    : scope="prototype"로 작성 시 지역 초기화하여 필요할 때 생성한다.
         *
         *  - WebApplicationContext
         *    : 웹사이트를 구축할 때 사용하는 container
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("sample01/applicationContext01.xml");

        MessageBean bean1 = context.getBean("kor", MessageBean.class);
        MessageBean bean2 = context.getBean("eng", MessageBean.class);
        MessageBean bean3 = context.getBean("eng2", MessageBean.class);
        MessageBean bean4 = context.getBean("eng", MessageBean.class);

        System.out.println("bean1=" + bean1);
        System.out.println("bean2=" + bean2);
        System.out.println("bean3=" + bean3);
        System.out.println("bean4=" + bean4);
    }
}
