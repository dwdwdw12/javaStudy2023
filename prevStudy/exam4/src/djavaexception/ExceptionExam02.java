package djavaexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam02 {
	public static void main(String[] args) throws FileNotFoundException /*throws ArithmeticException */{ // 보고
//		try {
//			FileInputStream fis = new FileInputStream("aaa.txt");
//		} catch (FileNotFoundException e) { // checked exception-> 외부 자원 사용
//			// checked exception을 unchecked exception으로 변경해서 보고하는 방식
//			throw new ArithmeticException(); // 변경
//		}
		ExceptionExam02 obj = new ExceptionExam02();	//같은 클래스에 있어도 static이면 가장 먼저 만들어지므로 개체 생성이 필요
		obj.Aclass();
	}

	public void Aclass() throws FileNotFoundException {
		Bclass();
	}

	public void Bclass() throws FileNotFoundException {		//호출을 한 곳에서도 exception을 throw해야 함
		Cclass();
	}

	public void Cclass() throws FileNotFoundException{			//이곳에서 exception을 throw하면
		FileInputStream fis = new FileInputStream("aaaa.txt");	
	}
}
