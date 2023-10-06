package ex03;

public class CurrentThreadName6 {
	public static void main(String[] args) throws InterruptedException {

		
		
		Thread t1 = new Thread(()->{
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		});			
		
		Thread t2 = new Thread(()->{	 				//번갈아가며 출력되지 않음. 순서가 뒤죽박죽.
				for (int i = 0; i < 5; i++) {
					System.out.println("World");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		});			
		
		t1.start();		
		t2.start();			
		
		t1.join();		
		//t2.join();		
		
		System.out.println("end : " + Thread.currentThread().getName());	
		
	}
}
