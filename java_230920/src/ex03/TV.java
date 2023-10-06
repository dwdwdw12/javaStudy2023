package ex03;

public class TV {
	
	String color;
	boolean power;
	int channel;	//멤버변수
	
	//생성자의 역할: 멤버변수 초기화에 이용될 수 있다.
	TV(){		//기본생성자. 클래스 생성시 습관적으로 만들어주는 것이 좋음.
		System.out.println("기본 생성자");
	}

	TV(int channel){	//지역변수
		this.channel = channel;		//변수명이 같을 경우, 지역변수가 우선하므로, 
									//this를 붙여 멤버변수로 지정해줌
	}
	
	TV(String color, boolean power, int channel){
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
