package ajavalang;

public class StringNStringBuffer {
	public static void main(String[] args) {
		
		String stringData = "a";
		for(char i='b';i<='z';i++) {
			stringData +=i;	//String 타입의 변수에 저장된 문자열이 빈번하게 변경이 된다 -> String 사용 비권장(힙영역 공간 낭비)
		}
		System.out.println(stringData);
		//stringData.reverse();	//없음
		
		//String reverseStringData = new StringBuffer(stringData).reverse()+"";
		String reverseStringData = new StringBuffer(stringData).reverse().toString();
									//stringbuffer에 담기			//뒤집기	  //다시 String으로
		System.out.println(reverseStringData+"뒤집어짐");
		
		StringBuffer sbu = new StringBuffer(14);
		sbu.append("abcdefghijklmn");
		for(char i='b';i<='z';i++) {
			sbu.append(i);		//추가->append
		}
		System.out.println(sbu);
		System.out.println(sbu.length());
		sbu.reverse();		//문자열 뒤집기
		System.out.println(sbu);
		
		//sbu.toCharArray		//없음
		char[] sbuArray = (sbu+"").toCharArray();	//string 변환
		//char[] sbuArray = new String(sbu).toCharArray();
		
		//String numstr = String.valueOf(123);
		String numstr = 123+"";
	}
}
