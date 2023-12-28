package exam2;

public class SubOne extends SuperA {
	@Override			
	public void print() {	//SuperA와 구조가 같음
		System.out.println("SubOne-print()");
	}
	
	public void printOne() {
		System.out.println("SubOne-printOne()");
	}
}
