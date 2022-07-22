package egovframework.example.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.dto.Professor;
import egovframework.example.service.ProfessorService;

@Controller
public class LoginController {

	@Resource(name="professorService")
	private ProfessorService professorService;
	
	@RequestMapping(value="login")
	public String login(@ModelAttribute ModelAndView model, Model models){
		
		
		String message="관리자 로그인이 필요합니다.";

		models.addAttribute("message", message);
		
		return "login";
	}
	
	
}
