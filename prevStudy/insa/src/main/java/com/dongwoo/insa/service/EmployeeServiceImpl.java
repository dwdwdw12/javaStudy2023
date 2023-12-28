package com.dongwoo.insa.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.dongwoo.insa.DBUtil;
import com.dongwoo.insa.EmployeeVO;
import com.dongwoo.insa.dao.EmployeeDAO;
import com.dongwoo.insa.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO dao = new EmployeeDAOImpl();	//자주 사용되는 문장

//	@Override
//	public int insert(EmployeeVO emp1) {
//		//System.out.println("받은 자료: "+emp1);
//		EmployeeDAO dao = new EmployeeDAOImpl();
//		int empNo = dao.getMaxEmpNo()+1;	//사번을 하나씩 증가시켜 입력
//		emp1.setEmpNo(empNo);
//		//System.out.println("가공한 자료: "+emp1);
//		return dao.insert(emp1);
//	}
	
	@Override
	public int insert(EmployeeVO emp1) {
		int empNo = dao.maxEmpNo()+1;	//추가
		emp1.setEmpNo(empNo);			//추가
		int result = dao.insert(emp1);
		
		return result;
	}

	@Override
	public void delAll() {
		dao.delAll();
	}

	@Override
	public Integer getCount() {
		int result = -255;
		result = dao.getCount();
		return result;
	}

	@Override
	public EmployeeVO getOne(int empNo) {
//		EmployeeVO rtnVO = null;
//		rtnVO = dao.getOne();
//		return rtnVO;
		
		return dao.getOne(empNo);
	}
	
}
