package ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> 정수 입력(0은 입력하지 마세요) : ");
		String str = sc.nextLine();		//입력시에 오류가 나는지 확인할 수 없음. 입력시에 유효한 값이 들어왔는지 확인할 수 없음.
		
		try {
			System.out.println(5/Integer.valueOf(str));	//추가적인 변환과정을 거쳐야 함. 쓰지 말기.
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외처리 종료");
		}
			
		System.out.println("예외처리5");
		System.out.println("예외처리6");
		System.out.println("예외처리7");
		System.out.println("예외처리8");
		System.out.println("프로그램 종료");
	}
	
}
