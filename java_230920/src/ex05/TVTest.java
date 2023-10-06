package ex05;

public class TVTest extends Object {	//하위클래스가 상위클래스와 object 둘 다 상속x(다중상속x)
									//상위클래스가 object를 상속, 하위클래스가 상위클래스를 상속.
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		
		TV tv2 = new TV("black");
		
		TV tv3 = new TV(10);
		
		System.out.println(tv.channel);
		
		TV tv4 = new TV("black", 7, false);
		
	}

}
