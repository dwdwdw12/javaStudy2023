package practice01;

public class Exam06 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<11;i++) {
			sum=(int) (sum+Math.pow(-1, i+1)*i);
		}
		System.out.println("1-2+3..-10까지의 합:" + sum);
	}

}
