package test;

import org.junit.Test;

import exam1.First12;
import exam1.MemberVO;

public class ExamExecute {
	
	@Test
	public void first12Exec() {
		exam1.MemberVO first12 = new MemberVO();
		String rtnVal = first12.toString();		//Object class의 toString: 해당 클래스의 기본적인 정보를 표시
								//toString()의 위치 확인하기(어디서 가져오는지, 재정의되는지) 
		//System.out.println("되돌려 받는 결과: " + rtnVal); 	//println은 하나의 데이터만 출력가능
		//되돌려 받는 결과: exam1.First12@1ed6388a	//위치@메모리상에 만들어진 주소(16진수)
		System.out.println("되돌려 받는 결과: " + first12);
	}
}
