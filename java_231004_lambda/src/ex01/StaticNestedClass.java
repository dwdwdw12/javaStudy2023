package ex01;

class Outer{
	private static int num = 0;
	
	public Outer() {
		System.out.println("=============");	//시험용. 아래 생성자 활용 결과, Outer 객체는 생성되지 않음.
	}
	
	static class Nested1{
		void add(int n) {num += n;}	//static 안에서는 this 사용 x.
	}

	static class Nested2{
		int get() {return num;}
	}
}

class Outer2{
	private static int num = 0;
	
	static class Nested1{
		void add(int n) {num += n;}	//static 안에서는 this 사용 x.
	}

	static class Nested2{
		int get() {return num;}
	}
}

public class StaticNestedClass {
	public static void main(String[] args) {
		Outer.Nested1 nst1 = new Outer.Nested1();	//클래스명.정적클래스명 으로 생성, 내부 static class가 같은 이름일 경우도 있으므로.
		nst1.add(5);
		
		Outer.Nested2 nst2 = new Outer.Nested2();
		System.out.println(nst2.get());
	}
}
