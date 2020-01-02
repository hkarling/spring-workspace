package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class BoardController {
	@Autowired
	BoardDTO boardDTO;
	@Autowired
	BoardDTO boardDTO2;
	@Autowired
	BoardService boardService;
	
	void test() {
		System.out.println("BoardController의 test() 호출.. ");
		System.out.println("boardDTO = " + boardDTO);
		System.out.println("boardDTO2 = " + boardDTO2);
	}
}
