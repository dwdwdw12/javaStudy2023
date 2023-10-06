package ex08_02_inherit;

public class ParentCat {
	public String breed;
	
	public ParentCat(String breed) {
		this.breed = breed;
	}
	
	void eat() {
		System.out.println("먹다.");
	}
}
