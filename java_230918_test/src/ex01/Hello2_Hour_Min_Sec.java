package ex01;

import java.util.Scanner;

public class Hello2_Hour_Min_Sec {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		int hour = num/3600;
		int min = (num%3600)/60;
		int sec = (num%3600)%60;	//num%60
			
		
		//출력
		System.out.printf("%d시간 %d분 %d초\n", hour, min, sec);	//1시간 6분 40초
	}
}
