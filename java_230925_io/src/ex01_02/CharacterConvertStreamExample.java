package ex01_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	
	public static void main(String[] args) throws IOException {
		
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
		write(str);
		
		String data = read();
		System.out.println(data);
		
	}
	
	static void write(String str) throws IOException{
		OutputStream os = new FileOutputStream("c:/data/test5.txt");
		Writer writer = new OutputStreamWriter(os, "utf-8");	
	
		//os.write(str);	//문자열 입력 불가. byte[] 입력은 가능
		writer.write(str);
		writer.flush();
		writer.close();
		
	}
	
	static String read() throws IOException{
		InputStream is = new FileInputStream("c:/data/test5.txt");
		Reader reader = new InputStreamReader(is, "utf-8");		//utf-8 설정시, 1번에 3바이트씩 읽음.
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		//String str = new String(data, 0, num);	//(배열, 시작위치, 길이)
		String str = new String(data, 20, num-20);	//(data, 20, num)이면 20번째 index에서 100자리를 출력하겠다는 의미. outofindex.
		//System.out.println(num);
		return str;
	}
	
}
