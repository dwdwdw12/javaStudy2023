package ex02;

//두 정수 합을 구하는 함수
//반환타입이 있고, 매개변수가 있는 유형
public class Exam07 {
	
	public static void main(String[] args) {
		int sum = add(10,20);
		System.out.println(sum);
	}
	
	//			반환타입 함수명  매개변수
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	
}
