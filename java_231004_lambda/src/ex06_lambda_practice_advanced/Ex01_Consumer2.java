package ex06_lambda_practice_advanced;

import java.util.function.BiConsumer;

//매개변수 2개. 반환 타입이 void 인 경우.
public class Ex01_Consumer2 {
	public static void main(String[] args) {
		BiConsumer<String, Integer> biCon = (name, age) -> System.out.println(name + " = " + age);	//인터페이스 생성 않고, 람다식을 만드는 방법. 
		
		biCon.accept("조조", 25);	//cf)objDoubleConsumer : 매개변수가 Object, Double 타입인 경우
		
	} 
}
