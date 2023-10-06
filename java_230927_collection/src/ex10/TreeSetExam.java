package ex10;

import java.util.*;


public class TreeSetExam {
	public static void main(String[] args) {
		
		Set<Integer> tree = new TreeSet<Integer>();
		
		tree.add(3);
		tree.add(2);
		tree.add(5);
		tree.add(10);
		tree.add(7);
		tree.add(4);
		tree.add(9);
		tree.add(10);			//tree 구조 생각해보기. 오른쪽에 계속 덧붙이는 방식?
		
		for(int num : tree) {	//tree 구조로 저장. 오름차순으로 출력
			System.out.println(num);
		}
	}
}
