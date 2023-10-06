package ex04;

abstract public class LGTV extends TV{
	
//	public void powerOn() {			//구현하고 싶지 않은 메서드가 있다면 추상클래스로 선언하기.
//		System.out.println("LGTV의 전원을 킵니다.");
//	}
	
	public void powerOff() {
		System.out.println("LGTV의 전원을 끕니다.");
	}
	
	public void volumeUp() {
		System.out.println("LGTV의 소리를 올립니다.");
	}
	
	public void volumeDown() {
		System.out.println("LGTV의 소리를 내립니다.");
	}
	
}
