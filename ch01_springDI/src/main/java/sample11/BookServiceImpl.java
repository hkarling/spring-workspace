package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // id="bookServiceImpl"
public class BookServiceImpl implements BookService {
	
	@Autowired 
	MessageSender messageSender;
	@Autowired
	EmailSender emailSender;
	@Autowired
	BookDAO bookDao;
	
	@Override
	public void save(BookDTO book1, BookDTO book2) {

		bookDao.save(emailSender, messageSender, book1, book2);
	}
}
