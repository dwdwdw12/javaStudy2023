package ex04;

public class TVUser {

	public static void main(String[] args) {
		
		TV tv = new LGTVSub();	//객체 하나만 바꿔도 전체 기능 수행 가능.
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
