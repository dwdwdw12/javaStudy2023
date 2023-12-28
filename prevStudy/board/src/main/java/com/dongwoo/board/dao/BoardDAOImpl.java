package com.dongwoo.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dongwoo.board.BoardVO;
import com.dongwoo.board.DBUtil;

public class BoardDAOImpl implements BoardDAO{//add unimplemented methods

	@Override
	public int insert(BoardVO vo) {
		int result = 0;
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("insert into board values(boardSeq.nextval, ?, ?, ?, sysdate, 0)");
			ps.setString(1, vo.getWriter());
			ps.setString(2, vo.getBoardTitle());
			ps.setString(3, vo.getBoardContent());
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(ps, con);
		}
		
		return result;
	}

	@Override
	public int delete(long boardNo) {
		int result = 0;
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("delete from board where boardNo = ?");
			ps.setLong(1, boardNo);
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(ps, con);
		}
		
		return result;
	}

	@Override
	public int update(BoardVO vo) {
		int result = 0;
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("update board set writer = ?, boardTitle = ?, boardContent = ? where BOARDNO = ?");
			ps.setString(1, vo.getWriter());
			ps.setString(2, vo.getBoardTitle());
			ps.setString(3, vo.getBoardContent());
			ps.setLong(4, vo.getBoardNo());
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(ps, con);
		}
		
		return result;
	}
////////////////////////////////////////////////////////////////////////////
	@Override
	public long getCount() {
		long result = 0;
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select count(*) as cnt from board");
			
			rs = ps.executeQuery();		//반환값이 필요
			while(rs.next()) {	//실행후 남아있는 자료가 있을때까지, 이 경우는 1번만 작동
				result = rs.getLong("cnt");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(rs, ps, con);
		}
		
		return result;
	}

	//select * from board; > 다중행(List) 다중컬럼(VO클래스)의 결과를 얻는다.
	@Override
	public List<BoardVO> getAll() {
		List<BoardVO> list = null;
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select * from board");
			rs = ps.executeQuery();		
			list = new ArrayList<BoardVO>();	//리스트에 VO객체들만 들어가도록 만들겠다, 리스트: 배열의 성격, 가변적인 특징.
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getLong("boardNo")); 
				vo.setWriter(rs.getString("writer"));  
				vo.setBoardTitle(rs.getString("boardTitle")); 
				vo.setBoardContent(rs.getString("boardContent")); 
				vo.setRegiDate(rs.getString("regiDate")); 
				vo.setReadCount(rs.getInt("readCount"));		//정보를 넣은뒤	
				list.add(vo);									//리스트에 삽입
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(rs, ps, con);
		}
		return list;
	}

	
	@Override
	public BoardVO getOne(long boardNo) {
		BoardVO vo = null;
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps=con.prepareStatement("select * from board where boardNo = ?");
			ps.setLong(1, boardNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				vo = new BoardVO();
				vo.setBoardNo(rs.getLong("boardNo")); 
				vo.setWriter(rs.getString("WRITER")); 		//대소문자 상관X
				vo.setBoardTitle(rs.getString("BOARDTITLE")); 
				vo.setBoardContent(rs.getString("BOARDCONTENT")); 
				vo.setRegiDate(rs.getString("REGIDATE")); 
				vo.setReadCount(rs.getInt("READCOUNT")); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(rs, ps, con);
		}
		return vo;
	}
	
	@Override
	public List<BoardVO> getPage(int startNum, int endNum) {
		List<BoardVO> list = null;
		String query = "select * from(select rownum as numdata , middle.* from(select * from board order by boardNo desc) middle) where numData>=? and numData<=?";
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, startNum);
			ps.setInt(2, endNum);
			
			rs = ps.executeQuery();
			list = new ArrayList<BoardVO>();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getLong("boardNo")); 
				vo.setWriter(rs.getString("WRITER")); 		
				vo.setBoardTitle(rs.getString("BOARDTITLE")); 
				vo.setBoardContent(rs.getString("BOARDCONTENT")); 
				vo.setRegiDate(rs.getString("REGIDATE")); 
				vo.setReadCount(rs.getInt("READCOUNT")); 
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(rs, ps, con);
		}
		
		return list;
	}

}
