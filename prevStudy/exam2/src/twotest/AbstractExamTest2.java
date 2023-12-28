package twotest;

import java.util.Date;

import org.junit.Test;

import two.AbstExam03;

public class AbstractExamTest2 {
	@Test
	public void abstExam03Test(){
		AbstExam03 obj = new AbstExam03() {
			
			@Override								//추상 메서드가 2개라서 2개 생성
			//public void stringPrint(String[] str, String name) {
			public void stringPrint(String[] str) {
				for(int i=0; i<str.length; i=i+1) {
					System.out.printf("%s님\n 반갑습니다%s\n",str[i], 30);	
					//%: 형식지정문자. %s: 문자-> 숫자 등을 커버할 수 있음
					//%s, %d, %X(16진수 대문자), %x(16진수 소문자), %B
				}
			}
			
			@Override
//			public void intPrint(String irum, int... intData) {
			public void intPrint(int... intData) {	
				System.out.printf("%s, %s, %s\n", "aaa", "bbb", 120.75);
				//매칭되는 자료가 있어야 함
				System.out.printf("%1$s, %1$s, %1$s \n", "ccc");
				//n$: n번째 자료를 선택
				System.out.printf("%2$s, %1$s, %2$s \n", "ccc","ddd");
				System.out.printf("%1$tY년 %1$tm월 %1$td일\n", new Date());
				//날짜를 연/월/일별로 배칭시키는 방법
				
				for(int i=0; i<intData.length; i=i+1) {
					System.out.print(intData[i]+"숫자");	
				}
			}
		};
		obj.inamePrint("홍길동");
		obj.stringPrint(new String[]{"개구쟁이", "가나다라"});	//배열로 넘기는 방법
		obj.intPrint(10, 20, 30, 50);  //...으로 넘기는 방법
	}
}
