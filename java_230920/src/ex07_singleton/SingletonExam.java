package ex07_singleton;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonExam {
	public static void main(String[] args) throws SQLException {
		Singleton single = Singleton.getInstance();
		
		System.out.println(single.apple);
		
		//싱글톤 예시(jdbc 연결), 정적 메서드를 통해 객체 생성.
		DriverManager.getConnection(null);
	}
}
