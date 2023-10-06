package ex02;

public class TVUser {

	public static void main(String[] args) {
		
		LGTV tv = new LGTV();	//객체수정시
		
		tv.turnOn();			//아래의 메서드도 모두 수정해야함
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		
		
	}

}
