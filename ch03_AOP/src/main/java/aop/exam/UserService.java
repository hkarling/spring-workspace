package aop.exam;

import org.springframework.stereotype.Service;

@Service("target2")
public class UserService {

	public int testHello() {	
		System.out.println("UserService의 testHello() 호출됨..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 5;
	}
	
	public void hello() {
		System.out.println("UserService의 hello() 호출됨..");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
