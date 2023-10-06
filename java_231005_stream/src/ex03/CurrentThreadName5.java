package ex03;

class Counter2{
	int count = 0;
	
	public void increment() {
		synchronized (this) {
			count++;
		}
	}		 
	public void decrement() {	//필요한 자원만 동기화시킬수 있음
		synchronized (this) {
			count--;
		}
	}
	
	public int getCount() {return count;}
}

public class CurrentThreadName5 {
	
	public static Counter cnt = new Counter();		

	public static void main(String[] args) throws InterruptedException {
		
		
		Runnable task1 = () -> {
			for (int i = 0; i < 1000; i++) {
				cnt.increment();
			}
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 1000; i++) {
				cnt.decrement();
			}
		};
		
		Thread t1 = new Thread(task1, "MyThread");			
		Thread t2 = new Thread(task2, "MyThread");			
		t1.start();		//count 0 만 출력		
		t2.start();			
		
		//t1.join();		//작업이 끝날때까지 대기.		-> 메서드 앞에 synchronized 사용
		//t2.join();		//count가 실행시마다 다르게 나온다.
		
		System.out.println("count : " + cnt.getCount());
		
		System.out.println("end : " + Thread.currentThread().getName());	//join을 넣으면 마지막에 출력
		
	}
}
