package a_day02;

public class TypeExample2 {

	public static void main(String[] args) {
		
		//System.out.println(MethodExample.age);	//인스턴스 필드는 바로 접근할 수 없음.
		MethodExample.longdata=123456789012345L;
		//System.out.println(MethodExample.longdata);	//정적 필드는 static 영역에 생성. 최우선순위로 생성.
		
		long a = Long.MAX_VALUE;
		//int b = a;	//자료의 크기가 맞지 않음.
		int b = (int)a;	//형 변환 
		System.out.println(a);
		System.out.println(b);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);	//MIN_VALUE

	}

}
