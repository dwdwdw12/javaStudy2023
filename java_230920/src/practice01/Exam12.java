package practice01;

public class Exam12 {

	public static void main(String[] args) {
		
		int sevenSum=0; int nineSum=0;
		for(int i=1;i<=1000;i++) {
			if(i%7==0) {
				sevenSum+=i;
			}
			if(i%9==0) {
				nineSum+=i;
			}
		}
		System.out.println("7의 배수:"+sevenSum);
		System.out.println("9의 배수:"+nineSum);		
		System.out.println("7의 배수+9의 배수:"+(sevenSum+nineSum));
		
		
	}

}
