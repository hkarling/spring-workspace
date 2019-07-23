package project.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("{code}")
	public String delete(@PathVariable String code) {
		service.delete(code);
		return "redirect:/start.kosta";
	}
//	@RequestMapping("/delete.kosta")
//	public String delete(HttpServletRequest request) {
//		String code = request.getParameter("code");
//		service.delete(code);
//		return "redirect:start.kosta";
//		// 전송해야될 데이터가 있다면 forward로 보낸다.
//	}

	@RequestMapping("/insert.ko")
	public String insert(ProductDTO productDTO) {
		service.insert(productDTO);
		return "redirect:/start.kosta";
	}

	@RequestMapping({"/{url}.ko", "{url}.kosta"})
	public void url() {
	}
//	@RequestMapping("/insertForm.ko")
//	public String toInsertForm() {	
//		return "insertForm";
//	}

	@ExceptionHandler(MyErrorException.class)
	public ModelAndView myErrorExceptionHandler(Exception e) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errMessage", e.getMessage());
		return mv;
	}
}
