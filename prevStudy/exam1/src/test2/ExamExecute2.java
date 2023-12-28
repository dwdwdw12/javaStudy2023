package test2;

import org.junit.Test;

import exam2.SubOne;
import exam2.SubTwo;
import exam2.SuperA;

public class ExamExecute2 {
	
	@Test
	public void first12Exec() {
		
//		SuperA var1 = new SuperA();
//		var1.print();
		
		workPrint(new SuperA());
		System.out.println("----------");
//		SubOne var2 = new SubOne();
//		var2.print();
		workPrint(new SubOne());
		System.out.println("----------");
//		SuperA var3 = new SubTwo();
//		var3.print();
		workPrint(new SubTwo());
	}
	
	
	public void workPrint(SuperA obj) {	//다형성 - 상위타입(최상위->인터페이스)
		//(타입 obj) -> 타입을 superA로 해야 하위 타입을 저장할 수 있음
		obj.print();	//의존성 주입
	}
}
