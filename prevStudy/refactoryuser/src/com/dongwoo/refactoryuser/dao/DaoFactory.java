package com.dongwoo.refactoryuser.dao;

public class DaoFactory {	//객체의 생성방법을 결정하고, 만들어진 오브젝트를 돌려줌
	
	public UserDao getUserDao() {
		//UserDao dao = new UserDao();
		UserDao dao = new UserDao(getConn());
		//dao.setConnectionInter(getConn());	//삭제.
		return dao;
	}
	
	public ConnectionInter getConn() {
		return new OracleConnection();
	}
	
}
