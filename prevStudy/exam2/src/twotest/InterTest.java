package twotest;

import org.junit.Test;

import two.inter.InterExam01Sub;
import two.inter.InterExam01SubImpl01;
import two.inter.InterExam01SubImpl02;

public class InterTest {
	@Test
	public void InterExam01SubImplTest() {
		InterExam01Sub obj = new InterExam01SubImpl01();
		obj.printAddr("경기도 수원시");
		obj.printName("홍길동");
	}
	
	@Test
	public void InterExam01SubImplTest01() {
		InterExam01Sub obj = new InterExam01SubImpl02();
		obj.printAddr("경기도 수원시");
		obj.printName("홍길동");
		obj.printAge(20);	//당신의 나이는 n세입니다.
		obj = new InterExam01SubImpl01();
		obj.printAddr("경기도 수원시");
		obj.printName("홍길동");
		obj.printAge(40);	//당신의 나이는 n세입니다
	}
	
	@Test
	public void InterExam01SubImplTest02() {
		InterExam01Sub obj = new InterExam01Sub() {

			@Override
			public void printName(String iname) {	//구현체=익명의 내부 클래스
													//함수형 인터페이스(추상메서드가 1개)일때 권장
			}

			@Override
			public void printAddr(String addr) {
				
				
			}
			
		};	//익명의 클래스를 사용할 수 있지만 인터페이스가 여러개의 추상메서드를 가지고 있을 때는 비권장.
	
	}
}
