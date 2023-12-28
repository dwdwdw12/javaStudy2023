package two;

public abstract class AbstExam01 {
	int numData;	//인스턴스 필드	=> 필드
	private int privateData;
	protected int protectedData;		
	public int publicData;				//왼쪽 explorer의 AbstExam01 구성을 참고, 각 접근제한자를 다른 도형으로 표시함.

	public void method1() {	//인스턴스 메서드 => 메서드

 	}

	public void method2() {	//인스턴스 메서드 => 메서드

	}
}	//인스턴스 필드와 인스턴스 메서드만으로 구성된 추상 클래스 => 거의 사용하지 않음.

class AbstExam01Use{
	//AbstExam01 obj = new AbstExam01();	//abstract class는 new를 이용한 객체 생성이 불가
}

class SubAbstExam01 extends AbstExam01{
	
}
