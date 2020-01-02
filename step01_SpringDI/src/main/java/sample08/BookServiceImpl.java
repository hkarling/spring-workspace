package sample08;

public class BookServiceImpl implements BookService {

	MessageSender messageSender;
	EmailSender emailSender;
	BookDAO bookDao;
	
	public BookServiceImpl() {

	}
	
	public BookServiceImpl(BookDAO bookDao) {
		this.bookDao = bookDao;
	}

	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}
	
	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	@Override
	public void save(BookDTO book1, BookDTO book2) {

		bookDao.save(emailSender, messageSender, book1, book2);
	}
}
