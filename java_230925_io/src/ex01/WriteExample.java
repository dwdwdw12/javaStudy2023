package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/data/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 20;
			
			os.write(a);	//1byte 출력
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
