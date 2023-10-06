package ex02_5;

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

//PECS(Producer-Extends get, Consumer-Super set) 공식.
class BoxHandler{
								 //하한 제한 => get 불가, set 가능
	public static void inBox(Box<? super Toy> box, Toy n) {	//저장하기. set만 가능
								//Toy 이상의 타입이 올 수 있음
		
		box.set(n);				//만약 매개변수가 Object n이라면 불가능.
		
/*		box.set(new Toy());
		box.set(new Car());
		box.set(new Play());  //원래 안됨			*/
		
/*		Toy n2 = box.get();
		Car n4 = box.get();	//원래 안됨
		Play n3 = box.get();*/
	}
									//상한 제한 => get 가능, set 불가
	public static void outBox(Box<? extends Toy> box) {		//꺼내기. get만 가능
		Toy t = box.get();			//Toy 이하의 타입이 올 수 있음
		System.out.println(t);
		
/*		Car c = box.get();		//원래 안됨
		Play p = box.get();
		
		box.set(new Play());	//원래 안됨
		box.set(new Car());
		box.set(new Toy());	*/	//컴퓨터 입장에서는 어떤 타입이 올 지 모르므로, 
									//set의 기능을 막아놓음.
									//set(Toy toy)를 만들어, 타입을 확실하게 정의하면 가능함.
	}
}


public class WildCardExam {
	public static void main(String[] args) {
		Box<Toy> tBox = new Box<Toy>();
		BoxHandler.inBox(tBox, new Toy());
		BoxHandler.outBox(tBox);
		
		//Toy a=tBox.get();
		
	}
}
