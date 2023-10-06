package ex09;

import java.util.*;

import lombok.AllArgsConstructor;

//이름과 나이가 같으면 동일 인스턴스로 판단이 되도록 hashcode와 equals를 재정의하세요.

@AllArgsConstructor
class Student{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age%10;		//hashcode가 바뀌면 set의 출력순서가 달라짐.
												//hashcode가 작은 순으로 set의 원소가 출력됨.
	}
	@Override
	public boolean equals(Object obj) {
		String iName = ((Student)obj).name;
		int iAge = ((Student)obj).age;
		boolean condition = name.equals(iName) && age==iAge;
		return condition ? true : false;
	}
}

public class SetCollention04 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student("조조", 20));
		set.add(new Student("조조", 30));
		set.add(new Student("조조", 20));
		set.add(new Student("유비", 27));
		set.add(new Student("유비", 27));
		
		for(Student student : set) {
			System.out.println(student);
			
		}	
	}
}
