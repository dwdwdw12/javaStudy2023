package a_day02;

public class MethodExample {
	
	int age;	//인스턴스 멤버변수, 정수형 인스턴스 필드
	
	static long longdata = 123456789L; //정적 롱형 필드
	
	public void yang() {
		
		char cData;	//2byte	문자형 지역변수 ->스택 영역에 만들어진다.->메서드가 호출될 때-> 동작할 때.
		//cData = "a"; //error, 문자열이 아닌 문자 입력
		cData = 'a';
		cData = 65535;	//0~65535까지 입력가능
		cData = '가'; 
		
	}

}
