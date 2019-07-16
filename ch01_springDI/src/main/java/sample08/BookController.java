package sample08;

public class BookController {

	BookService bookService;
	BookDTO book1;
	BookDTO book2;
	
	public BookController() {}

	public BookController(BookService bookService, BookDTO book1, BookDTO book2) {
		this.bookService = bookService;
		this.book1 = book1;
		this.book2 = book2;
	}

	public void invoker() {
		bookService.save(book1, book2);
	}
}
