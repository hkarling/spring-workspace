package aop.exam;

public class UserService {

	public int testHello() {	
		System.out.println("UserService의 testHello() 호출됨..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 5;
	}
	
	public void hello() {
		System.out.println("UserService의 hello() 호출됨..");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
