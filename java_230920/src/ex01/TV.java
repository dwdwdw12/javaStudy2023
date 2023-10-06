package ex01;

public class TV {
	
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;		//반전. 전원이 켜져있으면 끄고, 꺼져 있으면 킴.
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
}
