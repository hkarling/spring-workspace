package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	@Autowired
	BookDTO book1;
	@Autowired
	BookDTO book2;
	
	public void invoker() {
		bookService.save(book1, book2);
	}
}
