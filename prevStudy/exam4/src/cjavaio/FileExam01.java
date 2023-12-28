package cjavaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExam01 {
	public static void main(String[] args)  {	
		//외부 자원을 이용할 때는 반드시 exception 처리를 해주어야 한다
		//exception 떠넘기거나(호출한 곳으로 exception 처리를 넘기겠다) 잡아서 해결하는 방법이 있다. //main->jvm으로 넘기겠다.
		
//		FileInputStream fis;
//		FileReader fis; 
//		
//		try {
//			//fis = new FileInputStream("aaa.jpg");
//			fis= new FileReader("test.txt");
//			
//			int readData = fis.read();
//			//System.out.println(readData);
//			System.out.println((char)readData);
//			readData = fis.read();
//			System.out.println((char)readData);
//			readData = fis.read();
//			System.out.println((char)readData);
//			readData = fis.read();
//			System.out.println((char)readData);
//			 
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		FileReader fis; 
//		char[] readDataArr = new char[20];	//한번에 읽을 데이터의 양
//		int readCount = -9999;	//-1을 제외한 모든 숫자
//		try {
//			fis= new FileReader("test.txt");
//			StringBuilder aaa = new StringBuilder(40);		//String 사용x
//			while((readCount = fis.read(readDataArr))!=-1) {
//				for(int i=0; i<readCount; i+=1) {
//				//for(int i=0; i<readDataArr.length; i+=1) {	//향상된 for문을 사용할 경우
//					//System.out.print(readDataArr[i]);
//					aaa.append(readDataArr[i]);
//				}
//				System.out.println(aaa);
//			}
////			int readCount = fis.read(readDataArr);
////			for(char aaa: readDataArr) {
////				System.out.print(aaa);
////			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		
		FileReader fis; 
		FileWriter fw;
		char[] readDataArr = new char[20];
		int readCount = -9999;	//-1을 제외한 모든 숫자
		try {
			fis= new FileReader("test.txt");
			fw= new FileWriter("testW.txt", true); //true->파일의 끝부분에 새로운 내용을 추가, false->파일의 처음에 추가
			StringBuilder aaa = new StringBuilder(40);		//String 사용x
			while((readCount = fis.read(readDataArr))!=-1) {
				for(int i=0; i<readCount; i+=1) {
					aaa.append(readDataArr[i]);
				}
				fw.write(aaa.toString());	//stringbuilder 타입을 string 타입으로 변환
				System.out.println(aaa);
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

		
		
//		FileReader fis; 
//		FileWriter fw;
//		char[] readDataArr = new char[20];
//		int readCount = -9999;	//-1을 제외한 모든 숫자
//		try {
//			fis= new FileReader("test.txt");
//			fw= new FileWriter("testW.txt", true); //true->기존 파일 유지. 파일의 끝부분에 새로운 내용을 추가, false->파일의 처음에 추가
//			StringBuilder aaa = new StringBuilder(40);		//String 사용x
//			while((readCount = fis.read(readDataArr))!=-1) {
//				fw.write(readDataArr,0,readCount);	//stringbuilder 타입을 string 타입으로 변환
//			}
//			fis.close();
//			fw.close();
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
//		FileReader fis; 
//		FileWriter fw;
//		char[] readDataArr = new char[20];
//		int readCount = -9999;	//-1을 제외한 모든 숫자
//		try {
//			fis= new FileReader(args[0]);		//run configurations
//			fw= new FileWriter(args[1]); 
//			//StringBuilder aaa = new StringBuilder(40);		
//			while((readCount = fis.read(readDataArr))!=-1) {
//				fw.write(readDataArr,0,readCount);	
//			}
//			fis.close();
//			fw.close();
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		
	}
}
