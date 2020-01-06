package hkarling.test;

import hkarling.test.service.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = context.getBean("target1", Player.class);
        player.start(1);
        player.pause();
        player.stop();
        System.out.println("--------------------------");
        player = context.getBean("target2", Player.class);
        player.start(1);
        player.pause();
        player.stop();
        System.out.println("--------------------------");
        player = context.getBean("target3", Player.class);
        player.start(1);
        player.pause();
        player.stop();
    }
}
