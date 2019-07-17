package aop.exam;

import org.springframework.aop.framework.AopContext;

public class MessageServiceImpl implements MessageService {

	public void KorHello() {
		System.out.println("MessageServiceImpl의 KorHello()의 핵심기능이다.");
		try {
			System.out.println("*****");
			/**
			 * advice를 적용할 타겟대상을 직접호출하면 advice 적용이 안된다.
			 * proxyServer를 구해서 proxy가 호출할 수 있도록 한다.
			 */
			
			MessageService se = (MessageService)AopContext.currentProxy();
			se.engHello("RJW...");
			
//			this.engHello("껒..");

			System.out.println("*****");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void engHello(String name) {
		System.out.println("MessageServiceImpl의 engHello(String name)의 핵심기능이다.");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String hello() {
		System.out.println("MessageServiceImpl의 hello()의 핵심기능이다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "안녕하냐고오오오";
	}

	public int hello(String name) {
		System.out.println("MessageServiceImpl의 hello(String name)의 핵심기능이다.");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 49;
	}
}
