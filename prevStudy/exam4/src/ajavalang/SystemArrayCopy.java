package ajavalang;

import java.util.Arrays;

public class SystemArrayCopy {
	public static void main(String[] args) {
		String[] source ="aa bb cc dd".split(" "); 
		String[] copyArray = source;	//복사된 거 아님.
		
		for(String str: source) {
//			System.out.println(str);
			System.out.printf("%s " , str);
		}
		
		for(String str: copyArray) {
//			System.out.println(str);
			System.out.printf("%s " , str);
		}
		System.out.println();
		
		source[0]= "gildong";
		for(String str: source) {
			System.out.printf("%s " , str);
		}
		for(String str: copyArray) {
			System.out.printf("%s " , str);
		}
		//위의 내용은 복사가 아닌 공유 - 같은 배열을 공유하고 있다. -> 하나의 참조변수를 이용해서 값을 수정하면 
		//두 개의 서로 다른 참조 변수의 값으로 접근해도 값이 수정되는 것처럼 보인다.
		System.out.println();
		String[] ori = {"aa","bb","cc","dd"};
		String[] cpa = new String[5];
		System.arraycopy(ori, 0, cpa, 1, ori.length);	//복사할 인덱스를 설정 가능. copyarray의 공간이 충분히 넓어야 함으로 주의하기. [1]번째부터 시작. [0]번째는 null.
		ori[0] = "abcd";
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(cpa));
		
		//1차원 배열일 경우에는 간단하게 복사할 수 있다.
		//다차원 배열의 경우에은 복사가 보장되지 않는다.

		
	}
}
