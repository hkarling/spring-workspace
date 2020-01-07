package io.hkarling.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("UpdateController called");
		
		request.setAttribute("message", "update됨..");
		ModelAndView mv = new ModelAndView();
		mv.setPath("result.jsp");
		return mv;
	}

}
