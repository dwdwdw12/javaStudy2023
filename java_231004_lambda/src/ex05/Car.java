package ex05;

public class Car {
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {		
		public void roll() {			//재정의
			System.out.println("익명 타이어가 굴러갑니다.");
		};
	};
	
	private Tire tire_sub = new SubTire();
	
	public void run1() {
		tire1.roll();
		tire2.roll();
		tire_sub.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 객체2 타이어가 굴러갑니다");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
}
