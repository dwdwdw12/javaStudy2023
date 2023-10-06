package ex06_lambda_practice;

@FunctionalInterface
interface Cal2{
	int sumArr(int[] arr);
}

public class Ex04 {
	public static void main(String[] args) {
		Cal2 cal2 = arr -> {
			int sum = 0;
			for(int i: arr)
				sum+=i;
			return sum;};
		int[] arr = {0,1,2,3};
		System.out.println(cal2.sumArr(arr));	//안에 넣으려면 new int[] {...} 형태로.
	}
}
