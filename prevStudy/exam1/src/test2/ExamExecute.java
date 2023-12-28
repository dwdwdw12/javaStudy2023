package test2;

import org.junit.Test;

import exam2.SubOne;
import exam2.SubTwo;
import exam2.SuperA;

public class ExamExecute {
	
	@Test
	public void first12Exec() {
		
		SuperA var1 = new SuperA();
		var1.print();
		
		System.out.println("----------");
		
		SuperA var2 = new SubOne();
		var2.print();
//		var2.printOne();			//error, superA에 존재하지 않음
		
		System.out.println("----------");
		
		SubOne var3 = new SubOne();
		var3.print();
		var3.printOne();
		
		System.out.println("----------");
//		Subone var4 = new SubTwo();		//error, 형제관계=아무 관계도 아님
		
		SuperA var5 = new SubTwo();
		var5.print();
								
	}
}
