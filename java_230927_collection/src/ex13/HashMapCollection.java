package ex13;

import java.util.*;

public class HashMapCollection {
	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(45, "Toy1");
		map.put(35, "Robot");
		map.put(45, "Toy2");
		map.put(25, "Box");
		map.put(15, "Toy");
		map.put(45, "Toy3");
		
//		System.out.println(map.get(45));	//키가 중복된 경우에 마지막 중복키의 value가 출력됨.
//		System.out.println(map.get(35));
//		System.out.println(map.get(25));
//		System.out.println(map.get(15));
		
		Set<Integer> keySet = map.keySet();
		
			   //i		//keyset
		for(int key : map.keySet()) {
			System.out.print("key : " + key); 			//key만 출력
			System.out.println(" value : " + map.get(key));	//value만 출력
		}
		
		System.out.println("==================================");
		
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			System.out.print("key : " + key);
			System.out.println(" value : " + map.get(key));
		}
		
	}
	
}
