package cjavaio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("aaa.txt");
		fw.write("ddd");
		fw.close();
	}
}
