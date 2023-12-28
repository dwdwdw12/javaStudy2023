package threetest;

import three.ArrClassSample;

public class ArrayExam01 {
	//배열을 만드는 다양한 방법
	
	public void arrMethod() {
		int[] intArr;	//정수형 배열의 선언	//stack영역에 존재
		intArr = new int[3];	//정수형 배열의 생성
		intArr[0] = 10;		//초기화 //힙영역에 생성.
		intArr[1] = 20;
		intArr[2] = 30;
		
		String strArr[] = {"aaa","bbb"}; //배열의 선언과 생성과 초기화를 한꺼번에.
				//stack		//heap-string pool
		
		ArrClassSample[] arrSample = new ArrClassSample[] {new ArrClassSample(), new ArrClassSample()};
						//stack				//heap			//heap. 이차원 배열과 유사한 구조.
		arrArgs(arrSample);
		arrArgs(new ArrClassSample[] {new ArrClassSample(), new ArrClassSample(), new ArrClassSample()});
		arrArgs2(new ArrClassSample[] {new ArrClassSample(), new ArrClassSample(), new ArrClassSample(), new ArrClassSample()});
	}
	
	public void arrArgs(ArrClassSample[] arrSample) {	//메서드가 배열을 담고 있을 때
		for(int i=0; i<arrSample.length; i+=1) {
			System.out.println(arrSample[i].inData);
			System.out.println(arrSample[i].stData);	
		}
	}
	
	public void arrArgs2(ArrClassSample ... arrSamples) {
		for(int i=0; i<arrSamples.length; i+=1) {
			System.out.println(arrSamples[i].inData);
			System.out.println(arrSamples[i].stData);
			
		}
	}
	
		
}

