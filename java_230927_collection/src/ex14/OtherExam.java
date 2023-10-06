package ex14;

import java.util.*;

public class OtherExam {
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);	list.add(20);
		list.add(30);	list.add(40);
		
		int[] intNum = new int[5];
		int[] intNum2 = {10, 20, 30, 40, 50};
		
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
		
		for(int i : list2)
			System.out.print(i + " ");
		
		System.out.println("\n===============================");
		
		List<String> list3 = Arrays.asList("Toy", "Box", "Robot");
		
		//list3.add("Box");			//Arrays.asList()로 생성시, 사용불가.
		
		for(String s : list3)
			System.out.print(s + " ");
		
		System.out.println("\n===============================");
		
		List<String> list4 = Arrays.asList("Toy", "Box", "Robot");
		
		List<String> list5 = new ArrayList<String>(list4);	//ArrayList에 담아줌
												//한 문장으로 만들 수도 있음.
		list5.add("Box");
		list5.add("Toy");
		
		for(String s : list5)
			System.out.print(s + " ");
	
	}
	
}
