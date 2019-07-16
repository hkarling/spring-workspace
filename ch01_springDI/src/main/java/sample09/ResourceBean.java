package sample09;

import javax.annotation.Resource;

public class ResourceBean {
	@Resource(name="empDTO")
	private EmpDTO emp1;
	@Resource(name="dto")
	private EmpDTO emp2;
	@Resource(name="controller")
	private EmpController controller;
	@Resource(name="service")
	private EmpService service;
	
	public void print() {
		System.out.println("emp1 = " + emp1);
		System.out.println("emp2 = " + emp2);
		System.out.println("controller = " + controller);
		System.out.println("service = " + service);
	}
}
