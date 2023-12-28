package com.dongwoo.insa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dongwoo.insa.DBUtil;
import com.dongwoo.insa.EmployeeVO;

public class EmployeeDAOImpl implements EmployeeDAO {

//	@Override
//	public int insert(EmployeeVO emp1) {
//		int result = 0;
//		String query = "insert into employees values(?,?,?,?,?,?,?,sysdate,'임시부서','임시직위',0000000)";
//		Connection con = null;
//		PreparedStatement ps = null;
//		System.out.println("여기까지: "+emp1);
//		
//		con=DBUtil.getConnection();
//		try {
//			ps = con.prepareStatement(query);
//			ps.setInt(1, emp1.getEmpNo());
//			ps.setString(2, emp1.getEmpName());
//			ps.setString(3, emp1.getGender());
//			ps.setString(4, emp1.getBirth());
//			ps.setString(5, emp1.getPhoneNo());
//			ps.setString(6, emp1.getEmail());
//			ps.setString(7, emp1.getAddress());
//			result = ps.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.rC(ps, con);
//		}
//		
//		return result;
//		
//	}
	
	@Override
	public int insert(EmployeeVO emp1) {
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		String query = "insert into employees values(?,?,?,?,?,?,?,sysdate,'임시부서','임시직위',0000000)";
		con=DBUtil.getConnection();
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, emp1.getEmpNo());
			ps.setString(2, emp1.getEmpName());
			ps.setString(3, emp1.getGender());
			ps.setString(4, emp1.getBirth());
			ps.setString(5, emp1.getPhoneNo());
			ps.setString(6, emp1.getEmail());
			ps.setString(7, emp1.getAddress());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(ps, con);
		}
		
		return result;
		
	}

	@Override
	public int getMaxEmpNo() {	
		int result = 0;
		String query = "select max(empNo) as maxNum from employees";
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				result = rs.getInt("maxNum");		//칼럼명은 "" 붙이기	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(rs, ps, con);
		}
		return result;
	}

	@Override
	public void delAll() {
		Connection con;
		PreparedStatement ps=null;
		String query = "delete from employees";
		con=DBUtil.getConnection();

		try {
			ps = con.prepareStatement(query);
			ps.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(ps, con);
		}
		
	}

	@Override
	public int getCount() {
		int result = 0;
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		String query = "select count(*) cnt from employees";
		con=DBUtil.getConnection();
		
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();	
			while(rs.next()) {
				result = rs.getInt("cnt");		
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(rs, ps, con);
		}
		return result;
	}

	@Override
	public int maxEmpNo() {
		//select max(empNo) from employees
		int result = 0;
		String query = "select max(empNo) from employees";
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				result = rs.getInt(1);		//칼럼명은 "" 붙이기	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(ps, con);
		}
		return result;
	}

	@Override
	public EmployeeVO getOne(int empNo) {
		EmployeeVO vo = null;
		String query = "select * from employees where empNo = ?";
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, empNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				vo = new EmployeeVO();
				vo.setEmpNo(rs.getInt("empNo")); 	//rs.getInt(1);	<= 비권장
				vo.setEmpName(rs.getString("empName")); 
				vo.setGender(rs.getString("gender"));
				vo.setBirth(rs.getString("birth")); 
				vo.setPhoneNo(rs.getString("phoneNo")); 
				vo.setEmail(rs.getString("email")); 
				vo.setAddress(rs.getString("address"));
				vo.setHiredate(rs.getString("hiredate")); 
				vo.setEmpdep(rs.getString("empdep")); 
				vo.setEmppos(rs.getString("emppos")); 
				vo.setEmpsal(rs.getLong("empsal"));	//11개 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.rC(ps, con);
		}
		return vo;
	}

}
