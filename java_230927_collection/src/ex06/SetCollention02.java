package ex06;

import java.util.*;

class Num{
	private int num;
	public Num(int num) {this.num = num;}
	public String toString() {
		//return num+"";	// 10.2 + 10 = 20.2. "10.2"+10 = "10.210"
		return String.valueOf(num);	// 정수/실수 + 문자열 => 문자열
	}
	
}

public class SetCollention02 {
	
	public static void main(String[] args) {
	
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(9999));
		set.add(new Num(8888));
		set.add(new Num(7777));
		set.add(new Num(9999));
		
		Iterator<Num> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==========================");
		Iterator<Num> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		
		
	}
	
}
