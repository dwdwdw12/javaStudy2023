package ex14;

import java.util.*;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
}

public class OtherExam3 {
	public static void main(String[] args) {
		
		Person[] persons = {new Person("조조", 20), new Person("유비", 30), new Person("관우", 30)};
		
		Arrays.sort(persons);		//정렬 불가능
		for(Person p : persons)
			System.out.println(p);	
	}
	
}
