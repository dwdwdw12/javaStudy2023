package ex09_function_interface;

@FunctionalInterface	//추상메서드가 1개만 존재
public interface SampleInterface {
	
	void sample();
	//void sample2();		//@FunctionalInterface에서는 추상메서드가 여러개 존재할 수 없음
	//void sample3() {};	//인스턴스 메서드 불가능
	default void sample4() {};	//default method는 가능
	
}
