package two.inter;

public interface InterExam01 {
	default void printAge(int age) {	//InterTest에서 활용할 공통기능을 추가하고 싶을 때
		System.out.printf("당신의 나이는 %d세입니다.\n", age);
	}
	void printName(String iname);
	
}
