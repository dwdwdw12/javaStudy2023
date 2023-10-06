package ex01;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Ex00 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(0, list);
//		list.add(new Integer(5));
//		Deque<Integer> queue = new ArrayDeque<Integer>();
//		List<Integer> li = new Stack<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		set.add(5); set.add(41);
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(null, null);
		
//		for(String key : map.keySet()) {
//		    if(map.get(key).equals(list.get(num-1))) { 
//		      max = key;
//		    }
//		    if(map.get(key).equals(list.get(0))) { 
//			  min = key;
//			}
//		}
	}
}





















