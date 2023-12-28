package one;

public class FinalExam02 {
	public final void aaa() {
		System.out.println("aaaaa");
	}
	
	public void bbb() {
		System.out.println("bbbbb");
	}
	
}

class subFinalExam02 extends FinalExam02{
//	@Override
//	public void aaa() {		//final -> 메서드에서는 override를 허용하지 않음
//		System.out.println("new aaa");
//	}
	
	@Override
	public void bbb() {		
		System.out.println("new bbb");
	}
	
	public void aaa(int k) {		//aaa()를 사용하기 위해 overloading 등의 방법이 필요
		System.out.println("new aaa");
	}
	
}
