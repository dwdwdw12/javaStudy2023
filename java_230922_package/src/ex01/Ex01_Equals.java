package ex01;

import java.util.Objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Ex01_Equals {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		System.out.println(num1==num2);
		//System.out.println(num1.equals(num2));
		System.out.println("=======================");
		
		Integer n1 = new Integer(10);		//wrapper, 객체로 포장하는 역할.
		Integer n2 = new Integer(10);
		
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));	//정수의 equals를 통한 비교는, wrapper를 통해 가능.
		
		Object obj = 10;	
		//Object obj = new Integer(10);
		
		
		Person p2 = new Person("aaa", 20);
		Person p3 = new Person("aaa", 20);

		System.out.println("=======================");
		
		System.out.println("Equals 재정의 : " + p2.equals(p3));
		System.out.println("새로 만들기 : " +p2.eqPerson(p3));
		
		System.out.println("=======================");
		
		System.out.println(p2);
		System.out.println(p3);
		
		
	}
	
}

@Setter
@Getter
@ToString
class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Person [성명=" + name + ", 나이=" + age + "]";
//	}
	
	//Person p2 = new Person(null, 20);
	//Object obj = p2;
	@Override
	public boolean equals(Object obj) {	//overriding이므로 매개변수를 Object가 아닌 Person으로 바꿀 수 없음.
		
		Person p = (Person)obj;		//downcasting
		
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	public boolean eqPerson(Person p) {
		return this.name.equals(p.name) && this.age == p.age;
	}
	
}
