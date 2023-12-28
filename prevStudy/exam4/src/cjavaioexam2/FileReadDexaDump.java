package cjavaioexam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileReadDexaDump {
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("덤프할 파일명 입력해주세요: ");
	   String dumpFileName = scan.next();
	   System.out.println("1라인에 덤프할 바이트의 개수를 입력하세요");
	   int dumpCount = scan.nextInt();
//      if( args.length != 1) {
//         System.out.println("덤프할 파일명 입력해주세요...");
//         System.out.println("프로그램 실행시 run configuration=> arguments탭에서 file명 1개를 입력해주세요.");
//         System.exit(1);
//      }
      FileInputStream fis =null;
      byte[] readData = new byte[dumpCount];
      
      
      try {
         fis = new FileInputStream(dumpFileName);
         int readCount ;
         while( (readCount = fis.read(readData) ) != -1) {
            for(byte aaa : readData) {
               System.out.printf("%02X " , aaa);
            }
            System.out.println();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }finally {
         if( fis != null) {try { fis.close();} catch (IOException e) {} }
         
      }
   }
}