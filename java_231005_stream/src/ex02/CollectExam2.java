package ex02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExam2 {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "cherry", "data", "elderberry");

		List<String> list = words.stream()
								.filter(s->s.length()>5)
								.collect(Collectors.toList());		//수집해서 리스트로 넘겨줌
		
		System.out.println(list);
		
	}
}
