package project.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rem")
public class RequestMappingController {

	@RequestMapping("/a.do")
	public ModelAndView aa() {
		System.out.println("/rem/a.do가 요청되었습니다...");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result"); // /WEB-INF/views/result.jsp이동
		mv.addObject("message", "거시기가 거시기하네잉..");
		return mv;
	}
	
	/**
	 * @return : String - 리턴하는 문자열이 뷰이름이 된다.
	 * 여러개의 요청이 같은 메소드를 실행하도록...
	 */
	@RequestMapping(value = {"/b.do","/c.do" })
	public String bb() {
		System.out.println("/rem/b.do or /rem/c.do가 요청되었습니다...");

		return "result"; // /WEB-INF/views/result.jsp이동
	}
	
	/**
	 * 동일한 요청정보지만 요청방식에 따라 실행여부 다르게 함..
	 * @return : void 일경우 - 청정보가 뷰의 이름이 된다
	 * 		ex> rem/test.do 요청되면 rem/test 가 뷰가 된다. 즉슨, WEB-INF/views/rem/test.jsp로 간다.
	 * @throws Exception 
	 */
	//@RequestMapping(value="/test.do", method=RequestMethod.GET)
	@GetMapping(value="/test.do")
	public void test(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		System.out.println("test.do 요청됨. name : " + name);
	}
	
//	@RequestMapping(value="/a.do",params={"id"})
//	@RequestMapping(value="/a.do",params={"id=jang"})
//	@RequestMapping(value="/a.do",params={"id!=jang"})
	@RequestMapping(value="/a.do",params={"id","age"})
	public String cc() {
		System.out.println("a.do의 params로 필터링~");
		return "result";
	}
}
