package project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {

    @RequestMapping("/")
    public String index() {
	return "index"; // /WEB-INF/views/index.jsp
    }
    
    @RequestMapping("/test1")
    public String test1() {
	return "user/login_a";
    }
    
    @RequestMapping("test2")
    public String test2() {
	return "user/register";
    }
    
    @RequestMapping("test3")
    public String test3() {
	return "board/list";
    }
    
    @RequestMapping("test4")
    public String test4() {
	return "board/read";
    }
    
    @RequestMapping("test5")
    public String test5() {
	return "result";
    }
}
