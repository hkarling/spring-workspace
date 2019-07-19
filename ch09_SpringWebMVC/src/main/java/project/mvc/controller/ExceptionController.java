package project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

	@RequestMapping(value = "exception.do")
	public ModelAndView aa(String no) {
		int convertNo = Integer.parseInt(no);
		int result = 100 / convertNo;
		System.out.println("결과 : " + result);

		return new ModelAndView("exResult", "result", "오류없이 동작했다.");
	}

	@ExceptionHandler({ NumberFormatException.class, ArithmeticException.class })
	public ModelAndView aaa(Exception e) {
		System.out.println("오류발생함.");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("errorView/error"); // /WEB-INF/view/errorView/error.jsp
		System.out.println(e.getMessage());
		mv.addObject("errMsg", e.getMessage());
		return mv;
	}
	
//	@RequestMapping("/test.do")
//	public void aaaa(String no) {
//		int conNo = Integer.parseInt(no);
//		System.out.println("conNo : " + conNo);
//	}
}
