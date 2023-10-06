package ex01;

public class TVTest extends Object{	//하위클래스가 상위클래스와 object 둘 다 상속x(다중상속x)
									//상위클래스가 object를 상속, 하위클래스가 상위클래스를 상속.
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		
		tv.channel = 7;
		tv.channelDown();
		
		System.out.println(tv.channel);
		
		TV tv2 = new TV();
		System.out.println(tv2.channel);
		
		TV tv3;
		tv3=tv;			//대입연산자를 활용한 꼴.
		
		System.out.println(tv3.channel);
		
		tv3.channel = 100;
		
		System.out.println(tv.channel);
		System.out.println(tv3.channel);
	}
	
}
