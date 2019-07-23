package project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

	@RequestMapping("{type}/{id}.do")
	public void test(@PathVariable String type,
					 @PathVariable String id) {
		System.out.println("type : " + type);
		System.out.println("id : " + id);
		System.out.println("PathVariableController의 test()");
	}
	
	@RequestMapping("/{id}") // /blog/{id}
	public void test2(@PathVariable String id) {
		System.out.println("id : " + id);
	}
	
	@RequestMapping("/borad/{detail}/{id}")
	public void test3(@PathVariable String detail,
					  @PathVariable int id) {
		System.out.println("/board/~~~");
		System.out.println("detail : " + detail);
		System.out.println("id : " + id);
	}
	
	@RequestMapping("{url}.do")
	public void url() {
		
	}
}
