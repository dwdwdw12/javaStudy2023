package com.dongwoo.day02.method02;

public class SungjukCompute {	//독립적인 클래스, 다른 클래스와 연관x
	public void totalCalcu(SungjukVO vo) {
		int total = vo.getEng() + vo.getKor() +vo.getMat();
		vo.setTot(total);
	}
	
	public void avgCalcu(SungjukVO vo) {
		totalCalcu(vo);
		vo.setAvg(vo.getTot()/3.0);
	}
}
