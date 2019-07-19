package project.mvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {

	@RequestMapping("/upload.do")
	public ModelAndView upload(String name, MultipartFile file, HttpSession session) {
		String path = session.getServletContext().getRealPath("/save");
		String saveFileName = file.getOriginalFilename();
		try {
			file.transferTo(new File(path + "/" + saveFileName));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("fileName", saveFileName);
		mv.addObject("path", path);
		mv.addObject("fileSize", file.getSize());
		mv.setViewName("uploadResult");
		return mv;
	}
}
