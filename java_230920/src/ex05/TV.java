package ex05;

public class TV {
	
	String color;
	boolean power;
	int channel;	//멤버변수
	
	//생성자의 역할: 멤버변수 초기화에 이용될 수 있다.
	TV(){		
		this("white",11,false);		//생성자 호출. 다른 생성자를 이용.
		System.out.println("기본 생성자");
	}


	TV(int channel){	//지역변수
		this("white",channel,false);
	}
	
	TV(String color){	//지역변수
		this(color,11,false);
	}
	
	TV(String color, int channel, boolean power){
		this.color = color;
		this.power =power;
		this.channel = channel;
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
