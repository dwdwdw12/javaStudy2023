package ex011;

public class Polymorphism02 {
	
	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
				
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
