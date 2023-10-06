package ex01;

public class ConstantWithoutInit {	//상수 선언 후 생성자를 이용해 초기화하는 방법.
	public final int MAX;
	
	public ConstantWithoutInit() {
		MAX=100;
	}
	
	public static void main(String[] args) {
		ConstantWithoutInit h = new ConstantWithoutInit();
		System.out.println(h.MAX);	
		
	}
	
}
