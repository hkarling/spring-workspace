package project.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import project.mvc.model.dto.ProductDTO;
import project.mvc.model.exception.MyErrorException;
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
	public ModelAndView delete(HttpServletRequest request) {
		String code = request.getParameter("code");
		service.delete(code);
		
		return this.select();
	}
	
	@RequestMapping("/insertForm.ko")
	public String toInsertForm() {
		
		return "insertForm";
	}
	
	@RequestMapping("/insert.ko")
	public ModelAndView insert(ProductDTO productDTO) {
		service.insert(productDTO);
		
		return this.select();
	}
	
	@ExceptionHandler(MyErrorException.class)
	public ModelAndView myErrorExceptionHandler(Exception e) {
		
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errMessage", e.getMessage());
		
		return mv;
	}
}
