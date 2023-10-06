package ex02_6;

class Box<T> {
	private T obj;
	public void set(T obj) {this.obj = obj;}
	public T get() {return this.obj;}

	@Override
	public String toString() { return obj.toString();}
}

class Play{}
class Toy extends Play{						
	public String toString(){return "I am a Toy";}
}
class Car extends Toy{}

class BoxContentMover{
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
		to.set(from.get());
	}
}

//PECS(Producer-Extends get, Consumer-Super set) 공식.


public class WildCardExam {
	public static void main(String[] args) {
		Box<Toy> tBox1 = new Box<Toy>();
		tBox1.set(new Toy());
		
		Box<Toy> tBox2 = new Box<Toy>();
		System.out.println(tBox1.get());
		//box1에 저장된 내용을 box2로 이동
		BoxContentMover.moveBox(tBox2, tBox1);
		System.out.println(tBox2.get());
	}
}
