package ex02;

class Apple{
	
	public String toString() {
		return "I like apple";
	}
}

class Orange{
	public String toString() {
		return "I like orange";
	}
}

class AppleBox{
	private Apple apple;
					//매개변수
	void setApple(Apple apple) {
		this.apple = apple;
	}
	
	Apple getApple() {
		return apple;
	}
}

class OrangeBox{
	private Orange orange;
	
	void setOrange(Orange orange) {
		this.orange = orange;
	}
	
	Orange getOrange() {
		return orange;
	}
}

public class Generics1 {

	public static void main(String[] args) {
		
		AppleBox abox = new AppleBox();
		OrangeBox obox = new OrangeBox();
					  //인자값, Apple 타입 또는 Apple을 상속받은 클래스의 타입만 가능
		abox.setApple(new Apple());
		obox.setOrange(new Orange());
		
		Apple apple = abox.getApple();		
		//Object ob = abox.getApple();
		Orange orange = obox.getOrange();
		//System.out.println(abox.getApple());
		
		System.out.println(apple);
		System.out.println(orange);
		
	}
	
}
