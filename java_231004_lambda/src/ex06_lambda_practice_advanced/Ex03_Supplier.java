package ex06_lambda_practice_advanced;

import java.util.function.Supplier;

//매개변수 0개, 반환값 존재.
public class Ex03_Supplier {
	public static void main(String[] args) {
		Supplier<Integer> dice = () -> (int)(Math.random()*6+1);
		//BiSupplier 존재x. 반환값은 1개만 존재하므로(return문)
		System.out.println(dice.get());	
		
		//익명클래스 생성 가능
		Supplier<Integer> dice2 = new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				return (int)(Math.random()*6+1);
			}
		};
	} 
}
