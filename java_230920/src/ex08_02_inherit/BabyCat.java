package ex08_02_inherit;

public class BabyCat extends ParentCat{
	
	public String color;
	
	public BabyCat(String breed, String color) {
		super(breed);
		this.color=color;
	}
	
	void meow() {
		System.out.println("야옹하고 울다.");
	}
}
