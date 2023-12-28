package cjavaioexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileReadDexaDump {
   public static void main(String[] args) {
      if( args.length != 1) {
         System.out.println("덤프할 파일명 입력해주세요...");
         System.out.println("프로그램 실행시 run configuration=> arguments탭에서 file명 1개를 입력해주세요.");
         System.exit(1);
      }
      FileInputStream fis =null;
      byte[] readData = new byte[10];
      
      
      try {
         fis = new FileInputStream(args[0]);
         int readCount ;
         while( (readCount = fis.read(readData) ) != -1) {
            for(byte aaa : readData) {
               System.out.printf("%X " , aaa);
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