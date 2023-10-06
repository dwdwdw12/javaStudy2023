package ex02_01;

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

class Box{
	private Object object;
					//매개변수
	void setObject(Object object) {
		this.object = object;
	}
	
	Object getObject() {
		return object;
	}
}

public class Generics1 {

	public static void main(String[] args) {
		
		Box aBox = new Box();	//사과 박스
		Box oBox = new Box();	//오렌지 박스
		
		aBox.setObject(new Apple());
		oBox.setObject(new Orange());
		
		Object object = aBox.getObject();	//최상위 클래스니까
		Apple apple = (Apple) aBox.getObject();
		
		System.out.println(object);
		System.out.println(apple);
	}
	
}
