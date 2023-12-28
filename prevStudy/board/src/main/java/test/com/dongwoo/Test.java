package test.com.dongwoo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.util.List;

import com.dongwoo.board.BoardVO;
import com.dongwoo.board.DBUtil;
import com.dongwoo.board.dao.BoardDAO;
import com.dongwoo.board.dao.BoardDAOImpl;

public class Test {	//run as Java application으로 실행하기

//	public static void main(String[] args) {
//	
////		if(null == DBUtil.getConnection()) {
////			System.out.println("데이터베이스 연결에 실패하였습니다.");
////		} else {
////			System.out.println("데이터베이스 연결에 성공하였습니다.\n축하합니다.");
////		}
//		
//		Connection con = DBUtil.getConnection();
//		if(con!=null) {
//			System.out.println("성\n공");
//		} else {
//			System.out.println("실패");
//		}
//
//	}
////////////////////////////////////////////////////////////////////////////////////////////////	
		@org.junit.Test			//run as junit test
		public void connectionTest() {		
			assertNotNull(DBUtil.getConnection());
			//assertEquals(null, DBUtil.getConnection());
		}
		
		@org.junit.Test				//어노테이션 		->무조건 public으로 시작
		public void daoInsertTest() {
			//데이터 만들어서 데이터를 넘기면서 입력을 지시 - 입력이 성공적으로 이루어졌으면 1을 반환
			BoardVO vo = new BoardVO("aa", "Title Test1", "Contents Test");
			BoardDAO dao= new BoardDAOImpl();
			int rtnValue = dao.insert(vo);
		}
		
		@org.junit.Test				
		public void daoDeleteTest() {
			BoardDAO dao = new BoardDAOImpl();
			assertEquals(dao.delete(35),1);		//delete>executeDelete>반영된 레코드의 건수, 이 경우는 1
		}
		
		@org.junit.Test				
		public void daoUpdateTest() {
			BoardVO vo = new BoardVO("bbb", "Title Test1", "Contents Test");
			vo.setBoardNo(49);
			BoardDAO dao= new BoardDAOImpl();
			int rtnValue = dao.update(vo);
			assertEquals(rtnValue,1);			//update>executeUpdate>반영된 레코드의 건수, 이 경우는 1
		}
		
		@org.junit.Test				
		public void daoGetCountTest() {
			BoardDAO dao= new BoardDAOImpl();
			assertEquals(dao.getCount(), 31);
		}
		
		@org.junit.Test				
		public void daoGetAllTest() {
			BoardDAO dao= new BoardDAOImpl();
			List<BoardVO> list = dao.getAll();	//배열의 형태로 정렬
			assertNotNull(list);
			for(int i=0; i<list.size(); i=i+1) {
				System.out.println(list.get(i).toString());	//배열 내의 자료를 하나씩 꺼내옴
			}
		}
		
		@org.junit.Test
		public void daoGetOneTest() {
			BoardDAO dao= new BoardDAOImpl();
			BoardVO vo = dao.getOne(19L);
			assertNotNull(vo);
			System.out.println(vo);
		}
		
///////
		@org.junit.Test
		public void daoGetPageTest() {			//하나만 테스트->메서드명(){}에서 메서드명만 드래그, run as JUnit test
			BoardDAO dao= new BoardDAOImpl();
			int currentPage = 1;
			int pageListCount = 10;
			int boardCount = (int)dao.getCount();
			int totalPage = (int)(boardCount/(double)pageListCount+0.9999999);
			
			int endNum = currentPage*pageListCount;
			int startNum = endNum-(pageListCount-1);
			endNum = (endNum>boardCount)?boardCount:endNum;		//삼항연산자
			
			List<BoardVO> list = dao.getPage(startNum,endNum);
			assertNotNull(list);
			for(int i=0; i<list.size(); i=i+1) {
				System.out.println(list.get(i).toString());	//배열 내의 자료를 하나씩 꺼내옴
			}
		}
		
		
	}


