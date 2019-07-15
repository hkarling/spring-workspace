package sample03;

public class BookController {
	private BookDAO bookDAO;
	private BookVO bookVO;
	
	public BookController(BookDAO bookDAO, BookVO bookVO) {
		this.bookDAO = bookDAO;
		this.bookVO = bookVO;
		
	}
	
	public void bookinsert() {
		bookDAO.insert(bookVO);
	}
}
