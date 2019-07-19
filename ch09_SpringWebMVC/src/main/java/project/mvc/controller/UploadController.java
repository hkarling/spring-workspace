package project.mvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import project.mvc.model.dto.UploadDTO;

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
	
	@RequestMapping("/upload2.do")
	public ModelAndView upload2(UploadDTO dto, HttpSession session) {
		String path = session.getServletContext().getRealPath("/save");
		String saveFileName = dto.getFile().getOriginalFilename();
		try {
			dto.getFile().transferTo(new File(path + "/" + saveFileName));
			dto.setFileName(saveFileName);
			dto.setFileSize(dto.getFile().getSize());
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", dto.getName());
		mv.addObject("fileName", saveFileName);
		mv.addObject("path", path);
		mv.addObject("fileSize", dto.getFileSize());
		mv.setViewName("uploadResult");
		return mv;
	}
	
	@RequestMapping("/downList.do")
	public void download(Model model, HttpSession session) {
		String path = session.getServletContext().getRealPath("/save");
		File file = new File(path);
		String[] filenames = file.list();
		model.addAttribute("fileNames", filenames);
	}
	
	/**
	 * 다운로드 
	 */
	@RequestMapping("downLoad.do")
	public ModelAndView down(String fname, HttpSession session) {
		String path = session.getServletContext().getRealPath("/save");
		File file = new File(path + "/" + fname);
		ModelAndView mv = new ModelAndView();
		mv.addObject("fname", file);
		mv.setViewName("downLoadView");
		return mv;
	}
}
