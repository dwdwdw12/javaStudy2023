package kr.co.dongwoo.member.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() {	
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.18:1521:xe", "userone", "userone");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void resourceClose(ResultSet rs,PreparedStatement ps, Connection con) {
		if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		if(ps != null) {try {ps.close();} catch (SQLException e) {}}
		if(con != null) {try {con.close();} catch (SQLException e) {}}		//개수가 다른 경우도 생각 
	}
	
	public static void resourceClose(PreparedStatement ps, Connection con) {
		if(ps != null) {try {ps.close();} catch (SQLException e) {}}
		if(con != null) {try {con.close();} catch (SQLException e) {}}
	} 
	
}
