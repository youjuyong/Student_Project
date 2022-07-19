package egovframework.example.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.dao.BoardDAO;
import egovframework.example.dao.ProfessorDAO;
import egovframework.example.dto.Board;

@Repository("professorDAO")
public class ProfessorDAOImpl implements ProfessorDAO {

	@Autowired
	@Resource(name="sqlSession")
	private SqlSession query;

	@Override
	public List<Map> getProfessor() {
		// TODO Auto-generated method stub
		return query.selectList("getProfessor");
	}
	
	
	
	
}
