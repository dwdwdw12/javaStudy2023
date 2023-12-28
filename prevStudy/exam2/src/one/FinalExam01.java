package one;

public class FinalExam01 {	//클래스는 final이 아니다
	public final int j = 10;	//비권장. 상수로 쓰려면 public final static으로 선언
	//필드이기 때문에 만들어지지 않은 상태=>생성자를 통해서 만들어진다.
	//=>생성자를 통해서 값을 변경할 수 없다.
	final public long abc;	//초기화가 필요
	public final int k;
	
	public String iname;
	
	public FinalExam01() {	
		k=10;
		abc = 500;			
	}
	
	public FinalExam01(int aaa, int data) {
//		this();
		k=aaa;
		abc = data;
	}
}

//FinalExam01 가 = FinalExam01();
//가.abc => 500, 가.k => 10;

//FinalExam01 나 = FinalExam01(200,300);
//나.abc => 300, 나.k => 200;