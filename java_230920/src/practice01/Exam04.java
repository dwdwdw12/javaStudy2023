package practice01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = scanner.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합:"+sum);
		scanner.close();
	}

}
