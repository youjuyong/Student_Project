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
import egovframework.example.service.ProfessorService;

@Controller
@RequestMapping("professor")
public class ProfessorController {
	
	@Resource(name="professorService")
	private ProfessorService professorService;
	
	
    @RequestMapping("/pro_list.do")
    public ModelAndView showIndexPage(@ModelAttribute ProfessorService professorService,ModelAndView model) {
       

    	List<Map> professor = professorService.getProfessor();
    	
    	model.addObject("pro", professor);
    	model.setViewName("professor/pro_list");
        return model;
        
    }
    
    
    
}
