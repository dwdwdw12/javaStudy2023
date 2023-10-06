package ex02;

import java.util.Scanner;

public class Exam04_Score_To_Grade {
	public static void main(String[] args) {
		//java 점수를 입력받아서 학점을 구하는 프로그램 구현
		//90이상 a, 80 b, 70 c, 60 d, f
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수을 입력해 주세요 : ");
		int score = scanner.nextInt();
		
		int divScore = score/10;
		
		if(divScore>=9) {
			System.out.println("A등급 입니다.");
		} else if(divScore==8) {
			System.out.println("B등급 입니다.");
		} else if(divScore==7) {
			System.out.println("C등급 입니다.");
		} else if(divScore==6) {
			System.out.println("D등급 입니다.");
		} else {
			System.out.println("F등급 입니다.");
		}
		
//		switch(divScore) {
//		case 10 :
//		case 9 :
//		System.out.println("A");
//		break;
//		case 8 :
//		System.out.println("B");
//		break;
//		case 7 :
//		System.out.println("C");
//		break;
//		case 6 :
//		System.out.println("D");
//		break;
//		default :
//		System.out.println("F");
//		
//		}
		
		//String numstr = "9876543210";
		//String grades = "ABCDFFFFFF";
		//if(score==100) {
		//	System.out.println("A등급 입니다.");
		//} 
		//int target = numstr.indexOf(divScore+"");
		//char finalGrade = grades.charAt(target);
		String grades2 = "FFFFFFDCBAA";
		char finalGrade2 = grades2.charAt(divScore);
		System.out.println(finalGrade2 + "등급 입니다.");
		
	}
}
