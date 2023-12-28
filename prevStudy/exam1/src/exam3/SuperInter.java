package exam3;

//인터페이스-> 기능을 만드는게 아니라,
//설계하는 관점의 데이터 타입

//@FunctionalInterface			//추상메서드가 1개일 때의 어노테이션
public interface SuperInter {
	//모든 정의되는 필드는 정적이면서 최종적이다 = public static final->상수(필드)
	double PI = 3.1415; //= public static final double PI = 3.1415;
//	int aaa; error, 선언과 동시에 초기값을 정의해야 함.
	int aaa = 500;
	
	//모든 정의되는 메서드는 본체{...}가 없는 public 추상메서드 = public abstract
	String dataString();	//= public abstract String dataString();
	void print();

	
}

//인터페이스에 메서드가 하나도 없다 -> 의미론적인 인터페이스
//인터페이스에 메서드가 하나만 없다 -> 함수형 인터페이스(functional Interface)
//추상 메서드를 가진 타입(인터페이스,...)은 객체를 생성할 수 없다.
