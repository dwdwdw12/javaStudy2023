package ex08;

import java.util.Arrays;
import java.util.List;

public class ForEachExam {
	public static void main(String[] args) {
		List<String> lists = Arrays.asList("Box", "Toy", "Robot", "Toy", "Box");
		
		for(String list : lists){
			System.out.println(list);
		
		System.out.println("======================");
		
			 //consumer 타입.
		lists.forEach(s->System.out.println(s));
		
		System.out.println("======================");
					//클래스이름		//PrintStream의 메서드명
		lists.forEach(System.out::println);
						  //정적변수
						 //PrintStream의 static 객체
		}
	}
}
