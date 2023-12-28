package jalangtest;

import org.junit.Test;

import jalang.WrapperExam;

public class WrapperTest {
	
	@Test
	public void methodAaaTest() {
		WrapperExam exam = new WrapperExam();
		exam.methodAaa();
		exam.toMultiRadixString(10, 2);
	}
	
	@Test
	public void MultiRadixStringTest() {
		System.out.println(WrapperExam.toMultiRadixString(120, 5));
	}
	
	@Test
	public void toDecimalTest() {
		System.out.println(WrapperExam.toDecimal("cd", 16));
	}
}
