package ex02_02;

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

class Box<T>{				//제네릭 클래스
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
												//객체 생성시에 제네릭 사용, <>안에 타입 파라미터 정의.
		Box<Apple> aBox = new Box<Apple>();		//apple 또는 이를 상속받은 클래스의 타입만 삽입가능
												//Box 클래스의 T가 Apple로 바뀐다고 생각.
		aBox.setObject(new Apple());			//이제는 형변환 할 필요가 없음
		//aBox.setObject(new Orange());		//오류
		System.out.println(aBox.getObject());
		
		//Orange도 같은 방식으로 가능
		
		/*
		 * Box aBox = new Box(); 
		 * aBox.setObject(new Apple());
		 * System.out.println(aBox.getObject()); 
		 * aBox.setObject(new Orange());
		 * System.out.println(aBox.getObject());
		 */
		
	}
	
}
