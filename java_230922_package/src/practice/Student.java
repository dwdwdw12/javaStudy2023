package practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
	
	private String name;
	private int age;
	private int kor;
	private int eng;	
	private int math;	
	private int sum;	
	private double avg;
	
	public Student(String name, int age, int kor, int eng, int math) {
		super();
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "이름 = " + name + ", 나이 = " + age + ", 국어점수 = " + kor + ", 영어점수 = " + eng + ", 수학점수 = " + math;
	}
	
}
