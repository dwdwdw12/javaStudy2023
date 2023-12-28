package com.dongwoo.day02;

public class SungjukMain {

	public static void main(String[] args) {	//main > client, caller
		SungjukInput input = new KeySungjukInput();
		SungjukVO vo = input.dataInput();		//KeySungjukInput의 dataInput()
		
		SungjukCompute compute = new SungjukCompute();
		//compute.totalCalcu(vo);	//SungjukCompute 내, avaCalcu에서 해당 클래스를 호출하면 이 구문이 필요없음(리팩토링:결과의 변경 없이 코드의 구조를 재조장함).
		compute.avgCalcu(vo);
		
		SungjukOutput output = new ConsoleSungjukOutput();
		output.dataOutput(vo);
		//System.out.println(vo);
	}

}
