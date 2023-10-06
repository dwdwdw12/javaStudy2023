package ex051;

public class MainClass {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.funcA();
		
		B b = new B();
		b.funcA();
		b.funcB();
		//b.funcC();			//(x)
		
		C c = new C();
		c.funcA();
		c.funcB();
		c.funcC();
		
		System.out.println("======================");
		
		A aa = new B();
		aa.funcA(); 		//A class의 funcA() 출력
		
		//만약 B클래스가 A클래스에 있는 funcA 메서드를 재정의하면,
		//B클래스 안의 funcA가 실행됨.
		
		B bb = (B)aa;	//하위 클래스는 상위 클래스를 참조 할 수 없음
						//형변환을 통해 참조.
		System.out.println("======================");
/*		A aa2 = new A();
		B bb2 = (B)aa2;			//실행시 오류 발생. 형 변환 불가능	
		System.out.println("======================");	*/
		A a3 = new C();
		B b3 = (B)a3;
		b3.funcA();
		b3.funcB();
		C c3 = (C)a3;
		c3.funcA();
		c3.funcB();
		c3.funcC();

		
		
	}

}
