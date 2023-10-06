package practice01;

public class Exam07 {

	public static void main(String[] args) {
	
		for(int i=1;i<11;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.printf("%d ", i);
		}
	}

}
