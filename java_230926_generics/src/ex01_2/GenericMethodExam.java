package ex01_2;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return this.ob;
	}
}

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T obj){	//generic 타입을 숫자형으로 제한.
		Box<T> box = new Box<T>();
		box.set(obj);
		
		System.out.println("Boxed data : " + obj.intValue());	//정수형으로 바꾸겠다.
													// 정수, 실수, 숫자로 구성된 문자열만 변환가능.
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box){
		System.out.println("unBoxed data : " + box.get().intValue());
		return box.get();
	}
}

public class GenericMethodExam {
	public static void main(String[] args) {
//		Box<String> sBox = new Box<String>();
//		sBox.set("100");
//		String str = Unboxer.openBox(sBox);	
		
		Box<Integer> iBox = BoxFactory.<Integer>makeBox(new Integer(9898));
		Box<Integer> iBox2 = BoxFactory.makeBox(9898);	//자동으로 넣어줌
		//Box<Integer> iBox3 = BoxFactory.makeBox("123");	//숫자형이 아닌 값은 오류 발생.	
		//Box<String> sBox = BoxFactory.makeBox(new String("123"));	//숫자형이 아닌 타입으로 생성불가
		
		int n = Unboxer.openBox(iBox);	//정적메서드니까
		
		System.out.println(n);
	}
	
}
