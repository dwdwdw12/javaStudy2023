package ex02;

class Box<T>{
	private T obj;
//	public Box(T obj) {this.obj = obj;}
	public void set(T obj) {this.obj = obj;}
	public T get() {return this.obj;}

	@Override
	public String toString() { return obj.toString();}
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {	//제네릭 메서드.
		return box.get();
	}
	public static void peekBox(Box<?> box) {	//와일드카드 메서드. <T> 유무 확인.
		System.out.println(box);		//제네릭 메서드에 비해 구조가 간단해 많이 사용.
	}
}


public class WildCardExam {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("So Simple String...");
		
		Unboxer.peekBox(box);
		String str = Unboxer.openBox(box);
		System.out.println("openBox : " + str);
		
	}
}
