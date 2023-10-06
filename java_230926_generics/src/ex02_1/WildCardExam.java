package ex02_1;

class Box<T>{
	private T obj;
//	public Box(T obj) {this.obj = obj;}
	public void set(T obj) {this.obj = obj;}
	public T get() {return this.obj;}

	@Override
	public String toString() { return obj.toString();}
}

class Unboxer{						//상한 제한, ~타입 이하.
	public static void peekBox(Box<? extends Number> box) {	//와일드카드 메서드. <T> 유무 확인.
		System.out.println(box);		//제네릭 메서드에 비해 구조가 간단해 많이 사용.
	}
}


public class WildCardExam {
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();	//Number의 하위 타입으로만 생성가능
		box.set(1234);
		//box.set(new Integer(12));
		Unboxer.peekBox(box);
		
		Box<Double> dBox = new Box<Double>();
		dBox.set(12.9);
		Unboxer.peekBox(dBox);
		
		Box<String> sBox = new Box<String>();
		sBox.set("12");
		//Unboxer.peekBox(sBox);	//String 타입은 Number의 하위 타입이 아님.
	}
}
