package com.dongwoo.insa.dao;

import com.dongwoo.insa.EmployeeVO;

public interface EmployeeDAO {

	int insert(EmployeeVO emp1);

	int getMaxEmpNo();

	void delAll();

	int getCount();

	int maxEmpNo();

	EmployeeVO getOne(int empNo);

}
