package ex15;

import java.util.*;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person implements Comparable{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;	//((Person)o).age 같은 거
		
//		if(this.age > p.age) {			//이름, 이름의 길이 등 여러 조건으로 비교 가능.
//			return 1;
//		} else if(this.age < p.age) {
//			return -1;
//		} else {
//			return 0;			
//		}
		
		return this.age - p.age;	//오름차순
//		return p.age - this.age;	//내림차순
		
	}
}

public class OtherExam3 {
	public static void main(String[] args) {
		
//		Person[] persons = {new Person("조조", 40), new Person("유비", 20), new Person("관우", 30)};
		
		Person[] persons = new Person[3];
		persons[0] = new Person("조조", 40);
		persons[1] = new Person("유비", 20);
		persons[2] = new Person("관우", 30);
		
		Arrays.sort(persons);	//정렬 불가능.
		for(Person p : persons)
			System.out.println(p);
	}
	
}
