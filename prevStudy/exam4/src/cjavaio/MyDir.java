package cjavaio;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDir {

	public static void main(String[] args) {
		String fileName = "c:/";
		File file = new File(fileName);	//폴더를 지정함
		
		if(file.isFile()) {	//조기 종료, 조기 리턴  - 메서드, 반복문에서 실행 이전에 실행여부를 결정함. 성능에 중요한 영향
			System.out.println("지정한 파일 정보가 디렉터리가 아닙니다.");
			System.exit(1);
		}
		
		File[] fileList = file.listFiles();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd aa HH:mm");	
		int fileCount = 0;
		int dirCount = 0;
		long totalFileSize = 0;
		
		for(int i=0; i<fileList.length; i+=1) {
			Date fileLastModifiedDate = new Date(fileList[i].lastModified());
			String strNowDate = simpleDateFormat.format(fileLastModifiedDate);
			String dirFileName = fileList[i].getName();
			
			if(fileList[i].isDirectory()) {		//(디렉토리=폴더)일 경우
				dirCount+=1;
				System.out.printf("%s    %-15s %s%n",strNowDate, "<dir>", dirFileName);	// %-15s 빈공간 15자리를 확보한 후 맨 앞에(-) 채우기
			} else {				//파일일 경우
				fileCount++;
				long fileSize = fileList[i].length();
				totalFileSize = totalFileSize + fileSize;
				System.out.printf("%s    %,15d %s\n",strNowDate, fileSize,dirFileName);
			}
		}	
		System.out.printf("\t\t %d개 파일 %,17d 바이트\n", fileCount, totalFileSize);			//%,d 중간에 comma 삽입
		System.out.printf("\t\t%d개 디렉터리 %,15d 바이트 남음\n", dirCount, file.getFreeSpace());
//		System.out.printf("file 전체 사이즈: %s\n", totalFileSize);
//		System.out.println("남은 공간: "+ file.getFreeSpace());
		
	}

}
