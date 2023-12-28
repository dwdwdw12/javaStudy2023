package onetest;

import org.junit.Test;

import one.SubMainOne;
import one.SuperMain;

public class OneTest {
	
	@Test
	public void subMainTest() {
		SubMainOne obj = new SubMainOne();
		obj.namePrint();
		obj.myDataPrint();
	}
	
	@Test
	public void subMainTest2() {
		SuperMain obj = new SubMainOne();
//		obj.namePrint();
		((SubMainOne)(obj)).namePrint("abcde");
		System.out.println("----------");
		((SubMainOne)(obj)).myDataPrint();	//형변환이 필요
	}
}
