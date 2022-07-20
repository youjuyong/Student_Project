package egovframework.example.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.dao.BoardDAO;
import egovframework.example.dto.Board;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	@Resource(name="sqlSession")
	private SqlSession query;
	
	
	@Override
	public List<Map> getBoards() {
		// TODO Auto-generated method stub
		return query.selectList("getBoards");
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return query.selectOne("getCounts");
	}


	@Override
	public void insertStudent(Board board) {
		// TODO Auto-generated method stub
		query.insert("insertStudent",board);
		
	}


	@Override
	public List<Map> getDetail(int idx) {
		// TODO Auto-generated method stub

		return query.selectList("getDetail",idx);
	}


	@Override
	public void updateStudent(Board board) {
		// TODO Auto-generated method stub
		query.update("updateStudent", board);
	}


	@Override
	public void deleteStudent(int idx) {
		// TODO Auto-generated method stub
		query.delete("deleteStudent", idx);
	}


	@Override
	public String getpName(int psc_idx) {
		// TODO Auto-generated method stub
		return query.selectOne("getpname", psc_idx);
	}


	
}
