package cjavaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileSimpleCopy {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("원본과 복사할 파일명 2개가 필요합니다.");
			System.exit(1);
		}
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte[] realReadData = new byte[1024*4];	//kb 단위(1024)로 복사하겠다.
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			
			int readSize; 
			while((readSize=fis.read(realReadData))!=-1) {	
				fos.write(realReadData, 0, readSize);	
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			fis.close();	//정석은 이곳에 쓰고, try/catch를 사용하는 것
//			fos.close();
		}
		
	}
}
