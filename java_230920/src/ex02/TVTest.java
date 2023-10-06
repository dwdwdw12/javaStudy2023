package ex02;

import ex02.TV;

public class TVTest extends Object{	//하위클래스가 상위클래스와 object 둘 다 상속x(다중상속x)
									//상위클래스가 object를 상속, 하위클래스가 상위클래스를 상속.
	
	public static void main(String[] args) {
		
		TV tv = new TV();	//객체생성, 생성자 호출
		//객체가 생성되기 위해서는 반드시 생성자를 통해서 생성된다.
		//생성자는 오버로딩이 가능
		
		TV tv2 = new TV(10);	//콘솔창에 매개변수가 들어간 생성자가 호출됨.
		
		TV tv3 = new TV("kor", 10);
	}
	
}
