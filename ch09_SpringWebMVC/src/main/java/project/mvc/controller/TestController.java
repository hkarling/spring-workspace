package project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test.do")
	public void aaaa(String no) {
		System.out.println("1111");
		int conNo = Integer.parseInt(no);
		System.out.println("conNo : " + conNo);
	}
}
