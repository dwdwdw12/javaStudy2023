package dump;

import com.dongwoo.refactoryuser.dao.UserDao;

public class DaoFactory {
//	public static UserDao userDao(){ //반환타입을 생각해서 만들기
//		return new UserDao(new conMaker());		
		
		ConnectionMaker connection = new NaverConnection();
//		UserDao dao = new UserDao(connection);
//		return dao;
		
//	}
	
	//여러개의 DAO가 있다면 아래와 같은 방식을 변형하여 수행
//	public static MemberDao userDao(){
//	
//		return new UserDao(new conMaker());		//a)한 줄만 바꾸면 됨.
//		
//		ConnectionMaker connection = new NaverConnection();	//b)일일히 만들기 번거로움
//		MemberDao dao = new MemberDao(connection);
//		return dao;
//		
//	}	
	
//	public static EmployeeDao userDao(){ 	
//		
//		return new UserDao(new conMaker());		
//		
//		ConnectionMaker connection = new NaverConnection();
//		EmployeeDao dao = new EmployeeDao(connection);
//		return dao;
//		
//	}
	
	private ConnectionMaker conMaker() {		//a)이 부분을 생성시
		return new NaverConnection();
	}
	
}
