package ex02_7_generic_practice;

//참고) https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%A0%9C%EB%84%A4%EB%A6%AD-%EC%99%80%EC%9D%BC%EB%93%9C-%EC%B9%B4%EB%93%9C-extends-super-T-%EC%99%84%EB%B2%BD-%EC%9D%B4%ED%95%B4
class Play {
	public String toString(){return "I am 'Play'";}
}
class Toy extends Play{
	public String toString(){return "I am Toy";}
}
class Car extends Toy{
	public String toString(){return "I am Car";}
}
class Robot extends Toy{
	public String toString(){return "I am Robot";}
}


class Box<T> {
	private T obj;
	public void set(T obj) {this.obj = obj;}
	public T get() {return this.obj;}

	@Override
	public String toString() { return obj.toString();}
}

//PECS(Producer-Extends (get), Consumer-Super (set, add, ...)) 공식.
class BoxHandler{
	//코드 상에 오류는 없지만, 컴파일 시에 오류 발생 가능.
	// 하한 제한 => get 불가, set 가능
	public static void inBox(Box<? super Toy> box) { // 저장하기. set만 가능
									//get:안전하게 꺼내려면 Object 타입으로만 꺼내야함
									//set:Toy와 Toy의 하위 타입만 넣을 수 있음.

//		box.set(new Play());		//불가능A. Box<Toy> tBox = new Box<Toy>();로 생성될 경우, new Play()처럼 저장 불가. 
		box.set(new Toy()); 		
		box.set(new Car());
		box.set(new Robot());   	//Toy의 하위 타입은 어떠한 타입이 오더라도 업캐스팅이 가능하므로, set으로는 Toy와 Toy의 하위 타입만 넣을 수 있음.
		
		
		Toy toy = (Toy) box.get();
		Play play = (Play) box.get();
		//Car c1 = (Car) box.get();		//불가능B. 캐스팅 불가능. Box<A> aBox = new Box<A>(); 이렇게 생성하여, B를 넣어주었기 때문.
		Object obj = box.get();		//최상위 타입인 Object가 가장 안전.

	}

	// 상한 제한 => get 가능, set 불가
	public static void outBox(Box<? extends Toy> box) { // 꺼내기. get만 가능
									//get:안전하게 꺼내려면 Toy 타입으로만 꺼내야함
									//set:불가능. null만 가능
		
		Toy toy = box.get(); 		//안전.
		System.out.println(toy);	
//		Car car = (Car) box.get();	//불가능1. Box<Robot> rBox = new Box<Robot>();로 생성. rBox.set(new Robot()); 주입. 형제 캐스팅 x
									//불가능2. Box<Toy> tBox = new Box<Toy>(); 생성, tBox.set(new Toy()); 주입. 다운 캐스팅 x
		
//		box.set(new Car());			//불가능3. Box<Robot> rBox = new Box<Robot>();로 생성될 경우, 형제 객체인 new Car() 저장 불가.
//		box.set(new Toy());  		//생성자의 타입에 따라 가능한 경우(Toy로 생성)도 있지만, 위의 가능성 때문에 set은 모두 에러 처리.
									//값을 넣고 싶다면 super 사용하기.

	}
}

public class Generics {
	public static void main(String[] args) {
		
		//불가능A
//		Box<Toy> tBox = new Box<Toy>();
//		BoxHandler.inBox(tBox);

		//불가능B
//		Box<Play> pBox = new Box<Play>();
//		BoxHandler.inBox(pBox);

		//불가능2
//		Box<Toy> toyBox = new Box<Toy>();
//		toyBox.set(new Toy());		
//		BoxHandler.outBox(toyBox);
		
		//불가능1, 불가능3
		Box<Robot> rBox = new Box<Robot>();	
		rBox.set(new Robot());
		BoxHandler.outBox(rBox);
		
	}
}
