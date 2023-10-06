package ex06;

interface Printable3{
	void print(String msg);
}

public class Lambda3 {
	public static void main(String[] args) {
		Printable3 prn =  		//필요없는 부분을 제거.(당연한 부분)
								//생성자 + 인터페이스 제거
								//재정의 어노테이션 제거
			(String msg) -> {			//타입 String 도 제거가능.
				System.out.println(msg);
			};							//한 문장일 경우 중괄호 제거가능
			
		Printable3 prn2 = (msg) -> System.out.println(msg);
		
		prn.print("message print3");
	}
}
