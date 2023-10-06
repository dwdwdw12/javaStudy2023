package ex03;

interface Printable{
	void print();
}

class Papers{
	private String con;
	public Papers(String con) {this.con = con;}
	public Printable getPrinter() {				
		
		class Printer implements Printable{			//ex02 UseMemberInnerClass.java 의 Printer 클래스를 메서드 안으로 옮김.
			@Override								//local inner class, Printer 의 생성자는 메서드 내부에서만 생성가능
			public void print() {					//클래스를 한 곳에서만 사용하는 경우에 적용 가능.
				System.out.println(con);			//print() 기능 구현이 핵심.
			}
		}
		
		return new Printer();					
	}
	//Printer pp = new Printer();					//불가능
}

public class UseLocal_InnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터 : 메시지 출력");
		
		Printable prn = p.getPrinter();
		prn.print();						
	}
}
