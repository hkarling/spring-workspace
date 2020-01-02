package sample09;

import org.springframework.beans.factory.annotation.Required;

public class EmpDTO {

	private int empno;
	private String name;
	private String job;

	public int getEmpno() {
		return empno;
	}

	@Required // 필수!!
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
