package ex05;

public class Tire {
	public void roll() {
		System.out.println("일반 타이어가 굴러갑니다");
	}
}

class SubTire extends Tire{
	@Override
	public void roll() {
		System.out.println("sub tire");
	}
}