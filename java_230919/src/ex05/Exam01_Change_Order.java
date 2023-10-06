package ex05;

public class Exam01_Change_Order {

	public static void main(String[] args) {
		
		int[] numA = new int[10];
		
		for(int i=0;i<numA.length;i++) {
			numA[i] = i+1;
		}
		System.out.print("원 데이터 : ");
		for(int i=0;i<numA.length;i++) {
			System.out.print(numA[i] + " ");
		}
		
		System.out.println();
		for(int i=0;i<100;i++) {
			int n = (int)(Math.random()*10);	//0~9
			int tmp = numA[0];
			numA[0] = numA[n];
			numA[n] = tmp;
		}
		System.out.print("섞은 뒤의 데이터 : ");
		for(int i=0;i<numA.length;i++) {
			System.out.print(numA[i] + " ");
		}
	}

}
