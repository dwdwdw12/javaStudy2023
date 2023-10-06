package ex06_static;

public class CalculatorExam {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(10, 20);
		System.out.println(cal.result);
		cal.minus=123;
		System.out.println(cal.minus);
		
		Calculator cal2 = new Calculator();
		cal2.add(10, 20);
		System.out.println(cal2.result);
		System.out.println(cal2.minus);	//minus는 정적변수이기 때문에 123이 출력됨
		
		cal.sub(10, 5);
		System.out.println(cal.minus);
		
		Calculator.sub(50, 10);
		System.out.println(Calculator.minus);
	}
	
}
