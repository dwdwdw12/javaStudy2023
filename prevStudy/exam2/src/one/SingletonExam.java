package one;

public class SingletonExam {
	public int data = 35600;
	
	//여기서부터
	private static SingletonExam instance = new SingletonExam();
	//private static 영역에 정의

	private SingletonExam() {	//기본생성자 필요, private로 접근을 제한시킴

	}			//같은 클래스 내부이므로, 위에서 private로 접근을 제한해도 생성가능

	public static SingletonExam getInstance() {
		//정적 필드->정적 메서드로 정의
		return instance;
	}
	//여기까지가 이 클래스를 이용해서 생성되는 객체는 오직 하나뿐이다. 싱글톤
	
	
	public void printData() {
		System.out.println("abcde");
		System.out.println("data");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}

