package a_this_super;

public class ExamInterface {
	
	int k;
	int aa;
	String bb;
	
	public ExamInterface(int k, int aa) {
		//super();						//this와 super는 함께 쓰일 수 없음
		//this();						//ExamInterface() 호출, 없으면 컴파일러가 알아서 구문 삽입
		this.k=k;
		this.aa=aa;
	}
	
	public ExamInterface(String bb, int k) {	//같은 이름으로 메서드를 만들면 구분불가
											//매개변수의 타입이 같으면 구분불가(int aa, int k)->변수명이 달라도 같은 것으로 취급	
											//오버로딩
		this.k=k;								
		this.bb=bb;
	}

	public ExamInterface() {
		//super();	//부모 클래스 생성자 호출. 이 경우에는 Object
	}
	
	
}
