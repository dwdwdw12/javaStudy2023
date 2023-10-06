package ex02_03;

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

class Box<T extends Number>{	//Number를 상속받는 타입만 사용가능
								//Number : 숫자 타입의 최상위클래스.
	private T object;
					//매개변수
	void setObject(T object) {
		this.object = object;
	}
	
	Object getObject() {
		return object;
	}
}

public class Generics1 {

	public static void main(String[] args) {
		
		Box<Integer> aBox = new Box();
		
	}
	
}
