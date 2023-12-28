package com.dongwoo.day02;

public class ConsoleSungjukOutput implements SungjukOutput {	//같은 묶음
	
	@Override
	public void dataOutput(SungjukVO vo) {
		System.out.println("학번=> " +vo.getHakbun());
		System.out.println("이름=> " +vo.getIrum());
		System.out.println("국어=> " +vo.getKor());
		System.out.println("영어=> " +vo.getEng());
		System.out.println("수학=> " +vo.getMat());
		System.out.println("총점=> " +vo.getTot());
		System.out.println("평균=> " +vo.getAvg());
		
	}
	
}
