package ex01;

public class MainClass {

	public static void main(String[] args) {
		
		소미 소 = new 집사();
		소.역할();
		System.out.println("====================");
		소 = new 부모();
		소.역할();
		System.out.println("====================");
		소 = new 직장인();
		소.역할();
		System.out.println("====================");
		소 = new 자녀();
		소.역할();
		
		
	}

}
