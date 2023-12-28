package three;

import java.util.ArrayList;
import java.util.List;
//java.lang.*의 경우 import를 하지 않고 사용한다. 다른 곳에 위치한 패키지는 반드시 import 

public class ListExam01 {
	public void listArr() {
		//List list = new ArrayList();	//가변배열 => 저장되는 자료는 객체타입니다. 기본타입은 객체타입으로 바뀌어서 저장
		List<Object> list = new ArrayList();
		list.add(1);
		list.add(5);		//javascript의 push와 비슷. 자료를 밀어넣음
		list.add(new Integer(10));
		list.add("가나다");	//타입이 달라도 저장 가능
		
		List<String> list2 = new ArrayList<String>();	//List<String>: 문자들만 넣도록 제한함
		list2.add("y");
		list2.add("z");
		
		System.out.println(list.get(0));	// 1 출력
		System.out.println(list2.get(1));	// z 출력
	}
}
