package project.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import project.mvc.model.board.service.BoardService;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;
}
