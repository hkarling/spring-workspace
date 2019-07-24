package project.dto;

public class EmpDTO {
	private int empNo;
	private String name; // db에 ename
	private String job;
	private int sal;

	public EmpDTO() {

	}
	
	public EmpDTO(int empNo, String name, String job, int sal) {
		this.empNo = empNo;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmpDTO [empNo=" + empNo + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}
}
