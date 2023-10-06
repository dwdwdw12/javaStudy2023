package ex02;

class Outer3{
	private int num = 0;
	
	class Member{					//멤버 클래스를 외부에 노출시키지 않기 위해, 클래스 안에 삽입.
		void add(int n) {num+=n;}	//this로 접근 불가.
		int get() {return num;}
	}
}

class Outer4{
	private int num = 0;
	
	class Member{					//동일한 내부 클래스명.
		void add(int n) {num+=n;}	
		int get() {return num;}
	}
}

public class MemberInnerClass {
	public static void main(String[] args) {
		Outer3 o1 = new Outer3();
		Outer4 o2 = new Outer4();
		
		Outer3.Member m1 = o1.new Member();
		Outer3.Member m2 = o1.new Member();	//o1을 공유
		
		Outer4.Member m3 = o2.new Member();
		Outer4.Member m4 = o2.new Member();
		
		m1.add(5);
		System.out.println(m1.get());		

		m2.add(15);
		System.out.println(m2.get());
	}
}
