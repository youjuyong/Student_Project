package egovframework.example.dao;

import java.util.List;
import java.util.Map;

import egovframework.example.dto.Board;
import egovframework.example.dto.Professor;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("professormapper")
public interface ProfessorDAO {
	List<Map> getProfessor();
	int pro_getCount();
	Professor progetIdx(Professor pro);
	List<Map> getPsclist(int p_idx);
}
