package ex06_lambda_practice_advanced;

import java.util.function.Function;

//매개변수 1개, 반환값 존재.
public class Ex04_Function {
	public static void main(String[] args) {
		Function<Integer[], Integer> cal =  arr -> {
			int sum = 0;
			for(int i: arr)
				sum+=i;
			return sum;};
		
		Integer[] arr = {2,4,6};
		System.out.println(cal.apply(arr));
	} 
}
