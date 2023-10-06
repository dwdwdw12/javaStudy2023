package ex07;

public class Computer {
	//정적 메서드
	public static double staticMethod(double x, double y) {
		return x+y;
	}
	
	//인스턴스 메서드
	public double instanceMethod(double x, double y) {
		return x*y;
	}
}
