package com.dongwoo.day02;

public class SungjukCompute {
	public void totalCalcu(SungjukVO vo) {
		int total = vo.getEng() + vo.getKor() +vo.getMat();
		vo.setTot(total);
	}
	
	public void avgCalcu(SungjukVO vo) {
		totalCalcu(vo);
		vo.setAvg(vo.getTot()/3.0);
	}
}
