package project.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DeleteController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DeleteController called");
		
//		request.setAttribute("message", "delete됨..");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "delete 됨..");
		mv.setViewName("result");
		return mv;
	}
}
