package ex05;

public class Exam02_LOTTO_By_Change_Position {

	public static void main(String[] args) {
		
		int[] numA = new int[45];
		
		for(int i=0;i<numA.length;i++) {
			numA[i] = i+1;
		}
		System.out.print("원 데이터 : ");
		for(int i=0;i<numA.length;i++) {
			System.out.print(numA[i] + " ");
		}
		//번호를 섞는 과정
		System.out.println();
		for(int i=0;i<100;i++) {
			int n = (int)(Math.random()*45);	//0~9
			int tmp = numA[0];
			numA[0] = numA[n];
			numA[n] = tmp;
		}
		System.out.print("LOTTO 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(numA[i] + " ");
		}
	}

}
