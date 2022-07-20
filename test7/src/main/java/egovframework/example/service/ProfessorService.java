package egovframework.example.service;

import java.util.List;
import java.util.Map;

import egovframework.example.dto.Board;
import egovframework.example.dto.Professor;

public interface ProfessorService {
	List<Map> getProfessor();
	int pro_getCount();
	Professor progetIdx(Professor pro);
	List<Map> getPsclist(int p_idx);
}
