package practice01;

public class Exam10 {

	public static void main(String[] args) {
		
		int evenSum=0; int oddSum=0;
		for(int i=1;i<=30;i++) {
			if(i%2==0) {
				evenSum+=i;
			} else {
				oddSum+=i;
			}
		}
		System.out.println("짝수합:"+evenSum);
		System.out.println("홀수합:"+oddSum);
	}

}
