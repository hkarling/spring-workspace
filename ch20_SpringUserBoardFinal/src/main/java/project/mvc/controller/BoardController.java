package project.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import project.mvc.model.board.dto.ElectronicsDTO;
import project.mvc.model.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    private String path = "/Users/hkarling/Documents/saveFolder";

    /**
     * 모든 게시물 가져오기
     */
    @RequestMapping("/list")
    public void list(Model model) {
	List<ElectronicsDTO> list = boardService.selectAll();
	model.addAttribute("list", list);
    }

    /**
     * 로그인 폼으로 가기
     */
    @RequestMapping("/write")
    public void write() {
    }

    /**
     * 등록하기
     */
    @RequestMapping("/insert")
    public String insert(ElectronicsDTO dto) throws IllegalStateException, IOException {
	MultipartFile file = dto.getFile();
	/* file이 첨부가 되었다면 */
	if (file.getSize() > 0) {
	    dto.setFname(file.getOriginalFilename());
	    dto.setFsize(file.getSize());
	    /* file 저장 */
	    file.transferTo(new File(path + "/" + dto.getFname()));
	}
	boardService.insert(dto);
	return "redirect:/board/list";
    }

    /**
     * 세부항목 확인하기
     * @param modelNum
     * @return
     */
    @RequestMapping("/read/{modelNum}")
    public ModelAndView read(@PathVariable String modelNum) {
	ElectronicsDTO dto = boardService.selectByModelNum(modelNum, true);
	return new ModelAndView("/board/read", "elec", dto);
    }

    /**
     * 첨부파일 다운로드하기
     * @param fname
     * @return
     */
    @RequestMapping("/down/{fname:.+}")
    public ModelAndView down(@PathVariable String fname) {
	
	File file = new File(path + "/" + fname);
	return new ModelAndView("downloadView", "fname", file);
    }
    
    /**
     * 수정하기 폼으로 보내기
     * @param modelNum
     * @return
     */
    @RequestMapping("/updateForm")
    public ModelAndView update(String modelNum) {
	ElectronicsDTO dto = boardService.selectByModelNum(modelNum, false);
	return new ModelAndView("board/update", "elec", dto);
    }
    
    /**
     * 수정하기
     */
    @RequestMapping("/update")
    public ModelAndView update(ElectronicsDTO dto) {
	boardService.update(dto);
	ElectronicsDTO elecDTO = boardService.selectByModelNum(dto.getModelNum(), false);
	return new ModelAndView("/board/read", "elec", elecDTO);
    }
    
    /**
     * 삭제하기
     */
    @RequestMapping("/delete")
    public String delete(String modelNum, String password) {
	boardService.delete(modelNum, password);
	return "redirect:/board/list";
    }
}
