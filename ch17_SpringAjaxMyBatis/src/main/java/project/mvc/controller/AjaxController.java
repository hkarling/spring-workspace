package project.mvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.mvc.model.dto.Member;

@RestController
public class AjaxController {

    @RequestMapping(value = "/load", produces = { "text/html;charset=UTF-8" })
    public String load() {

	return "Spring과 Ajax 연습 중....";
    }

    @RequestMapping(value = "/ajax", produces = { "text/html;charset=UTF-8" })
    public String ajax(String name) {
	return name + "씨 방가";
    }

    /**
     * array를 json으로 변환하여 응답하기
     */
    @RequestMapping(value = "/jsonArr")
    public List<String> jsonArr() {
	List<String> fruits = Arrays.asList(new String[] { "사과", "딸기", "포도", "바나나" });
	return fruits;
    }
    
    @RequestMapping(value="/jsonDTO")
    public Member jsonDTO() {
	Member member = new Member("karl","이름인교",30, "판교");
	return member;
    }
    
    @RequestMapping(value="/jsonList")
    public List<Member> jsonList() {
	List<Member> list = new ArrayList<Member>();
	list.add(new Member("AAA", "가가가", 10, "서울"));
	list.add(new Member("BBB", "나나나", 10, "대전"));
	list.add(new Member("CCC", "다다다", 10, "대구"));
	return list;
    }
    
    @RequestMapping(value="/jsonMap")
    public Map<String, Object> jsonMap() {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("message", "사라져줬으면해....");
	map.put("pageNo", 10);
	map.put("member", new Member("CCC", "다다다", 10, "대구"));
	
	List<Member> list = new ArrayList<Member>();
	list.add(new Member("AAA", "가가가", 10, "서울"));
	list.add(new Member("BBB", "나나나", 10, "대전"));
	map.put("list", list);
	return map;
    }
}
