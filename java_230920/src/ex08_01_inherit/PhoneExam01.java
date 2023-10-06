package ex08_01_inherit;

public class PhoneExam01 {

	public static void main(String[] args) {
		
		Phone p = new Phone("Apple", "White");
		
		p.bell();
		p.sendVoice("안녕");
		p.hangUp();
		
		SmartPhone s = new SmartPhone("Samsumg", "Black", true);
		s.bell();
	}
}
