package ex02_04;

class A{}
class B extends A{}
class C extends B{}


class Box<T extends A>{	//Number를 상속받는 타입만 사용가능
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

public class Generics2 {

	public static void main(String[] args) {
		
		Box<C> cBox = new Box();
		Box<B> bBox = new Box();
		Box<A> aBox = new Box();
		
	}
	
}
