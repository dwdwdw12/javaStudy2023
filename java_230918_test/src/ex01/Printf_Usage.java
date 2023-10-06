package ex01;

public class Printf_Usage {	//상수 선언 후 생성자를 이용해 초기화하는 방법.
	
	public static void main(String[] args) {
		
		System.out.print("123");
		System.out.println(456);
		
		System.out.printf("정수 : %-3d, 실수 : %f, 문자열 : %s\n", 10, 10.2, "aaa");	//3칸을 확보한 뒤 왼쪽(-)부터 출력
		System.out.printf("정수 : %5d, 실수 : %5.3f, 문자열 : %s\n", 10, 10.2, "aaa");		//5칸을 확보한 뒤 오른쪽(+)부터 출력
		System.out.printf("정수 : %-3d, 실수 : %f, 문자열 : %s\n", 100, 10.2, "aaa");
		System.out.printf("정수 : %-3d, 실수 : %f, 문자열 : %s\n", 1, 10.2, "aaa");
		
	}
	
}
