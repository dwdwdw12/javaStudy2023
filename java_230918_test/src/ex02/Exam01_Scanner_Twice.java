package ex02;

import java.util.Scanner;

public class Exam01_Scanner_Twice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		//String str = sc.nextLine();	
		int number = sc.nextInt();		//숫자를 입력하면
		String clear = sc.nextLine();	//버퍼에 엔터키가 남아있음. 이것을 제거하기 위한 라인.
		String str = sc.nextLine();		//한 줄 전체를 읽어옴. 숫자, 문자 모두
	
		
		
		System.out.println(number);
		System.out.println(str);
		
	}

}
