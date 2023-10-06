package ex05;

import java.util.*;

public class SetCollention01 {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		
		Iterator<String> iterator = set.iterator(); //반복자 획득
		
		for(String s : set)
			System.out.println(s);		
		System.out.println("======================");
		
		String str;
		while(iterator.hasNext()) {
			str = iterator.next();
			if(str.equals("Box"))
				iterator.remove();		
			System.out.println(str);	
		}
		System.out.println("=======================");
		iterator = set.iterator();		
		while(iterator.hasNext()) {		
			str = iterator.next();
			System.out.println(str);	
		}
		
	}
	
}
