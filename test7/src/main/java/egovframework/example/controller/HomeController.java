package egovframework.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.enterprise.inject.Model;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.dto.Board;
import egovframework.example.service.BoardService;

@Controller
public class HomeController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	private Board Board;
	
    @RequestMapping("/index.do")
    public ModelAndView showIndexPage(@ModelAttribute Board board,ModelAndView model) {
        int totalCount;
        
        totalCount = boardService.getCount();
    	List<Map> boards = boardService.getBoards();
 
    	Map<String,Object> map = new HashMap<String,Object>();
    	
    	model.addObject("boards",boards);
    	model.addObject("Counts",totalCount);
    	model.setViewName("index");
    	
        return model;
        
    }
    
    @RequestMapping("/detail.do")
    public ModelAndView StudentDetailPage(@RequestParam Map<String, String> param,@ModelAttribute Board board, ModelAndView model) {
    	int idx = Integer.parseInt(param.get("idx")); 
    	String address = param.get("address");
    	int score = Integer.parseInt(param.get("score"));

    	List<Map> student_detail = boardService.getDetail(idx);
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("idx", idx);

    	model.addObject("idx", idx);
    	model.addObject("address", address);
    	model.addObject("score", score);
    	model.addObject("bean",student_detail);
    	model.setViewName("student/detail");
    	return model;
    }
    
    @RequestMapping("/insert.do")
    public String StudentInsertPage(Map<String, String> param,@ModelAttribute ModelAndView model) {
		
    	
    	
    	return "student/insert";
 
    }
    
    @RequestMapping("/update.do")
    public ModelAndView StudentUpdatePage(@RequestParam Map<String, String> param,@ModelAttribute ModelAndView model) {
		
    	int idx = Integer.parseInt(param.get("idx"));
    	String address = param.get("address");
    	int score = Integer.parseInt(param.get("score"));
    	
    	List<Map> student_update = boardService.getDetail(idx);
       	model.addObject("address", address);
    	model.addObject("score", score);
    	model.addObject("idx", idx);
    	model.addObject("updatebean",student_update);
    	model.setViewName("student/update");

    	return model;
    	
    }
    
    @RequestMapping("/update_value.do")
    public String StudentUpdate(@ModelAttribute Board board,@RequestParam Map<String, String> param,@ModelAttribute ModelAndView model) {
    	
    	System.out.println(board);
    	String grade=boardService.gradeCalcu(board.getScore());//학점계산
    	
    	board.setGrade(grade);
    	
    	boardService.updateStudent(board);

    	return "redirect:/";
    	
    }
    @RequestMapping("/insert_value.do")
    public String StudentInsert(@ModelAttribute Board board ,@RequestParam Map<String, Object> param, HttpServletResponse response,HttpServletRequest request,ModelAndView model) throws IOException {
    
    		String grade=boardService.gradeCalcu(board.getScore());//학점계산
    		board.setGrade(grade);
    		boardService.insertStudent(board);
    	
    	return "redirect:/";
    }
    
    @RequestMapping("delete.do")
    public String StudentDelete(@RequestParam Map<String, String> param) {
    	
    	int idx = Integer.parseInt(param.get("idx"));
    	boardService.deleteStudent(idx);
    	
    	return "redirect:/";
    }
    
    
}
