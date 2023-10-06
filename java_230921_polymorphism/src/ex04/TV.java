package ex04;

abstract public class TV {	//추상클래스 -> 객체 생성 불가
							//추상클래스를 상속받으면 반드시 추상메서드를 구현해야 함.
	
	abstract public void powerOn();		//abstract 키워드 필요
	
	abstract public void powerOff();
	
	abstract public void volumeUp();
	
	abstract public void volumeDown();
	
	public void aaa() {};	//일반 클래스를 선언할 경우 {} 필요
	
}
