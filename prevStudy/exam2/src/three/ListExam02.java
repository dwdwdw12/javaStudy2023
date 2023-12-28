package three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class ListExam02 {
	public void listDataCreate(){
//		List<Object/*또는 데이터 타입(String, Integer ...)*/> list = new ArrayList<Object>(10);	
		//List list = new ArrayList();	//제네릭 <> 활용하기
		//가능하면 예상되는 자료의 개수를 초기 생성시 지정하는 것이 좋다. new ArrayList<Object>(개수). 
		//확정적인 개수가 아님. 추가가능
		
		List<Object> list = new Vector<Object>(10);	

		
		list.add("aa/aa");
		list.add(1250);
		list.add(true);		//서로 다른 종류의 자료 3개가 들어있다.
		list.add(10.2);
		
		System.out.println("list에 저장된 자료의 개수: " + list.size());	//length가 아니라 size 사용
		System.out.println("list에 기본적으로 저장할 수 있는 자료의 개수: " + ((Vector)list).capacity());	//capacity() - vector에서만 사용가능, 형변환 필요
		((Vector)list).ensureCapacity(14);
		System.out.println("수정 후에 list에 기본적으로 저장할 수 있는 자료의 개수: " + ((Vector)list).capacity());
		
		System.out.println("============================================");
		
		//String outData = (String) list.get(0);	//object타입을 String 타입에 넣어야하기 때문에.
		String[] result = ((String)list.get(0)).split("/");	//되도록 같은 타입을 넣어야 조작이 편리함
		
		List<String> listString = new ArrayList<String>(5);		//자주 쓰는 형태들
		//List<EmployeeVO> listvo = new ArrayList<EmployeeVO>();
		listString.add("add1");
		listString.add("add2");
		listString.add("add3");
		listString.add("add4");
		listString.add("add5");
		
		//전체자료 꺼내서 출력해보기-1번째 방법. 가장 많이 사용하지만 비권장
		for(int i=0; i<listString.size(); i+=1) {
			System.out.println(listString.get(i));
		}
		
		System.out.println("===========================================");
		
		//전체자료 꺼내서 출력해보기-2번째 방법. 권장 => 서로 다른 자료의 구성에서도 동일하게 적용할 수 있는 방법
		Iterator<String> iter = listString.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());			//자료가 list가 아니라 set일 때도 적용가능
		}
		
		System.out.println("===========================================");	
		
		//전체자료 꺼내서 출력해보기-3번째 방법. 가장권장 => 서로 다른 자료의 구성에서도 동일하게 적용할 수 있는 방법, 가장 빠름, 최신
		//listString.forEach(data->System.out.println(data));
		listString.forEach(data->{System.out.println(data);});

		System.out.println("===========================================");	
		
		listString.forEach(new Consumer<String>() {	//람다식 표현 이전의 상태

			@Override
			public void accept(String t) {		//생성자~메서드명까지 삭제. 타입명도 삭제
				System.out.println(t);			//화살표로 body를 연결. 후에 다듬기 
			}
		});

		System.out.println("----------------------");
		Iterator<String> iter2 = listString.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter.next()+"입니다");			//데이터에 문자열을 추가하고 싶을 때
		}
		System.out.println("----------------------");
		listString.forEach(data->{System.out.println(data+"입니다");});	//데이터에 문자열을 추가하고 싶을 때

		
	}
	
	
}
