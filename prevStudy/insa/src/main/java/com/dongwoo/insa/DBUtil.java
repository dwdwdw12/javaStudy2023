package com.dongwoo.insa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() {
		String dirver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.18:1521:xe";
		String username = "dongwoo";
		String password = "dongwoo";
		Connection con = null;
		try {
			Class.forName(dirver);
			try {
				con = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void rC(PreparedStatement ps, Connection con) {	//rC = resourceClose
		if (ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
		if (con != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}	//e.printStackTrace(); 생략가능
	}

	public static void rC(ResultSet rs, PreparedStatement ps, Connection con) {
		if (rs != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
		rC(ps, con);
	}
}
