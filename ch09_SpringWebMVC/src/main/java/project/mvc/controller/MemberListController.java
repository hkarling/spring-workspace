package project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import project.mvc.model.dto.MemberDTO;
import project.mvc.model.dto.MemberListDTO;

@Controller
public class MemberListController {
	@RequestMapping("/list/memberMulti.do")
	public void test(MemberListDTO dto) { // collection을 인자로 받진 못한다.
		for(MemberDTO m:dto.getList()) {
			System.out.print("state:"+ m.isState());
			System.out.print("name: " + m.getName());
			System.out.print("age: " + m.getAge());
			System.out.println("addr: " + m.getAddr());
		}
	}
}
