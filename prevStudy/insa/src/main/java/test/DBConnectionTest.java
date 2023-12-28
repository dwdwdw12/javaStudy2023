package test;

import static org.junit.Assert.assertNotNull;


import org.junit.Test;

import com.dongwoo.insa.DBUtil;

public class DBConnectionTest {
	@Test		

	public void getConnection() {
		assertNotNull(DBUtil.getConnection());
	}
}
