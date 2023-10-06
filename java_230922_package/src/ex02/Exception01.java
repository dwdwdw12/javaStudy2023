package ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");
		
		System.out.println((double)5/0);		//Infinity
		//System.out.println(5/0);				//error
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> 정수 입력(0은 입력하지 마세요) : ");
//		String str = sc.nextLine();
//		System.out.println(5/Integer.valueOf(str));		//문자를 입력한다면, NumberFormatException 발생
		
		int[] num2 = new int[5];
		
		try {
			int num = sc.nextInt();		//정수가 아닌 값을 입력할 때, InputMismatchException 발생
			System.out.println(5/num);	//ArithmeticException 발생가능.
			num2[10] = 5;				//예외가 여러개 발생할 경우, 첫번째 예외를 감지한 뒤, 바로 catch문으로 넘어감.
		} catch (InputMismatchException e) {	//Exception e, Throwable e를 사용할 수 있지만, Throwable은 예외 뿐 아니라 에러도 감지하므로 비권장.
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();		//예외문장 전체가 출력.
		} catch (ArithmeticException e) {
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
