package egovframework.example.dao;

import java.util.List;
import java.util.Map;

import egovframework.example.dto.Board;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("professormapper")
public interface ProfessorDAO {
	List<Map> getProfessor();
}
