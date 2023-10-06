package ex06_interface;

public class MainClass {

	public static void main(String[] args) {

		Printable prn = new LPrinter();
		String msg = "Hello, world";
		prn.print(msg);
		
		prn = new SPrinter();
		prn.print(msg);
		System.out.println("=====================================");
		
		CSPrinter p = new SPrinter();
		p.cprint(msg);
		p.print(msg);
		
		
	}

}
