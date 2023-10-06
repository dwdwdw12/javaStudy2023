package ex02_2;

class Box<T>{
	private T obj;
	public void set(T obj) {this.obj = obj;}
	public T get() {return this.obj;}

	@Override
	public String toString() { return obj.toString();}
}

class Unboxer{						//하한 제한, ~타입 이상.
	public static void peekBox(Box<? super Integer> box) {	
		System.out.println(box);	
	}
}


public class WildCardExam {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<Integer>();	//Integer의 상위 타입으로만 생성가능
		iBox.set(9999);
		Unboxer.peekBox(iBox);
		
		Box<Number> nBox = new Box<Number>();	//Number
		nBox.set(10.3);
		Unboxer.peekBox(nBox);
		
		Box<Object> oBox = new Box<Object>();	//Object
		oBox.set("Simple");
		Unboxer.peekBox(oBox);
	
	}
}
