package threetest;

import org.junit.Test;

import three.MapExam01;

public class MapTest {
	
	@Test
	public void mapCrudTest() {
		MapExam01 test = new MapExam01();
		test.mapCrud();
	}
	
	@Test
	public void mapApplTest2() {
		MapExam01 test = new MapExam01();
		test.mapAppl();	
	}
	
	@Test
	public void mapApplTest3() {
		MapExam01 test = new MapExam01();
		test.mapAppl2();
	}
}
