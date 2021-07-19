package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import board.dao.BoardDAO;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	BoardDAO dao;

@RequestMapping("list")
public ModelAndView list() {
	ModelAndView mv=new ModelAndView();
	mv.addObject("pageboard",dao.list(1));
	mv.setViewName("/board/list");
	return mv;
}
@RequestMapping("searchList")
public ModelAndView searchList(String field, String search, int requestPage) { //자동 파라메타가 넘어옴
	ModelAndView mv=new ModelAndView();
	mv.addObject("pageboard",dao.searchList( field,search,requestPage));
	mv.setViewName("/board/list");
	return mv;
}
@RequestMapping("testform")
public String testform() {
	return "/board/testform";
}
@RequestMapping("test")    //test.jsp
@ResponseBody
public String test(String p) {
	return p;
}

}