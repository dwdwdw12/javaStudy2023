package cjavaio;

import java.io.File;

public class MyDirName {

	public static void main(String[] args) {
		String fileName = "c:/";
//		String fileName = ".";
		File file = new File(fileName);	//폴더를 지정함
		//String[] fileList = file.list();
		File[] fileList = file.listFiles();
		
//		for(String fi: fileList) {	// : fileList에서 하나씩 꺼내서 String fi에 입력하겠다.
//			System.out.println(fi);
//		}
//		System.out.println("count: " + fileList.length);
		
		for(int i=0; i<fileList.length; i+=1) {
			//System.out.println(">>"+fileList[i].toString());
			//System.out.println(fileList[i].toString().substring(fileName.length())); 	 		//경로 확인 가능
			String fullName = fileList[i].toString();
			int pos = fullName.lastIndexOf(File.separator)+1;		// c//같은 경우도 있으니, 마지막 separator의 index를 찾음. "/" 대신 File.separator 사용하기
			System.out.println(fileList[i].toString().substring(pos));
		}	
	}

}
