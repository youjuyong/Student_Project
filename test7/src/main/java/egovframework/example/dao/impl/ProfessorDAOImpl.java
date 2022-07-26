package egovframework.example.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.dao.BoardDAO;
import egovframework.example.dao.ProfessorDAO;
import egovframework.example.dto.Admin;
import egovframework.example.dto.Board;
import egovframework.example.dto.Professor;

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

	@Override
	public int pro_getCount() {
		// TODO Auto-generated method stub
		return query.selectOne("pro_getCount");
	}

	@Override
	public Admin adgetIdx(Admin ad) {
		// TODO Auto-generated method stub
		
		return query.selectOne("adgetidx",ad);
		
	}

	@Override
	public List<Map> getPsclist(int p_idx) {
		// TODO Auto-generated method stub
		return query.selectList("selectPscStudent",p_idx);
	}

	@Override
	public int getProCount() {
		// TODO Auto-generated method stub
		return query.selectOne("getproCount");
	}


	
	
}
