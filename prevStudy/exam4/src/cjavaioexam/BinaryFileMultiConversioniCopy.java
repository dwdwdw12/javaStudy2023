package cjavaioexam;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class BinaryFileMultiConversioniCopy {
   public static void main(String[] args) {
      if( args.length != 2) {
         System.out.println("원본과 복사할 파일명2개가 필요합니다.");
         System.out.println("프로그램 실행시 run configuration=> arguments탭에서 file명 2개를 입력해주세요.");
         System.exit(1);
      }
      FileInputStream fis =null;
      FileOutputStream fos = null;
      int[] writeData = new int[10];
      // 읽어들인 자료를 저장할 배열 선언 1개의 자료를 읽어서 10배로 확장시킴
      Random rand = new Random();
      for(int i = 0; i < writeData.length; i+=1) {
         writeData[i] = (byte)rand.nextInt(255); 
         //쓰레기 값으로 초기화함 => dump시해석을 할 수 없도록
      }
      int position = rand.nextInt(8)+2; // 실제 자료가 저장될 위치
      writeData[0] = position; //첫번째 배열에는 실제 자료가 저장될 위치를 기억
      writeData[1] = rand.nextInt(4); //연산값 
      try {
         fis = new FileInputStream(args[0]);
         fos = new FileOutputStream(args[1]);
         int readData ;
         while( (readData = fis.read() ) != -1) {
            writeData[position] = readData+writeData[1];
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