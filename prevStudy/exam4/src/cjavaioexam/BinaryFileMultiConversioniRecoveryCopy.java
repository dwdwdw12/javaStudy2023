package cjavaioexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class BinaryFileMultiConversioniRecoveryCopy {
   public static void main(String[] args) {
      if( args.length != 2) {
         System.out.println("원본과 복사할 파일명2개가 필요합니다.");
         System.out.println("프로그램 실행시 run configuration=> arguments탭에서 file명 2개를 입력해주세요.");
         System.exit(1);
      }
      FileInputStream fis =null;
      FileOutputStream fos = null;
      byte[] readData = new byte[10];
      
      
      try {
         fis = new FileInputStream(args[0]);
         fos = new FileOutputStream(args[1]);
         int readCount ;
         while( (readCount = fis.read(readData) ) != -1) {
            int recoverData = readData[readData[0]]-readData[1];
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