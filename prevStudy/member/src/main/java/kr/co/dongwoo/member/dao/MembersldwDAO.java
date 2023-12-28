package kr.co.dongwoo.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.dongwoo.member.util.DBUtil;
import kr.co.dongwoo.member.vo.MembersldwVO;

public class MembersldwDAO {
	//테이블에 자료를 저장(삽입) Create
	public void insert(MembersldwVO insertData){	
		System.out.println("jsp에서 받아온 자료=>"+ insertData);
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("insert into membersldw values(?, ?, ?, sysdate)");
			ps.setString(1, insertData.getMemId());	//문자열을 가져오므로
			ps.setString(2, insertData.getMemPwd());
			ps.setString(3, insertData.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			DBUtil.resourceClose(ps,con);
		};
	}
	
	
	//한 사람의 정보를 읽어오기,  Read =>select
	public MembersldwVO selectOne(String memId){	//반환되는 타입이 정해져 있음 ctrl shift o, import 필요
		//오라클 데이터베이스에 연결해서 memId가 일치하는 회원을 조회한 후에 그 결과를 반환한다. 
		MembersldwVO returnMember = null;
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement("select * from membersldw where memId = ?");
			ps.setString(1, memId);
			rs = ps.executeQuery();
			while(rs.next()) {	//true, false 반환
				returnMember = new MembersldwVO();
				returnMember.setMemId(rs.getString("memId"));
				returnMember.setMemPwd(rs.getString("memPwd"));
				returnMember.setAddress(rs.getString("address"));
				returnMember.setRegiDate(rs.getString("rigiDate")); //날짜도 String으로 지정하였음
			}
		} catch (Exception e) {
			//e.printStackTrace();
		} finally {
			DBUtil.resourceClose(rs, ps,con);
		}
		
		return returnMember;
	}	
	
	//모든 회원의 정보를 읽어오기, 배열의 형식 Read =>select
	public List<MembersldwVO> selectAll(){	//List import
		//오라클 데이터베이스에 연결해서 모든 데이터를 조회한 후에 그 결과를 리스트(배열 친구)에 담아서 반환한다. 
		List<MembersldwVO> memberList = null;
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement("select * from membersldw"); //모두 가져옴
			rs = ps.executeQuery();
			
			memberList = new ArrayList<MembersldwVO>();
			
			while(rs.next()) {	//true, false 반환
				MembersldwVO returnMember = new MembersldwVO();
				returnMember.setMemId(rs.getString("memId"));
				returnMember.setMemPwd(rs.getString("memPwd"));
				returnMember.setAddress(rs.getString("address"));
				returnMember.setRegiDate(rs.getString("rigiDate"));
				memberList.add(returnMember);
			}
		} catch (Exception e) {
			//e.printStackTrace();??
		} finally {
			DBUtil.resourceClose(rs, ps,con);
		}
		
		return memberList;
	}	
	
	//한 사람의 정보를 수정하기 Update=>update
	public void update(MembersldwVO insertData){	
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("update membersldw set address = ?, memPwd=? where memId=?");
			ps.setString(3, insertData.getMemId());	//문자열을 가져오므로
			ps.setString(2, insertData.getMemPwd());
			ps.setString(1, insertData.getAddress());
			ps.executeUpdate();
			
		} catch ( SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.resourceClose(ps,con);
		}	
				
	}	
	
	//한 사람의 정보를 삭제하기 Delete=>delete
	public void delete(String memId){	
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("delete from membersldw where memId = ?");
			ps.setString(1, memId);	
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.resourceClose(ps,con);
		}
	}	
	
}
