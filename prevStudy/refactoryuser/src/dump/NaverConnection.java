package dump;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NaverConnection implements ConnectionMaker {

	@Override
	public Connection makeConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.18:1521:xe", "dongwoo", "dongwoo");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
