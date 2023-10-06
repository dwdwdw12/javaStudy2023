package ex06_interface;

public class Printer implements Printable{

	@Override	//어노테이션
	public void print(String msg) {
	
		System.out.println(msg);
		
	}
	
}
