package twotest;

import org.junit.Test;

import two.AbstExam02;
import two.Calcu;
import two.Circle;
import two.Rectangle;
import two.Triangle;

public class AbstractExamTest {
	
	@Test
	public void Exam02Test(){
		AbstExam02 obj = new AbstExam02() {

			@Override
			public void abstMethod() { // override가 강제됨
				System.out.println("추상메서드의 내용을 구현함");
			}
		};

		obj.abstMethod();
	}
	
	@Test
	public void AreaCalcu() {
		Calcu cal = new Rectangle();	//a에게 사각형의 면적을 구하는 프로그램을 작성할 것을 지시
		System.out.println("사각형 면적 : " + cal.area(50,30));
		cal = new Triangle();		//b에게 삼각형의 면적을 구하는 프로그램을 작성할 것을 지시
		System.out.println("삼각형 면적 : " + cal.area(50,30));
		cal = new Circle();			//c에게 원의 면적을 구하는 프로그램을 작성할 것을 지시
		System.out.println("원 면적 : " + cal.area(50));
		
		System.out.println("클래스가 많아지는 단점을 보완");
		cal = new Calcu() {
			public double area(double... data) {	//익명 클래스로 처리하는 방법
				return data[0]*data[1];
			}
		};
		System.out.println("사각형 면적2 : " + cal.area(80,60));
	}
}
