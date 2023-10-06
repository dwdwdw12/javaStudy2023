package ex08_01_inherit;

public class Phone {
	
	String model;
	String color;
	
//	public Phone() {}	//default 생성자
	
	public Phone(String model, String color) {	//생성자. 이것이 default이면 오류가 발생함.
		this.model = model;						//하위 클래스에도 같은 형식을 맞추어 주어야 함.
		this.color = color;
	}
	
	public void bell() {
		System.out.println("전화 벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("음성 메시지를 보냅니다 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
