package ex02;

import java.io.File;
import java.io.IOException;

public class Exception03 {
	
	public static void main(String[] args) throws IOException {		// JVM에 처리를 떠넘김.
		
		File file = new File("member.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
	}
}
