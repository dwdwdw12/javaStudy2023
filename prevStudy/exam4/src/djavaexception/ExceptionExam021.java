package djavaexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam021 {
	public static void main(String[] args) { 
		ExceptionExam021 obj = new ExceptionExam021();	
		obj.Aclass();
	}

	public void Aclass()  {
		Bclass();
	}

	public void Bclass()  {		
		Cclass();
	}

	public void Cclass() throws ProjectDefineException{			
		try {
			FileInputStream fis = new FileInputStream("aaaa.txt");
		} catch (FileNotFoundException e) {
			// 익셉션 처리를 해주고..
			//throw new ArithmeticException();	//런타임 익셉션으로 변경을 한 후에 던진다(보고)
			//System.exit(1);	//익셉션 처리를 잘못(보고, 잡아서 처리)하면 종료하는 것보다 더 나쁜 프로그램이 될 수 있다.
			throw new ProjectDefineException("C 클래스의 c메서드에서 처리도중 파일이 발견되지 않아 발생한 오류");
		}	
	}
}
