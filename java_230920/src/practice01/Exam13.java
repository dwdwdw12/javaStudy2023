package practice01;

public class Exam13 {

	public static void main(String[] args) {
		int a=0; int b=0;
		for(int i=10;i<100;i++) {
			a = i % 10;
			b = (i / 10) % 10;
			if(a==b) {
				System.out.printf("%d ", i);
			}

		}
	}

}
