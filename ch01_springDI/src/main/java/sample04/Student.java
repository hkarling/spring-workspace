package sample04;

public class Student {
	private String name;
	private int no;
	private String phone;
	private String addr;
	
	public Student() { // <bean class="student" />
		System.out.println("Student 기본생성자 호출..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName 호출..");
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		System.out.println("setNo 호출..");
		this.no = no;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		System.out.println("setPhone 호출..");
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		System.out.println("setAddr 호출..");
		this.addr = addr;
	}
}
