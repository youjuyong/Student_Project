package egovframework.example.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.dto.Admin;
import egovframework.example.dto.Board;
import egovframework.example.service.BoardService;
import egovframework.example.service.ProfessorService;

@Controller
@RequestMapping("/professor")
public class ProfessorController {
	
	@Resource(name="professorService")
	private ProfessorService professorService;
	
	@Resource(name="boardService")
	private BoardService boardService;
	
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
	  
	  @RequestMapping("/student_select.do") // 교수 페이지 담당학생 리스트
	  public ModelAndView SelectStudentProfessor(@RequestParam Map<String,String> param,HttpSession session,@ModelAttribute ModelAndView model, String admin) {

		  Object ses = session.getAttribute(admin);
		  int p_idx = Integer.parseInt(param.get("p_idx"));
		  String p_name = param.get("p_name");
		  List<Map> ps_student_list = professorService.getPsclist(p_idx);
		  int pcount = professorService.getProCount();	
		  	
		  model.addObject("pcount", pcount);
		  model.addObject("p_name", p_name);
		  model.addObject("prostu_list", ps_student_list);
		  model.setViewName("professor/pro_student_list");
		     
		  return model;
		
	  }
	  
	    @RequestMapping(value="logincheck.do", method = RequestMethod.POST) //교수 계정 로그인 확인 
		public String logincheck(@RequestParam Map<String,String> param,HttpSession session,@ModelAttribute ModelAndView model, Model model1) {
			
		  	String ad_id = param.get("name");
			int ad_password = Integer.parseInt(param.get("password"));;
			
			Admin ad = new Admin(ad_id,ad_password);
			
			Admin str = professorService.adgetIdx(ad);


			if(str!=null) {
				String message = "로그인에 성공했습니다.";
				int pro_totalCount = professorService.pro_getCount();
		    	
		    	List<Map> professor2 = professorService.getProfessor();
		    	
		    	session.setAttribute("admin", str);
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
	    
	    @RequestMapping("logout.do")
	    public String logout(SessionStatus status) {
	    	status.setComplete();
	    	
	    	return "login";
	    	
	    }
	    
	    @RequestMapping("/pro_student_detail.do")
	    public ModelAndView StudentDetailPage(@RequestParam Map<String, String> param,@ModelAttribute Board board, ModelAndView model) {
	    	System.out.println(board);
	    	int psc_idx = Integer.parseInt(param.get("psc_idx"));
	    	
	    	String p_name = boardService.getpName(psc_idx);
	    	model.addObject("p_name",p_name);
	    	model.addObject("bean",board);
	    	model.setViewName("student/detail");
	    	return model;
	    }
		
	  
}
