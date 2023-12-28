package com.dongwoo.day02.method02;

import java.util.Scanner;

public class SungjukInputImpl implements SungjukInput {
	//키보드라는 장치를 준비
	Scanner scan = new Scanner(System.in);	//필드. 메모리에 남아있음. JVM이 후에 회수
	
	@Override
	public SungjukVO dataInput() {
		SungjukVO sungjukVO = new SungjukVO();
		
		sungjukVO.setHakbun( stringInput("학번") );
		sungjukVO.setIrum( stringInput("이름") );
		sungjukVO.setKor( intInput("국어 점수") );
		sungjukVO.setEng( intInput("영어 점수") );
		sungjukVO.setMat( intInput("수학 점수") );		//지역변수. 사용된 후 삭제
		
		return sungjukVO;
		
	}
	
	private int intInput(String message) {
		System.out.println(message+"을(를) 입력하세요");	
		return scan.nextInt();						//숫자로 받기
	}

	private String stringInput(String message) {
		String returnString = null;	//방법2: 초기값 설정
		System.out.println(message+"을(를) 입력하세요");
		//return scan.next();							//문자로 받기
		returnString=scan.next();   //방법2: 값을 받은후
		return returnString;		//방법2: return
	}

}
