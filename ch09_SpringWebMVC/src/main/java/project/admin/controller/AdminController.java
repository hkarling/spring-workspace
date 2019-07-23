package project.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("test.admin")
	public String test() {
		System.out.println("AdminContoller의 test.admin 요청..");
		return "admin/result"; // /WEB-INF/views/admin/result.jsp
	}
}
