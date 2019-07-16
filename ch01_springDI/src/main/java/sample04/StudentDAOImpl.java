package sample04;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void insert(Student student) {
		System.out.println("StudentDAOImpl의 insert 호출..");
		System.out.println("이름 : " + student.getName());
		System.out.println("넘버 : " + student.getNo());
		System.out.println("전화 : " + student.getPhone());
		System.out.println("주소 : " + student.getAddr());
	}
}
