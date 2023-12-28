package ajavalang;

import java.util.Random;

public class MathExam {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(4)+"     "+Math.pow(4,0.5));
		System.out.println(Math.pow(8,1/3.0));	// 1/3을 쓸 경우, 정수형으로 처리되어 0이 됨. 계산결과는 8^0=1
		
		System.out.println("------------------------------");
		
		for(int i=0;i<10+1; i+=1) {
			System.out.println(Math.pow(2, i));
		}
		System.out.println("------------------------------");
		
		//round, ceil, floor => 사용할 때 정확하게 구분해서 사용하기
		System.out.println("ceil: "+Math.ceil(12.1));
		System.out.println("floor: "+Math.floor(12.1));
		System.out.println("round: "+Math.round(12.1));
		
		System.out.println("------------------------------");
		
		for(int i=1; i<11;i+=1) {
			//System.out.println(Math.random());
			System.out.println((int)(Math.random()*100));	//0부터 99까지의 숫자 생성
		}
		
		System.out.println("------------------------------");
		
		Random rnd = new Random(50);		//()안에 시드 값을 주면 특정한 숫자 배열을 만들어 낼 수 있음(누구에게나 동일).	//게임에서 활용 ex)프리셸
		long st = System.currentTimeMillis(); //시간 측정
		long st2 = System.nanoTime();
		for(int i=1; i<11;i+=1) {
			//System.out.println(rnd.nextInt(100));	//정수형 숫자, ()안의 숫자는 범위 구간
			System.out.println(rnd.nextInt(50)+101);	//101~151까지의 임의의 숫자
			//System.out.println(rnd.nextDouble());	
		}
		
		System.out.println("------------------------------");
		
		System.out.println("소요시간: " + (System.currentTimeMillis()-st));
		System.out.println("소요시간: " + (System.nanoTime()-st2));
	}
}
