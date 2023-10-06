package practice;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 21, 80, 85, 91);
		students[1] = new Student("김길동", 23, 90, 87, 76);
		students[2] = new Student("박길동", 20, 86, 77, 97);
		
		for(Student st : students) {
			System.out.println("학생의 정보 : " + st);
		}
		
		System.out.println("==========================================================================");
		
		Calculation cal = new ImplCalculation();
		
		cal.calResult(students[0]);	
		cal.calResult(students[1]);		
		cal.calResult(students[2]);
	}
	
}
