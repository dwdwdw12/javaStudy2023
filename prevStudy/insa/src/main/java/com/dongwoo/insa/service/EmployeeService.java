package com.dongwoo.insa.service;

import com.dongwoo.insa.EmployeeVO;

public interface EmployeeService {

	int insert(EmployeeVO emp1);

	void delAll();

	Integer getCount();

	EmployeeVO getOne(int empNo);

}
