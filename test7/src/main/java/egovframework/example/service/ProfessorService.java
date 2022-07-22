package egovframework.example.service;

import java.util.List;
import java.util.Map;

import egovframework.example.dto.Admin;
import egovframework.example.dto.Professor;

public interface ProfessorService {
	List<Map> getProfessor();
	int pro_getCount();
	Admin adgetIdx(Admin ad);
	List<Map> getPsclist(int p_idx);
	int getProCount();

	
}
