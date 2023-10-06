package ex07_singleton;

//public > protected > default > private
public class B {
	
	public static void main(String[] args) {
	
		A a = new A();
		a.number = 1;
		
		//a.number2 = 2;		//접근불가
		
		a.number3 = 3;
		
		a.add();
		//a.add2();				//접근불가
		
	}
}
