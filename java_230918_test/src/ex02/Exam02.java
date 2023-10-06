package ex02;

public class Exam02 {
	public static void main(String[] args) {
		int numA = 100;
		int numB = 200;
		int temp = 0;
		
		System.out.printf("before => A : %d, B : %d\n", numA, numB);
		
		//numA, numB 체인지
		temp = numA;
		numA = numB;
		numB = temp;
		
		System.out.printf("after => A : %d, B : %d\n", numA, numB);
	}
}
