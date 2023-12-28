package one;

public class SubMainOne extends SuperMain {
/*	int f1 = 200;
	String f2 = "홍길동";
	
	public int numCalcu(int numData) {
		int f1 =300;
		return this.f1+numData;	
	}
	
	public void namePrint() {
		System.out.println(this.f2);
	}
*/	//물려받음
	
	int sf1 = 4000;
	public void myDataPrint() {
		System.out.println(sf1 + f1); 	//f1은 SuperMain의 필드.
	}
	
	@Override
	public void namePrint() {
		super.namePrint();			//(추가). 부모 클래스의 메서드에
		System.out.println(this.f2);			//새로운 동작을 추가하고 싶을 때
		System.out.println("override printing");
	}
	

	public void namePrint(String data) {		//overloading, 매개변수가 달라짐
		System.out.println(this.f2);
		System.out.println(data);
		System.out.println("overloading printing");
	}
	
}
