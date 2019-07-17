package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sample11.BookDAO;

@Repository // id="bookDAOImpl"
public class BookDAOImpl implements BookDAO {

	@Autowired
	DbUtil dbUtil;

	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2) {
		System.out.println("emailSender :" + emailSender);
		System.out.println("messageSender :" + messageSender);
		System.out.println("book1 :" + book1);
		System.out.println("book2 :" + book2);
		System.out.println("dbUtil :" + dbUtil);
	}
}
