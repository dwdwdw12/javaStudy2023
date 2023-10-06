package ex07_soundable;

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
		System.out.println("===================");
		
		Soundable s = new Cat();
		System.out.println(s.sound());
		
	}

}
