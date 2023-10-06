package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FirstStreamExam {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		IntStream stm1 = Arrays.stream(arr);
		IntStream stm2 = stm1.filter(n->n%2==1);	//중간연산, 1,3,5
		//int sum = stm2.sum();	//1+3+5		//최종연산
		int cnt = (int) stm2.count();		//최종연산이 끝난 후에 count 불가. //java.lang.IllegalStateException
		//System.out.println(sum);			//error
		System.out.println(cnt);
		
										//predicate
		int result = Arrays.stream(arr).filter(n->n%2==0).sum();
		System.out.println(result);
		
		System.out.println("=======================");
		
		String[] names = {"Toy", "CCCCC", "Box", "BB", "Robot", "AAAA"};
		
		Arrays.stream(names).filter(s->s.length()>3)
					.filter(s->s.length()%2==1)
					.forEach(s->System.out.println(s)); //최종연산
					//consumer
		
		List<String> list = Arrays.stream(names)
									.filter(s->s.length()>3)
									.filter(s->s.length()%2==1)
									.toList();
		System.out.println(list);
	
		
		System.out.println("=======================");
		
							//function
		Arrays.stream(names).map(s->s.length())
						.forEach(s->System.out.print(s + " "));
		
		System.out.println("\n=======================");
		
		int sum3 = Arrays.stream(names)
						.mapToInt(s->s.length())
						.sum();
		System.out.println(sum3);
		
		System.out.println("=======================");
		
		//List<String> str = Arrays.asList(new String[]{"Toy", "CCCCC", "Box", "BB", "Robot", "AAAA"});
		List<String> str = Arrays.asList("Toy", "CCCCC", "Box", "BB", "Robot", "AAAA");
		
		int sum2 = str.stream().mapToInt(s->s.length()).sum();			//list 는 Arrays. 없이 바로 스트림 사용 가능
		System.out.println(sum2);
		
	}
}
