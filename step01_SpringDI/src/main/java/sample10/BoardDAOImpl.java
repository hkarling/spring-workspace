package sample10;

import org.springframework.stereotype.Repository;

/**
 * id는 생성되는 클래스의 첫글자만 소문자로...
 * @author hkarling
 *
 */
@Repository
public class BoardDAOImpl implements BoardDAO {

	@Override
	public void select() {
		System.out.println("BoardDAOImpl의 select() 호출..");
	}

}
