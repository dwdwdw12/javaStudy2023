package ex02;

public class TV {
	
	String color;
	boolean power;
	int channel;
	
	TV(){		//기본생성자. 클래스 생성시 습관적으로 만들어주는 것이 좋음.
		System.out.println("기본 생성자");
	}

	TV(int n){
		System.out.println("매개변수 1개");
	}
	
	TV(String str, int n){
		System.out.println("매개변수 2개");
	}
	
	void power() {
		power = !power;		//반전. 전원이 켜져있으면 끄고, 꺼져 있으면 킴.
	}
	
	void channelUp() {
		channel++;
	}

	void channelUp(int n) {
		channel++;
	}
	
	void channelDown(int n) {
		channel--;
	}
	
	
}
