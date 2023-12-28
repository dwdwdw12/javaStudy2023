package twotest;

import org.junit.Test;

import two.inter.InterExam02;
import two.inter.LambdaInter01;
import two.inter.LambdaInter02;

public class FuncInterExam {
	
	@Test
	public void FuncInterObjectCreateTest() {
		InterExam02 obj = new InterExam02() {
			
			@Override
			public void strPrint(String str) {
				System.out.println(str + "입니다.");
			}
		}; //InterExam02가 함수형 인터페이스이기 때문에 익명의 클래스를 정의해서 사용하면 좋다.
			
		//함수형 인터페이스는 자바1.8에서 람다식을 적용할 수 있기 때문이다.
		obj.strPrint("홍길동");
		System.out.println("======람다식(자바 스크립트의 화살표 함수)을 이용한 결과=====");
		InterExam02 objLambda = (str) -> {System.out.println(str + "입니다.");};
		//InterExam02 objLambda = str -> System.out.println(str + "입니다.");
		objLambda.strPrint("홍길동");
		
		
	
//		obj.defMethod();
	}
	
	@Test
	public void FuncInterObjectCreateTest2() {
//		LambdaInter01 inter = (a, b)->{
//			if(a>b) {
//				return a;
//			}else {
//				return b;
//			}
//		};
		
//		LambdaInter01 inter2 = (a, b)->{
//			return (a>b) ? a: b;	//메서드의 몸체가 하나의 명령일 경우 {}를 생략할 수 있다.
//		};							//하나의 명령이 return문일 경우, return도 생략할 수 있다.
		
		LambdaInter01 inter = (a, b) -> (a>b)? a: b;	//자바 1.8버전부터
							  //매개변수
		System.out.println("큰수: " + inter.maxNum(100, 50));
		System.out.println("큰수: " + inter.maxNum(200, 250));
		
		//매개변수가 없는 경우	   () 괄호만 쓰기
		LambdaInter02 inter2 = () ->{
			System.out.println("가나다");
			return null;
		};
		inter2.aaa();
		
			//동작하고 있는 클래스의 이름			// 형 변환
		Class<FuncInterExam> classInfo = (Class<FuncInterExam>) getClass();
//		Class<LambdaInter01> classInfo2 = (Class<LambdaInter01>) getClass();
		System.out.println(getClass()); 	//object의 class 호출
		System.out.println(classInfo);
	}
	
}
