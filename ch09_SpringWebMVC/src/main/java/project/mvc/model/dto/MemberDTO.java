package project.mvc.model.dto;

public class MemberDTO {
	public boolean state;
	private String id;
	private String name;
	private int age;
	private String addr;

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println("setId called id = " + id);
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName called name = " + name);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge called age = " + age);
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		System.out.println("setAddr called addr = " + addr);
		this.addr = addr;
	}
}
