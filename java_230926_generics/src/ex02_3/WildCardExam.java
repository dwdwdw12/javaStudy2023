package ex02_3;

class Box<T>{
	private T obj;
	public void set(T obj) {this.obj = obj;}
	public T get() {return this.obj;}

	@Override
	public String toString() { return obj.toString();}
}

class Toy{						
	public String toString(){return "I am a Toy";}
}

class BoxHandler{
	public static void inBox(Box<Toy> box, Toy n) {	//저장하기. 
		box.set(n);
	}
	public static void outBox(Box<Toy> box) {		//꺼내기.
		Toy t = box.get();
		System.out.println(t);
		//box.set(new Toy());		//출력을 위한 메서드임에도 set을 이용한 입력이 가능.
							//이러한 상황을 방지하기 위해서-> 상한제한/하한제한 사용.
							//프로그램의 안정성(실수의 가능성)이 높아지고 유지보수 용이.
							//입력 시에 오류 확인 가능해짐.
	}
}


public class WildCardExam {
	public static void main(String[] args) {
		Box<Toy> tBox = new Box<Toy>();
		BoxHandler.inBox(tBox, new Toy());
		BoxHandler.outBox(tBox);
		
	}
}
