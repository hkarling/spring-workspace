package project.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("요청됨");
		String key = request.getParameter("command");
		Controller controller = HandlerMapping.getFactory().creteController(key);
		
		ModelAndView mv = controller.handleRequest(request, response);
		
		if(mv.isRedirect()) {
			response.sendRedirect(mv.getPath());
		} else {
			request.getRequestDispatcher(mv.getPath()).forward(request, response);
		}
	}
}