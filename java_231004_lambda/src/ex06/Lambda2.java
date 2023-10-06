package ex06;

interface Printable2{
	void print(String msg);
}

public class Lambda2 {
	public static void main(String[] args) {
		Printable2 prn = new Printable2() {		//익명 클래스 생성. 같은 인터페이스명으로.
			
			@Override							//구현
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		prn.print("message print2");
	}
}
