package ex03;

public class CurrentThreadName2 {
	public static void main(String[] args) {
		
		Runnable task = () -> {
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println( name + " : " + (n1+n2));	//호출해야 동작.
		};
		
		Thread t = new Thread(task, "MyThread");			//스레드 생성, 이름 지정 가능
		t.start();											//스레드 먼저 동작. 완료되기까지 시간이 걸림.
		
		System.out.println("end : " + Thread.currentThread().getName());	//위의 스레드가 동작하는 동안, 먼저 작업이 끝남. 먼저 출력
		
	}
}
