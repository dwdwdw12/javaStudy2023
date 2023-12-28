package cjavaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {
	public static void main(String[] args) {
		FileReader fis; 
		FileWriter fw;
		char[] readDataArr = new char[20];
		int readCount = -9999;	//-1을 제외한 모든 숫자
		try {
			fis= new FileReader(args[0]);		//run configurations
			fw= new FileWriter(args[1]); 
			//StringBuilder aaa = new StringBuilder(40);		
			while((readCount = fis.read(readDataArr))!=-1) {
				fw.write(readDataArr,0,readCount);	
			}
			fis.close();
			fw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
