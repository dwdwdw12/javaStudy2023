package one;

public class SuperMain {
	int f1 = 200;
	String f2 = "홍길동";
	
	public int numCalcu(int numData) {
		int f1 =300;
		return this.f1+numData;		//this.f1->200, f1->300, 색깔로 구분해보기
	}
	
	public void namePrint() {
		System.out.println(this.f2);
		System.out.println("test1");
		System.out.println("test2");
		System.out.println("test3");
		System.out.println("test4");
	}
}
