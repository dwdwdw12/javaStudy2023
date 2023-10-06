package ex06;

interface Cal2{
	int max(int num1, int num2);
}

public class Lambda5 {
	public static void main(String[] args) {
		Cal2 cal2 = new Cal2() {
			
			@Override
			public int max(int num1, int num2) {
				return num1>num2 ? num1 : num2;
			}
		};
		
		int result2 = cal2.max(5, 10);
		System.out.println(result2);
	}
}
