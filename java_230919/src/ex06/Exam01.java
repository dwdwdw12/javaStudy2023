package ex06;

public class Exam01 {
	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		int k=0;
		
		for(int i=0; i<arr.length;i++) {
			k=(int)(Math.random()*10);
			arr[k]++;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d의 개수는 %d개 입니다.\n", i, arr[i]);
		}
		
	}
	
}
