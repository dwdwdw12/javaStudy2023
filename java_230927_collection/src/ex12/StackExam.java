package ex12;

import java.util.*;

public class StackExam {
	public static void main(String[] args) {
	
		//List<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
	
		stack.push(10);		//add로 대체 가능.
		stack.push(11);
		stack.push(9);
		stack.push(10);
		stack.push(15);
		
		stack.pop();
		stack.pop();		//Fisrt-In, Last-Out
		
		System.out.println("=======================");
		for(int num : stack) {
			System.out.println(num);
		}
	}
	
}
