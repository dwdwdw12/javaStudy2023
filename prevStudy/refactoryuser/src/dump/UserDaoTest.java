//package dump;
//
//import com.dongwoo.refactoryuser.dao.UserDao;
//import com.dongwoo.refactoryuser.domain.User;
//
//
//
//public class UserDaoTest {
//	public static void main(String[] args) {
//		User user = new User();
//		user.setId("user1");
//		user.setName("user11");
//		user.setPassword("user111");
//
//		UserDao dao = new NuserDao(); // 변수명은 dao 또는 repository			//추상화->상속->userdao를 nuserdao로 변경
//		//UserDao dao = new UserDao(new DaumConnection());
//		//UserDao dao = DaoFactory.userDao();
//		
//		int result = dao.add(user);	//userdao에서 add()가 숫자를 반환하도록 프르그래밍했으므로
////		if (result != 1) {
////			System.out.println("등록 실패");
////		} 
//		System.out.println(user.getId() + " 등록 성공"); // 에러->중복 등록시 기본키의 유일성을 위반.
//		
//		User getUser = dao.get(user.getId());
//		System.out.println(getUser.getName());
//		System.out.println(getUser.getPassword());
//		System.out.println(getUser.getId() + " 조회 성공");
//	
//	
//	}
//}
