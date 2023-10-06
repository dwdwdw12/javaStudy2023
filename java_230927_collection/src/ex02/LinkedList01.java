package ex02;

import java.util.*;

public class LinkedList01 {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=========================");
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("=========================");
		
		list.remove(0);		//삭제시 연결을 끊음
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("=========================");
		
		list.add(1,"Toy");
		for(String str : list) {
			System.out.println(str);
		}
		
	}
	
}
