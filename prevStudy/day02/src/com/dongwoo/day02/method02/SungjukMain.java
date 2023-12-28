package com.dongwoo.day02.method02;

public class SungjukMain {

	public static void main(String[] args) {	
		//자료입력
		SungjukInput input = new SungjukInputFileImpl();	//create class 'SungjukInputImpl'
		SungjukVO vo = input.dataInput();
		
		SungjukCompute compute = new SungjukCompute();
		compute.avgCalcu(vo);
		
		SungjukOutput output = new SungjukOutputImpl();	//관련된 클래스가 없을 때 new로 생성
		output.dataOutput(vo);
	}

}
