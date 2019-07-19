package project.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ResponseBodyController {
	@RequestMapping(value="responseBody.do", produces = "text/html;charset=UTF-8")
	//@ResponseBody
	public String bb() {
		System.out.println("ResponseBodyController의 bb() 호출..");
		return "ResponseBody응답 데이터입니다.";
	}
	
	@RequestMapping(value="responseBody2.do",produces = "text/html;charset=UTF-8")
	//@ResponseBody
	public List<String> cc() {	
		List<String> list = new ArrayList<String>();
		list.add("딸기");
		list.add("포도");
		list.add("바나나");
		list.add("귤");
		return list;
	}
}
