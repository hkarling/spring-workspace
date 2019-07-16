package sample08;

import sample08.BookDAO;

public class BookDAOImpl implements BookDAO {

	DbUtil dbUtil;
	
	public BookDAOImpl() {
		
	}
	
	public BookDAOImpl(DbUtil dbUtil) {
		this.dbUtil = dbUtil;
	}

	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2) {
		System.out.println("emailSender :" + emailSender);
		System.out.println("messageSender :" + messageSender);
		System.out.println("book1 :" + book1);
		System.out.println("book2 :" + book2);
		System.out.println("dbUtil :" + dbUtil);
	}
}
