package ex06_interface;

public class SPrinter implements CSPrinter{

	@Override	//어노테이션
	public void print(String msg) {
		
		System.out.print("삼성 프린터 흑백 출력 : ");
		System.out.println(msg);
		
	}

	@Override
	public void cprint(String msg) {
		
		System.out.print("삼성 프린터 컬러 출력 : ");
		System.out.println(msg);
		
	}
	
}
