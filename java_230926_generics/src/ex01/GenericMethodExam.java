package ex01;

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
	public static <T> Box<T> makeBox(T ob){		//<T> : generic method를 나타내는 상징/특징
		Box<T> box = new Box<T>();
		box.set(ob);
		return box;
	}
}

public class GenericMethodExam {
	
	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		//String str = sBox.get();
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
		
	}
	
}
