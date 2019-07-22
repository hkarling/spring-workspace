package project.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import project.mvc.model.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping("/start.kosta")
	public ModelAndView select() {
		ModelAndView mv = new ModelAndView("productList");
		mv.addObject("list", service.select());
		return mv;
	}
	
	@RequestMapping("/delete.kosta")
	public String delete(HttpServletRequest request) {
		
		String code = request.getParameter("code");
		
		
		return "productList";
	}
	
	@RequestMapping("/insertForm.ko")
	public String toInsertForm() {
		return "insertForm";
	}
}
