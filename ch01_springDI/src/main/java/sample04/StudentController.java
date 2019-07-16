package sample04;

public class StudentController {
	
	private StudentService service;
	private Student student;
	
	public void insert() {
		service.insertService(student);
	}
	
	public void setService(StudentService service) {
		System.out.println("StudentController의 setService(StudentService service) 호출.. service: " + service);
		this.service = service;
	}
	public void setStudent(Student student) {
		System.out.println("StudentController의 setStudent(Student student) 호출.. student: " + student);
		this.student = student;
	}
}
