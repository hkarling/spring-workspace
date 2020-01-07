package io.hkarling.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("InsertController called");
		
		request.setAttribute("message", "insert됨..");
		ModelAndView mv = new ModelAndView();
		mv.setPath("result.jsp");
		return mv;
	}

}
