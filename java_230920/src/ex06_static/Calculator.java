package ex06_static;

public class Calculator {
	
	//인스턴스 변수
	int result;
	
	//정적 변수, 클래스 변수
	static int minus;
	
	//인스턴스 메소드
	void add(int num1, int num2) {
		this.result = num1+num2;
	}
	
	//정적 메소드, 클래스 메소드
	static void sub(int num1, int num2) {
		//this.minus = num1 - num2;		//this 사용 불가
		minus = num1 - num2;
		//result = num1 + num2;
	}
	
	
}
