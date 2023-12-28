package cjavaio;

import java.io.File;

public class FileExam00 {

	public static void main(String[] args) {
		
		System.out.println(File.pathSeparator);			//  ;
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);				//	\
		System.out.println(File.separatorChar);
		
		//"aaa\\bbb\\ccc\\aa.txt"	//윈도우용
		//"aaa" + File.separator + "bbb"+ File.separator+ "ccc" + File.separator + "aa.txt"	//정석
		//"aaa/bbb/ccc/aa.txt"		//어디서나 사용가능
		
	}

}
