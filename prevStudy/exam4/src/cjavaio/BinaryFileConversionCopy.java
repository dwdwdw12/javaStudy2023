package cjavaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileConversionCopy {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("원본과 복사할 파일면 2개가 필요합니다.");
			System.exit(1);
		}
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			
			int readData; 
			while((readData=fis.read())!=-1) {	//다 읽고 나면 -1을 반환
//				readData = readData+1;	//파일을 깨진 상태로 복사(변환작업)	(보안성 부문)	//텍스트 파일도 가능
//				readData = readData-1;	//깨진 파일을 복원(run configuration-arguments에서 깨진 파일을 앞에, 새 파일을 뒤에 놓기)	//위의 작업과 반대되는 작업을 수행하기
				fos.write(readData);	//byte를 한꺼번에 읽음, 복사만 하고 싶을 때
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
