package ex07;

import java.util.*;

class Num{
	private int num;
	public Num(int num) {this.num = num;}
	
	@Override
	public String toString() {
		//return num+"";	// 10.2 + 10 = 20.2. "10.2"+10 = "10.210"
		return String.valueOf(num);	// 정수/실수 + 문자열 => 문자열
	}
	@Override
	public int hashCode() {
		System.out.println("hash => ");	//값을 집어넣을 때 사용.
		//return Objects.hash(num);
		return num%3;		// hash table을 만들어줌. 없으면 판단불가.
	}					
	@Override				
	public boolean equals(Object obj) {
		System.out.println("equals => ");	//값을 입력할 때, hash와 함께 사용(hash가 같으면 equals로 비교).
											//set은 중복을 허용하지 않으므로.
											//list로 값을 입력할 때는 hash와 equals로 값을 비교할 수 없음.
//		if(num==((Num)obj).num) {
//			return true;
//		} else {
//			return false;
//		}
		
			//기존의 값	//비교하고자 하는 값
		return num == ((Num)obj).num ? true : false;
	} 
	
}

public class SetCollention03 {
	
	public static void main(String[] args) {
		
//		List<Num> set = new ArrayList<Num>();
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(9999));
		set.add(new Num(8888));
		set.add(new Num(7777));
		set.add(new Num(9999));		
		set.add(new Num(6666));
		set.add(new Num(9999));
		
		Iterator<Num> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
