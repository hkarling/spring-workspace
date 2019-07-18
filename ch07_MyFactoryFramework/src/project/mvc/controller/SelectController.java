package project.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SelectController called");
		
		request.setAttribute("message", "select됨..");
		ModelAndView mv = new ModelAndView();
		mv.setPath("select.jsp");
		return mv;
	}

}
