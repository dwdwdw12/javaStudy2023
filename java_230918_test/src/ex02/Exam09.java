package ex02;

//반환타입이 없고, 매개변수가 없는 유형
public class Exam09 {
	
	public static void main(String[] args) {
		add();
		System.out.println("프로그램 종료");
	}
	
	//			반환타입 함수명  매개변수
	public static void add() {
		System.out.println("매개변수 반환타입 없음");
		return;
	}
	
}
