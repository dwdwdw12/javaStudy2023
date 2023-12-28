package ajavalang;

import java.util.*;

public class SystemExam {

	public static void main(String[] args) {
		System.out.println("-------------");
//		System.exit(1); //비정상적인 종료일 때 1을 사용, 0은 정상적인 종료일 때 
//		System.out.println("-------------");
		
/*		Map<String, String> systemEnv = System.getenv();	//OS와 관련된 정보	//환경변수의 값을 구함  //cmd>path
		Set<String> systemEnvironVarSet = systemEnv.keySet();
		Iterator<String> iter = systemEnvironVarSet.iterator();
		while(iter.hasNext()) {
			String mapKey = iter.next();
			System.out.println("환경변수: " + mapKey + " =설정값=> " + systemEnv.get(mapKey));
		}
*/		
		System.out.println(System.getenv("Path"));
		System.out.println("-------------");

		Properties property = System.getProperties();		//JVM에 설정된 속성 및 값을 얻고자 할 때
		Enumeration enumstr = property.propertyNames();		//iterator와 비슷
		while(enumstr.hasMoreElements()) {					//메서드명 차이
			String pN = (String) enumstr.nextElement();
			System.out.println(pN + " : " + property.getProperty(pN));
		}
		
		System.out.println("-------------");
		
		System.out.println("현재 동작하는 자바 버전: " + System.getProperty("java.version"));	//jvm에 설정된 버전
	}

}
