package cjavaioexam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BinaryFileMultiConversioniRecoveryCopy {
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("원본 파일명 입력해주세요: ");	//넘겨받은 파일
	   String sourceFileName = scan.next();
	   System.out.println("복원 파일명 입력해주세요: ");
	   String recoverFileName = scan.next();
	   System.out.println("확장 사이즈를 입력하세요[5~30]");
	   int extendSize = scan.nextInt();
//      if( args.length != 2) {
//         System.out.println("원본과 복사할 파일명2개가 필요합니다.");
//         System.out.println("프로그램 실행시 run configuration=> arguments탭에서 file명 2개를 입력해주세요.");
//         System.exit(1);
//      }
      FileInputStream fis =null;
      FileOutputStream fos = null;
      byte[] readData = new byte[extendSize];
      
      
      try {
         fis = new FileInputStream(sourceFileName);
         fos = new FileOutputStream(recoverFileName);
         int readCount ;
         while( (readCount = fis.read(readData) ) != -1) {
            int recoverData = readData[readData[0]-80]-(readData[1]-80);
            fos.write(recoverData);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }finally {
         if( fis != null) {try { fis.close();} catch (IOException e) {} }
         if( fos != null) {try { fos.close();} catch (IOException e) {} }
         
      }
   }
}