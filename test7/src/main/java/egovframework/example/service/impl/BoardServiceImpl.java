package egovframework.example.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.dao.BoardDAO;
import egovframework.example.dto.Board;
import egovframework.example.service.BoardService;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
		@Resource(name="boardDAO")
	    private BoardDAO boardDAO;
	    
	    @Override
	    public List<Map> getBoards() {
	        return boardDAO.getBoards();
	    }

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
				
			return boardDAO.getCount();
		}

		@Override
		public void insertStudent(Board board) {
			// TODO Auto-generated method stub
			boardDAO.insertStudent(board);
			
		}

		@Override
		public List<Map> getDetail(int idx) {
			// TODO Auto-generated method stub
			return boardDAO.getDetail(idx);
		}

		@Override
		public void updateStudent(Board board) {
			// TODO Auto-generated method stub
			 boardDAO.updateStudent(board);
		}

		@Override
		public void deleteStudent(int idx) {
			// TODO Auto-generated method stub
			boardDAO.deleteStudent(idx);
		}

		@Override
		public String gradeCalcu(int score) {
			// TODO Auto-generated method stub
			String grade=null;
			
			if(score>=90 && score<100) {
				grade="A";
			}else if(score>=80 && score<90) {
				grade="B";
			}else if(score>=70 && score<80) {
				grade="C";
			}else if(score>=60 && score<70) {
				grade="D";
			}else {
				grade="FAIL";
			}
			
			return grade;
		}

		@Override
		public String getpName(int psc_idx) {
			// TODO Auto-generated method stub
			return 	boardDAO.getpName(psc_idx);
		}
}
