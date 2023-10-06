package ex01_1;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return this.ob;
	}
}

class Unboxer{
	public static <T> T openBox(Box<T> box){
		return box.get();
	}
}

public class GenericMethodExam {
	public static void main(String[] args) {
		Box<String> sBox = new Box<String>();
		sBox.set("Sweet");
		String str = Unboxer.<String>openBox(sBox);	//String , sweet
		
		System.out.println(str);
	}
	
}
