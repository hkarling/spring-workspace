package sample01;

public class MessageBeanKorImpl implements MessageBean {

	public MessageBeanKorImpl() {
		System.out.println("MessageBeanKorImpl 생성자 호출.");
	}

	@Override
	public void sayHello(String name) {

		System.out.println(name + " 안녕.");
	}
}
