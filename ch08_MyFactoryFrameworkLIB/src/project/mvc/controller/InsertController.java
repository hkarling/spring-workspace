package project.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("InsertController called");
		
//		request.setAttribute("message", "insert됨..");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "insert됨..");
		mv.setViewName("result");
		return mv;
	}

}
