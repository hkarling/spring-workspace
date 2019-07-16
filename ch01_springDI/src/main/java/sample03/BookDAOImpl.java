package sample03;

public class BookDAOImpl implements BookDAO {

	@Override
	public void insert(BookVO bookVO) {
		System.out.println("BookDAOImpl에서 insert 호출됨..");
		System.out.println("과목: " + bookVO.getSubject());
		System.out.println("작성자: " + bookVO.getWriter());
		System.out.println("가격: " + bookVO.getPrice());
		System.out.println("날짜: " + bookVO.getDate());
	}
}