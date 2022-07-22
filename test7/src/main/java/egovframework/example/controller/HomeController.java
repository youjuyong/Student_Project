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
    	model.setViewName("study");
    	
        return model;
        
    }
   
}
