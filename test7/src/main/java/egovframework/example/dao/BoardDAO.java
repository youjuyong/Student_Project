package egovframework.example.dao;

import java.util.List;
import java.util.Map;

import egovframework.example.dto.Board;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardMapper")
public interface BoardDAO {
	List<Map> getBoards();
	int getCount();
	void insertStudent(Board board);
	List<Map> getDetail(int idx);
	void updateStudent(Board board);
	void deleteStudent(int idx);
	String getpName(int psc_idx);
}
