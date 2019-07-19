package project.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.mvc.model.dto.MemberDTO;

@Controller
@RequestMapping("/param")
public class ParameterController {
	/**
	 * void이면 요청이 뷰이름 -> param/a.jsp로 이동 parameter의 model객체는 뷰쪽에 전달될 정보.
	 */
	@RequestMapping("/a.do")
	public void aa(String name, Integer age, Model model) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);

		model.addAttribute("message", "졸지 말라우..");
		model.addAttribute("hobbies", new String[] { "등산", "낚시", "게임" });
	}

	/**
	 * parameter로 전달된 MemberDTO객체는 뷰에서 사용가능 : 클래스 이의 첫글자만 소문자 뷰페이지에서 ->
	 * ${memberDTO.id}
	 * 
	 * @param 에서 @ModelAttribute("dto")라는 별칭만들기 -> 뷰페이지에서 ${dto.속성}
	 */
	@RequestMapping("/c.do")
	public void aaa(@ModelAttribute("dto") MemberDTO dto) {
		System.out.println("아이디 : " + dto.getId());
		System.out.println("이름 : " + dto.getName());
	}

	@ModelAttribute("message") // 뷰에서 ${message}로 리턴 값을 사용할 수 있다.
	public String bb() {
		System.out.println("@ModelAttribute를 선언한 bb()메소드..");
		return "@ModelAttribute 연습중입니다:)";
	}

	@ModelAttribute("fruitList") // 뷰에서 ${fruitList}로 사용가능
	public List<String> cc() {
		List<String> list = new ArrayList<String>();
		list.add("딸기");
		list.add("포도");
		list.add("바나나");
		list.add("귤");
		return list;
	}

	@RequestMapping("/d.do")
	public String ff(@RequestParam(value = "id", required = false) String userId,
			@RequestParam(defaultValue = "0") int age) {
		System.out.println("userId = " + userId);
		System.out.println("age = " + age);

		return "result";
	}
}
