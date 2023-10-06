package ex02;

//반환타입이 있고, 매개변수가 없는 유형
public class Exam10_230919 {
	
	public static void main(String[] args) {
		add(10);
		System.out.println("프로그램 종료");
	}
	
	//			반환타입 함수명  매개변수
	public static void add(int number) {
		System.out.println("number : " + number);
		return;
	}
	
}
