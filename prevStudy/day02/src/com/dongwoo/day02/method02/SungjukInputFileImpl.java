package com.dongwoo.day02.method02;

import java.io.FileReader;
import java.io.IOException;

public class SungjukInputFileImpl implements SungjukInput {

	@Override
	public SungjukVO dataInput() {
		SungjukVO vo = new SungjukVO();
		FileReader reader;
		try {
		 	reader = new FileReader("src\\SungjukData.txt");	//파일 위치 확인하기.
			String readStr="";
			int ch;
			while((ch=reader.read())!=-1) {
				readStr = readStr + (char)ch;
			}
			String[] studentData = readStr.split(",");	//<-데이터 사이에 공백이 있는지 확인하기
			vo.setHakbun(studentData[0]);
			vo.setIrum(studentData[1]);
			vo.setKor(Integer.parseInt(studentData[2]));
			vo.setEng(Integer.parseInt(studentData[3]));
			vo.setMat(Integer.parseInt(studentData[4]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return vo;
	}

}
