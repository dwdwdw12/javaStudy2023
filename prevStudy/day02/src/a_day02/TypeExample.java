package a_day02;

public class TypeExample {
//	int age;	//정수명 필드, 멤버 변수, 속성 =>힙 영역에 만들어진다.->객체 생성 생성자 메서드가 호출(new)될 때
	public static void main(String[] args) {
//		char cData;	//2byte	문자형 지역변수 ->스택 영역에 만들어진다.->메서드가 호출될 때-> 동작할 때.
//		//cData = "a"; //error, 문자열이 아닌 문자 입력
//		cData = 'a';
//		cData = 65535;	//0~65535까지 입력가능
//		cData = '가'; 
		
		MethodExample methodExample;
		methodExample = new MethodExample();
		int kkk=20;
		int kk;		//stack 영역에 입력. 초기값이 없음
		
		//System.out.println(methodExample.age);	// . 을 통해 heap영역에 있는 필드, age에 접근가능
		
		// methodExample.age + 50;		//error, 값을 변환할 변수나 출력해야 함
		System.out.println(methodExample.age + 50);
		//System.out.println(kk);	//초기값이 없음
		
		String iname, aaa;		//stack 영역에 주소를 저장
		aaa = new String("Gil Dong");	//heap 영역의 문자열 공간에 생성
		iname = "Gil Dong";	//편의상 기본타입처럼 사용
		System.out.println(iname);
		System.out.println(aaa);
		System.out.println(aaa==iname);	//false, 두 변수가 가리키는 주소값이 다르기 때문에.
		
	}

}
