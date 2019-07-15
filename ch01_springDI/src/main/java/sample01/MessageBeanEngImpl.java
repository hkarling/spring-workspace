package sample01;

public class MessageBeanEngImpl implements MessageBean {

	public MessageBeanEngImpl() {
		System.out.println("MessageBeanEngImpl 생성자 호출.");
	}

	@Override
	public void sayHello(String name) {

		System.out.println("Hello! " + name);
	}

}
