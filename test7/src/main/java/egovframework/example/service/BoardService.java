package egovframework.example.service;

import java.util.List;
import java.util.Map;

import egovframework.example.dto.Board;

public interface BoardService {
	List<Map> getBoards();
	int getCount();
	void insertStudent(Board boards);
	List<Map> getDetail(int idx);
	void updateStudent(Board board);
	void deleteStudent(int idx);
	String gradeCalcu(int score);
	
	String getpName(int psc_idx);
	
}
