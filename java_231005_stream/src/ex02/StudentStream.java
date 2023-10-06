package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

class Student{
	private String name;
	private int java;
	
	public Student(String name, int java) {
		this.name = name;
		this.java = java;
	}
	
	public int getJava() {
		return java;
	}
}

public class StudentStream {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("조조", 92));
		students.add(new Student("유비", 77));
		students.add(new Student("손권", 90));
																		
		double avg = students.stream()
						.mapToInt(s->s.getJava())
						.average()
						.getAsDouble();	//OptionalDouble을 double로
		System.out.printf("%.2f\n",avg);
		
		OptionalDouble avg2 = students.stream()
				.mapToInt(s->s.getJava())
				.average();
		System.out.println(avg2);
		
		
		System.out.println(avg2.getAsDouble());
		
		
	}
}
