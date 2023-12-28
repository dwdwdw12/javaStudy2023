package exam3;

import java.util.Scanner;

//인터페이스 SuperInter를 구현하는 Class<=인터페이스가 가진 메서드를 구체화해야 한다.
public class SuperInterImpl implements SuperInter{

	@Override
	public String dataString() {
		@SuppressWarnings("resource")	//경고제외
		Scanner scan = new Scanner(System.in);
		System.out.print("입력하세요: ");
//		scan.close();  			//scan이 계속 열려있으니까
		return scan.nextLine();
	}

	@Override
	public void print() {
		System.out.println("출력");
		
	}

}
