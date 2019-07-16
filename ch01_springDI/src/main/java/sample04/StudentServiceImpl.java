package sample04;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;
	@Override
	public void insertService(Student student) {
		System.out.println("StudentServiceImpl의 insertService 호출..");
		studentDAO.insert(student);
	}
	public void setStudentDAO(StudentDAO studentDAO) {
		System.out.println("StudentServiceImpl의 setStudentDAO(StudentDAO studentDAO) 호출.. studentDAO: " + studentDAO);
		this.studentDAO = studentDAO;
	}
}
