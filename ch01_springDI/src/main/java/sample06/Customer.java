package sample06;

public class Customer {
	private int empno;
	private String ename;
	private String job;
	
	public Customer() {	
		System.out.println("Customer 기본생성자 call..");
	}

	public Customer(int empno) {
		System.out.println("Customer(int empno) call..");
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Customer [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
	}
}
