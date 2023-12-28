package com.dongwoo.refactoryuser.test.src.test;

import com.dongwoo.refactoryuser.dao.DaoFactory;
import com.dongwoo.refactoryuser.dao.UserDao;
import com.dongwoo.refactoryuser.domain.User;

public class UserDaoTest {
	public static void main(String[] args) {
		User user = new User();
		user.setId("user1");
		user.setName("user11");
		user.setPassword("user111");

		UserDao dao = new DaoFactory().getUserDao();
		
		int result = dao.add(user);	

		System.out.println(user.getId() + " 등록 성공"); 
		
		User getUser = dao.get(user.getId());
		System.out.println(getUser.getName());
		System.out.println(getUser.getPassword());
		System.out.println(getUser.getId() + " 조회 성공");
	
	
	}
}
