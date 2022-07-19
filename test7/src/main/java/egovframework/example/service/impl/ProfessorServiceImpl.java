package egovframework.example.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.dao.BoardDAO;
import egovframework.example.dao.ProfessorDAO;
import egovframework.example.dto.Board;
import egovframework.example.service.BoardService;
import egovframework.example.service.ProfessorService;

@Service("professorService")
public class ProfessorServiceImpl implements ProfessorService {
	
		@Resource(name="professorDAO")
	    private ProfessorDAO professorDAO;

		@Override
		public List<Map> getProfessor() {
			// TODO Auto-generated method stub
			return professorDAO.getProfessor();
		}
	    
	   
}
