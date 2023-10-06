package ex04;

interface Printable{
	void print();
}

class Papers{
	private String con;
	public Papers(String con) {this.con = con;}
	public Printable getPrinter() {			
		
		return new Printable() {	//인터페이스는 객체 생성 불가. 구현 클래스가 필요. 
									//익명클래스를 사용하는 방법.
			@Override
			public void print() {
				System.out.println(con);
			}
		};					
	}
}

public class UseAnonymousInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터 : 메시지 출력");
		
		Printable prn = p.getPrinter();
		prn.print();						
	}
}
