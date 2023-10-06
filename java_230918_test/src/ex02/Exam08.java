package ex02;

//두 정수 합을 구하는 함수
//반환타입이 있고, 매개변수가 없는 유형
public class Exam08 {
	
	public static void main(String[] args) {
		int sum = add();
		System.out.println(sum);
	}
	
	//			반환타입 함수명  매개변수
	public static int add() {
		return 10+20;
	}
	
}
