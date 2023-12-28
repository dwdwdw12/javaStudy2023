package kr.co.dongwoo.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kr.co.dongwoo.member.vo.MembersldwVO;

public class MembersldwDAO2 {
		
	//테이블에 자료를 저장(삽입) Create
	public void insert(MembersldwVO insertData){	
		//오라클 데이터베이스에 연결해서 => 드라이버를 올리고 커넥션 객체를 얻는다.
		Connection con = null;	//예외처리 필요
		//Connection con = dbCon();
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //연결 프로그램	//@:id, password 넘겨줄때	xe:sid
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.18:1521:xe", "userone", "userone");
			//연결객체								프로토콜(대:중:소:)  ip주소(오라클이 설치된):포트번호(거의 고정)	사용자이름	 비밀번호
			//넘겨받은 자료를 해당 테이블에 입력한다. statements 객체를 생성해서 실행한다.
			ps = con.prepareStatement("insert into membersldw values(?, ?, ?, sysdate)");
			ps.setString(1, insertData.getMemId());	//문자열을 가져오므로
			ps.setString(2, insertData.getMemPwd());
			ps.setString(3, insertData.getAddress());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		} finally {
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			//연결을 해서 실행을 했다., null->실행되지않아서, 닫을 필요가 없음
			if(con != null) {try {con.close();} catch (SQLException e) {}}
		};
	}
	
	//한 사람의 정보를 읽어오기,  Read =>select
	public MembersldwVO selectOne(String memId){	//반환되는 타입이 정해져 있음 ctrl shift o, import 필요
		//오라클 데이터베이스에 연결해서 memId가 일치하는 회원을 조회한 후에 그 결과를 반환한다. 
		MembersldwVO returnMember = null;
		
		return returnMember;
	}	
	
	//모든 회원의 정보를 읽어오기, 배열의 형식 Read =>select
	public List<MembersldwVO> selectAll(){	//List import
		//오라클 데이터베이스에 연결해서 모든 데이터를 조회한 후에 그 결과를 리스트(배열 친구)에 담아서 반환한다. 
		List<MembersldwVO> memberList = null;
		
		return memberList;
	}	
	//한 사람의 정보를 수정하기 Update=>update
	public void update(MembersldwVO insertData){
		
		Connection con = null;	
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.49:1521:xe", "userone", "userone");
			ps = con.prepareStatement("update membersldw set address = ?, memPwd=? where memId=?");
			ps.setString(3, insertData.getMemId());	//문자열을 가져오므로
			ps.setString(2, insertData.getMemPwd());
			ps.setString(1, insertData.getAddress());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			
		}	
				
	}	
	
	//한 사람의 정보를 삭제하기 Delete=>delete
	public void delete(String memId){
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.49:1521:xe", "userone", "userone");
			ps = con.prepareStatement("delete from membersldw where memId = ?");
			ps.setString(1, memId);	
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(con != null) {try {con.close();} catch (SQLException e) {}}
		}
	}	
	
}
