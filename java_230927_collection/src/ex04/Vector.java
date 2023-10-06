package ex04;

import java.util.*;

public class Vector {
	
	public static void main(String[] args) {
		
		List<String> list = new java.util.Vector<String>();
		
		list.add("페르시안");
		list.add(null);
		list.add(1, "샴고양이");
		
		for(String s : list)
			System.out.println(s);
		
		
		
	}
	
}
