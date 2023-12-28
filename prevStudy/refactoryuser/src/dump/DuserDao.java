package dump;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.dongwoo.refactoryuser.dao.UserDao;

//public class DuserDao extends UserDao {
//
//	@Override
//	public Connection getConnection() {
//		Connection con = null;
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con =DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.18:1521:xe","dongwoo","dongwoo");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		return con;
//	}
//
//}
