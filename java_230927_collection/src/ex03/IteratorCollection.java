package ex03;

import java.util.*;

public class IteratorCollection {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> iterator = list.iterator(); //반복자 획득
		
		String str;
		while(iterator.hasNext()) {
			str = iterator.next();
			if(str.equals("Box"))
				iterator.remove();		//출력 후에 삭제하는 듯?
			System.out.println(str);	//4개 모두 출력
		}
		System.out.println("=======================");
										//iterator는 한 번 사용하면 재사용 불가능.
		iterator = list.iterator();		//재사용하고 싶으면 반복자를 다시 획득해야 함.
		while(iterator.hasNext()) {		
			str = iterator.next();
			System.out.println(str);	//box 제거 후 출력.
		}
		
		
	}
	
}
