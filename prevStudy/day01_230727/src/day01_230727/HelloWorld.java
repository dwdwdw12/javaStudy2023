package day01_230727;
							//7.27 노트 참조
public class HelloWorld {	//클래스명>대문자 시작
	int age;									//age: 필드명, 멤버 변수, 속성, 파란색, public void main() 밖에 선언
	static String iname="가나다";						//static 필드, 파란색, 이탤릭체
	
	public static void main(String[] args) {	//예약어>자주색, 소문자
		DataPrint obj = new DataPrint(); 
		obj.consolePrint("Hello world!");		//caller class
		obj.printerPrint(null);					//obj: 지역변수, 갈색
		
		int[] aaa;		//사용자 정의 타입
		String k;
		k = "abc";		
		
		int b;		//숫자, 4byte
		b = 110;
		double bb;	//실수 8byte
		bb = 125.5;
		char bbb;	//문자 저장, 1byte
		boolean cc;	//진리 1byte
		
		String ccc; //4byte(지금은), 자료가 아닌, 메모리의 주소를 저장하고 있음
		
		int[] arrInt = {1, 2, 3};
	}

}
