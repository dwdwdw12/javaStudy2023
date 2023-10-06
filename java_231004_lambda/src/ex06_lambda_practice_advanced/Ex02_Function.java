package ex06_lambda_practice_advanced;

import java.util.function.BiFunction;
import java.util.function.Function;

//매개변수 1개, 반환값 존재.
public class Ex02_Function {
	public static void main(String[] args) {
		Function<Integer, Double> square = x -> x*x*1.0;
				//객체만 사용. int (x)
		System.out.println(square.apply(5));
	
		System.out.println("============================");
		//매개변수 2개, 반환값 존재
		BiFunction<Integer, Integer, Double> biCal = (x,y) -> (x+y)*2.0;
					//매개변수들		//반환타입
		System.out.println(biCal.apply(10, 15)); 
		
		System.out.println("============================");
		//매개변수 2개, 반환값 존재.
		BiFunction<Integer, Integer, Integer> biSub = (x,y) -> x-y;
		System.out.println(biSub.apply(10, 15));
		
		System.out.println("============================");
		//정적메서드 참조.
		Function<String, Integer> f4 = Integer::parseInt;
		System.out.println(f4.apply("100"));
	}
}
