package ex07_singleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	//보통 이렇게 시작하면 singleton 패턴
	
	int apple = 100;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
