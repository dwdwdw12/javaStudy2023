package com.dongwoo.day02;

import java.util.Scanner;

public class KeySungjukInput implements SungjukInput {	//같은 묶음

	@Override
	public SungjukVO dataInput() {		//타입을 맞추기. return 반환값 고려 //void: 리턴값 없이 쓰임
		
		SungjukVO vo = new SungjukVO();		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("학번을 입력하세요: ");
		String hakbun = scanner.next();				//입력받은 자료를 문자로 인식
		System.out.println("이름을 입력하세요: ");
		String irum = scanner.next();
		System.out.println("국어점수를 입력하세요: ");
		int kor = scanner.nextInt();				//nextInt: 입력받은 문자를 정수로 인식
		System.out.println("영어점수를 입력하세요: ");
		int eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요: ");
		int mat = scanner.nextInt();
		
		vo.setHakbun(hakbun);					//입력받은 정보를 sungjukVO에 전달
		vo.setIrum(irum);
		vo.setKor(kor);
		vo.setEng(eng);
		vo.setMat(mat);
		
		return vo;
	}

}
