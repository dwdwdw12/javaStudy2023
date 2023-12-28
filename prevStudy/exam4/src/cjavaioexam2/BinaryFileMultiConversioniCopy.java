package cjavaioexam2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BinaryFileMultiConversioniCopy {
   public static void main(String[] args) {
	   
	  Scanner scan = new Scanner(System.in);
	  System.out.println("원본 파일명 입력해주세요: ");
	  String sourceFileName = scan.next();
	  System.out.println("복사본 파일명 입력해주세요: ");
	  String copyFileName = scan.next();
	  System.out.println("확장 사이즈를 입력하세요[5~30]");
	  int extendSize = scan.nextInt();
	   
//      if( args.length != 2) {
//         System.out.println("원본과 복사할 파일명2개가 필요합니다.");
//         System.out.println("프로그램 실행시 run configuration=> arguments탭에서 file명 2개를 입력해주세요.");
//         System.exit(1);
//      }
      FileInputStream fis =null;
      FileOutputStream fos = null;
      int[] writeData = new int[extendSize];
      // 읽어들인 자료를 저장할 배열 선언 1개의 자료를 읽어서 n배로 확장시킴
      Random rand = new Random();
      
     
      try {
         fis = new FileInputStream(sourceFileName);
         fos = new FileOutputStream(copyFileName);
         int readData ;
         while( (readData = fis.read() ) != -1) {
        	 for(int i = 0; i < writeData.length; i+=1) {
                 writeData[i] = (byte)rand.nextInt(255); 
                 //쓰레기 값으로 초기화함 => dump시 해석을 할 수 없도록
             }
        	int position = rand.nextInt(extendSize-2)+82; // 실제 자료가 저장될 위치(가중치 100)->80
        	 						//120을 줄 경우, rand.nextint(8)의 결과에 따라 127이 출력. 2를 더하면 128을 초과함. 첫자리가 1이 되므로 음수로 해석됨. recover 단계에서 오류발생
            writeData[0] = position; //첫번째 배열에는 실제 자료가 저장될 위치를 기억
            writeData[1] = rand.nextInt(4)+80; //연산값 
            writeData[position-80] = readData+(writeData[1]-80);
            for(int saveData : writeData) {
               fos.write(saveData);
            }
         }
      } catch (IOException e) {
         e.printStackTrace();
      }finally {
         if( fis != null) {try { fis.close();} catch (IOException e) {} }
         if( fos != null) {try { fos.close();} catch (IOException e) {} }
         
      }
   }
}