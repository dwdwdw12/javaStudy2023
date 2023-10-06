package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample2 {
	
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("C:/data/test2.db");
		
		byte[] data = new byte[100];	
		
		while(true) {
			int num = is.read(data);	//한번에 읽어옴. while문 없어도 동작 가능.
			System.out.println("num : " + num);
			if(num==-1) break;
			
			//System.out.println("num : " + num);
			for(int i=0; i<num; i++) {
				System.out.println(data[i]);
			}
		}
		//System.out.println("======================");
		//System.out.println(Arrays.toString(data));	//100 자리 출력
	
		is.close();
		
		
		System.out.println("프로그램 종료");
		
	}
	
}
