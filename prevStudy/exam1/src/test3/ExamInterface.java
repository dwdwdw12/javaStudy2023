package test3;

import org.junit.Test;

import exam3.SuperInter;
import exam3.SuperInterImpl;

public class ExamInterface {
	
	@Test
	public void interTest(){
		//SuperInter var1 = new SuperInter();
		//추상 메서드를 가진 타입(인터페이스,...)은 객체를 생성할 수 없다.
		//구체적인 기능을 담은 클래스가 필요함.
		SuperInter var1 = new SuperInterImpl();
		String inputLine = var1.dataString();
		System.out.println("입력된 자료: "+ inputLine);	
		var1.print();
	}
}
