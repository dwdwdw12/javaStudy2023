package two.inter;

@FunctionalInterface
public interface InterExam02 {
	static void staMethod() {
		System.out.println("staMethod");
	}
	default void defMethod() {
		System.out.println(getClass().toString());
	}
	public void strPrint(String str);	
	//인터페이스가 여러개의 메서드를 가져도, 추상메서드만 1개이면 함수형 인터페이스
}
	