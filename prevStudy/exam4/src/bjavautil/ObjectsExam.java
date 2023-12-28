package bjavautil;

import java.util.Objects;

public class ObjectsExam {
	public static void main(String[] args) {
		String sb1 = new String("string1");	//stringbuffer로는 false 왜?
		String sb2 = new String("string1");
		System.out.println(sb1.equals(sb2));
		System.out.println(Objects.equals(sb1, sb2));
		System.out.println(Objects.deepEquals(sb1, sb2));

		System.out.println("--------------");
		
		int[] aa = {1, 2, 3};
		int[] bb = {1, 2, 3};
		System.out.println(aa.equals(bb));
		System.out.println(Objects.equals(aa, bb));
		System.out.println(Objects.deepEquals(aa, bb)); //data가 같으면 true로 판단
		
		System.out.println("--------------");
		
		String data1 = "aaaaa";
		String data2 = null;	//아무것도 없음
		String data3 = "";	//빈 문자열이 들어가 있음
		System.out.println(Objects.toString(data2));
		System.out.println(Objects.toString(data2, "상자에 내용이 비었습니다"));	// comma 뒤 -> null default	
		
		System.out.println("--------------");
		System.out.println(Objects.toString(data3));
		System.out.println(Objects.toString(data3, "상자에 내용이 비었습니다"));	//빈 칸 출력
		System.out.println("--------------");
	}
}
