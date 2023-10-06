package practice01;

public class Exam08 {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int i=100;i<1000;i++) {
			if(i%7==0) {
				count++;
				sum+=i;
			}
		}
		System.out.println("7의 배수 갯수:"+count);
		System.out.println("7의 배수 합:"+sum);
	}

}
