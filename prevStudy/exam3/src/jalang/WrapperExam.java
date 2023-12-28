package jalang;

import java.util.ArrayList;
import java.util.List;

public class WrapperExam {
	//int => Integer		//기본타입 - 참조타입
	//char => Character
	//long => Long			//-> packing // <- unpacking
			//래퍼클래스		//나머지는 대문자로 변환
	
	//int m = new Integer("3");
	Integer k = 3;			//기본타입보다는 참조타입으로 선언하는 것이 안정성이 더 뛰어나다.
							//VO클래스에서 기본타입을 래핑타입으로 정의하는 경우가 많다.
	
	public void methodAaa() {
		System.out.println(new Integer(3));
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.SIZE);	//bit 수
		//System.out.println(Integer.parseInt("ABCD"));
		System.out.println(Integer.parseInt("ABCDEF", 16));	//16진수로 해석
		System.out.println(Integer.parseInt("123", 10));	//default값이 10진수. 최대 36진수까지(0~9, A~Z까지)
		System.out.println(Integer.parseInt("123", 36));
		System.out.println(Integer.parseInt("1110110", 2));
		
		
		System.out.println(Integer.toHexString(255).toUpperCase());
		System.out.printf("%X\n", 255);
		System.out.println(Integer.toBinaryString(255));
		
		int kk = 0101110;	//0으로 시작->8진수로 해석, cf)0x로 시작->16진수
		int jj = 0x11001;
		System.out.println(kk);
		System.out.println(jj);
	}
	
	//10진수의 숫자를 6진수로 바꾸기
	public static String toMultiRadixString(int number, int radix) {	
		//암호화할 때 문자를 숫자로 변환해서 연결하는 방식에 적용가능
		String divData = "0123456789ABCDEFGHIJKLMNOPQKSTUVWXYZ";
		int sourceData = number;
		String result = "";
		while(true) {
			int divideNum = sourceData/radix;
			result = divData.charAt(sourceData%radix)+result;	//문자열이니까 나머지가 왼쪽부터 저장됨.
			sourceData = divideNum;
			if(divideNum<=0) break;
		}
		
//		int divideNum;
//		while((divideNum = sourceData/radix)>0) {
//			result = divData.charAt(sourceData%radix)+result;	
//			sourceData = divideNum;
//			if(divideNum==0) break;
//		}
		
		return result;
	}
	
	//n진수의 값을 10진수로 바꾸는 방법 //string 타입으로 입력하기!
	public static int toDecimal(String number, int radix) {	
		String divData = "0123456789ABCDEFGHIJKLMNOPQKSTUVWXYZ";
		String numberData = number.toUpperCase();
		String[] numsplit;
		numsplit = numberData.split("");
		
		List<Integer> list = new ArrayList<Integer>();
		int k;
		for(int i=0; i<numberData.length(); i=i+1) {
			if(radix>36) {
				System.out.println("입력형식이 잘못되었습니다.");
				break;
			}
			if(radix<2) {
				System.out.println("입력형식이 잘못되었습니다.");
				break;
			}
			
			k=divData.indexOf(numsplit[numberData.length()-(i+1)]);
			if(k>=radix) {
				System.out.println("입력형식이 잘못되었습니다.");
				break;
			} 
			if(k<0){	//찾는 문자열이 없으면 -1을 리턴
				System.out.println("입력형식이 잘못되었습니다.");
				break;
			} else{
				list.add(k);
			}
		}
		
		double sum=0;
		for(int i=0; i<numberData.length(); i=i+1) {
			sum =  sum + list.get(i)*Math.pow(radix, i);	//math.pow->double 타입으로 출력
		}
		
		return (int)sum;
	}
	
}
