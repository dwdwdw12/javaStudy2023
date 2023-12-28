package threetest;

import org.junit.Test;

import three.SetExam01;

public class SetTest {
	@Test
	public void setCrudTest() {
		SetExam01 testData = new SetExam01();
		testData.setCrud();
		testData.setConvert();
		testData.arrayToListConvertor();
	}
	
	@Test
	public void setEqualTest() {
		SetExam01 testData = new SetExam01();
		testData.setEqual();
	}
}
