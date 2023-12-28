package dump;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dongwoo.refactoryuser.domain.User;

public /*abstract*/ class UserDao {	//추상클래스로 바꾸기

	private ConnectionMaker ConnectionMaker;

	public UserDao(ConnectionMaker ConnectionMaker) {			//source>generate constructor using fields>필요없는 부분 제거 후, new 생성자를 활용하기.
		this.ConnectionMaker = ConnectionMaker;	//강한 연결. 이 경우에 Nuser와 Duser는 사용하지 못함.
	}

	public int add(User user) {	//테이블에 자료를 입력. => 입력한 자료의 개수를 반환해주는 것이 좋다.
		int result = 0;
		
		Connection con = null;
		PreparedStatement ps = null;
//		ResultSet rs = null;
		
		try {
			//con=getConnection();
			con=ConnectionMaker.makeConnection();
//			Class.forName("oracle.jdbc.driver.OracleDriver");		//explorer에서 해당 클래스를 찾은 뒤, 우클릭>copy qualified name
//			con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.18:1521:xe","dongwoo","dongwoo");	//@ - 비밀번호로 입력하겠다.
//																		//1521:xe->포트번호: sid/서비스이름(DB이름)	. 서비스이름은 콜론 대신 슬래시 사용
			ps = con.prepareStatement("insert into users values(?,?,?)");
			ps.setString(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPassword());
			result = ps.executeUpdate();	//성공시 1을 반환
			
		} catch (SQLException /*| ClassNotFoundException*/ e) {		//exception 확인하기
			e.printStackTrace();
		} finally {
//			if (rs != null) {	// rs, ps, con은 반드시 닫아주어야 함. 문제 발생 가능
//				try {
//					rs.close();
//				} catch (SQLException e) {
//				} 
//			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		
		return result;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public User get(String id) {	
		User user = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//con=getConnection();
			con=ConnectionMaker.makeConnection();
			ps = con.prepareStatement("select * from users where id =?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				user= new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return user;	//조기반환(return), 문제가 없으면 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {	// rs, ps, con은 반드시 닫아주어야 함. 문제 발생 가능
				try {
					rs.close();
				} catch (SQLException e) {
				} 
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return user;
	}
	
	public List<User> getAll(String id) {	//테이블에 있는 자료를 하나(반드시) 사용자 정보 읽어가기(User를 반환)
		List<User> list = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//con=getConnection();
			con=ConnectionMaker.makeConnection();
			ps = con.prepareStatement("select * from users");
			rs = ps.executeQuery();
			list = new ArrayList<User>();
			while(rs.next()) {
				User user = new User();  
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				list.add(user);
	
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {	// rs, ps, con은 반드시 닫아주어야 함. 문제 발생 가능
				try {
					rs.close();
				} catch (SQLException e) {
				} 
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return list;
	}
	
//	public abstract Connection getConnection(); //추상화하기 -> 코드를 숨길 수 있음
	
/*	
	private Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.18:1521:xe","dongwoo","dongwoo");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
*/
}
