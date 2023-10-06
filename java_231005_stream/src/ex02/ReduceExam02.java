package ex02;

import java.util.Arrays;
import java.util.List;

public class ReduceExam02 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//홀수의 곱을 계산하는 스트링식 구현
		//filter와 reduce를 사용한다.
												  
		//Integer result = numbers.stream().filter(n->n%2==1).reduce(1, (a,b)->a*b);
		Integer result = numbers.stream().filter(n->(n&1)==1).reduce(1, (a,b)->a*b);
		
		System.out.println(result);
		
	}
}
