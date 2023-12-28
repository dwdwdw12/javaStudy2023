package threetest;

import org.junit.Test;

import three.ListExam02;
import three.ListExam03;

public class ListExamTest {
	
	@Test
	public void listDataCreateTest() {
		ListExam02 exam02 = new ListExam02();
		exam02.listDataCreate();
	}
	
	@Test
	public void listDataCreateTest2() {
		ListExam03 exam03 = new ListExam03();
		exam03.listMultiImpl();
	}
}
