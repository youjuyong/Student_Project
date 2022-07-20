package egovframework.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.dto.Board;
import egovframework.example.dto.Professor;
import egovframework.example.service.BoardService;
import egovframework.example.service.ProfessorService;

@Controller
@RequestMapping("/professor")
public class ProfessorController {
	
	@Resource(name="professorService")
	private ProfessorService professorService;
	
	  @RequestMapping("/pro_list.do")
	  public ModelAndView ProfessorPage(@ModelAttribute ModelAndView model) {

	    	int pro_totalCount = professorService.pro_getCount();
	    	
	    	List<Map> professor2 = professorService.getProfessor();
	    	model.addObject("pro", professor2);
	    	model.addObject("proCount",pro_totalCount);
	    	model.setViewName("professor/pro_list");
	     
	    	return model;
	        
	  }
	    
	  @RequestMapping("/detail.do")
	  public ModelAndView ProfessorDetailPage(@ModelAttribute ModelAndView model) {
		  
		  System.out.println("professor detail page");
		  
		  return model;
		  
	  }
	  
	  @RequestMapping("/student_select.do")
	  public ModelAndView SelectStudentProfessor(@RequestParam Map<String,String> param,@ModelAttribute ModelAndView model) {
		  
		  int p_idx = Integer.parseInt(param.get("p_idx"));
		  String p_name = param.get("p_name");
		  List<Map> ps_student_list = professorService.getPsclist(p_idx);
		  
			model.addObject("p_name", p_name);
			model.addObject("prostu_list", ps_student_list);
			model.setViewName("professor/pro_student_list");
		     
		  return model;
		
	  }
	  
	  @RequestMapping(value="logincheck.do")
		public String logincheck(@RequestParam Map<String,String> param,@ModelAttribute ModelAndView model,Model model1) {
			String p_name = param.get("name");
			int p_password = Integer.parseInt(param.get("password"));
		
			Professor pro = new Professor(p_name,p_password);
			
			Professor str = professorService.progetIdx(pro);

			if(str!=null) {
				String message = "로그인에 성공했습니다.";
				int pro_totalCount = professorService.pro_getCount();
		    	
		    	List<Map> professor2 = professorService.getProfessor();
		    	
		    	model1.addAttribute("message", message);
		    	model1.addAttribute("pro", professor2);
		    	model1.addAttribute("proCount", pro_totalCount);
		     
		    	return "professor/pro_list";
			}else if(str==null){
				String message="로그인 정보가 틀립니다.!!";
				model1.addAttribute("message", message);

		        return "alertLogin";
			}
			
			return null;
			
		
		}
		
	  
}
