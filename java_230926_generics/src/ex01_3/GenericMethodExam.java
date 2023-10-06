package ex01_3;

class Box<T>{
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
//	public Box(T obj) {
//		this.obj = obj;
//	}
}

class SteelBox<T> extends Box<T>{
	public SteelBox(T obj) {
		set(obj);
		//super(obj);
	}
}


public class GenericMethodExam {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<Integer>(new Integer(9999));
		Box<String> sBox = new SteelBox<String>(new String("Sweet"));
		
		Box<String> s2Box = new SteelBox(new Integer(100));	//오류, 양쪽의 타입을 일치시켜야 함.
															//java.lang.ClassCastException
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
	
}
