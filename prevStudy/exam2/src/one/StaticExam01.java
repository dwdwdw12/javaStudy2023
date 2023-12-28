package one;

public class StaticExam01 {	//클래스에는 static을 붙일 수 없다.
	public static int aaa = 300;	//static->가장 먼저 메모리에 저장
	public long bbb = 4000L;	//new에 의해 생성됨
//	public static final int ccc;	//선언과 동시에 초기화 필요
	
	public static final int DDD = 5000;	//상수, 대문자.
	
//	StaticExam01(){
//		ccc=5000;		//사용불가
//	}
	
	public void maaaa() {	//new에 의해 생성되는 메서드
		System.out.println(StaticExam01.aaa);
		System.out.println(bbb);	//같이 생성됨
	}
	
	public static void smaaa() {	//이 메서드는 new에 의해 객체가 생성되기 전에 메모리에 만들어짐
//		System.out.println(bbb);	//사용불가
		System.out.println(aaa);
	}

	
}

class ExamAAA{
	public void aaaExam() {
		System.out.println(StaticExam01.aaa);
	}
	
//	public void bbbExam() {
//		System.out.println(StaticExam01.bbb);	//static이 아니므로 new를 통해 생성 필요
//	}
}
