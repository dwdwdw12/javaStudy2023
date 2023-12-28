package three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ListExam03 {
	
	public void listArray(){
		//List를 사용하는 이유는 가변적인 자료 배열
		//=>DB에 저장된 자료를 조회했을 때 조회된 결과의 개수를 알 수 없다 => 배열을 사용하지 않고 List를 사용
		//=>개수를 알 수 있다면 => 배열을 사용해도 된다 => 배열이 성능면에서 우수하다.
		
		// ex)서울에 있는 사람들의 명단 조회 => select * from 대한민국사람명단테이블 where address='서울'
		//서울에 있는 사람들의 인원수(k) => select count(*) from (select * from 대한민국사람명단테이블 where address='서울')
		//PersonVO[] arrPerson = new PersonVO[k];	//list에 집어넣은 것보다 배열이 더 빠를 수도 있음...
	}
	
	public void listMultiImpl() {
		List<String> listArray = new ArrayList<String>();	//순서대로 연속된 공간에 저장, 자료의 재구성이 이루어짐.
		listArray.add("qwer");
		listArray.add("aaaa");	//2000개로 가정할 경우. 성능 우수.
		listArray.add(0, "asdf");	//중간에 자료를 삽입했을 때 => 성능이 떨어짐
		
		List<String> listLinked = new LinkedList<String>();
		listLinked.add("qwer");
		listLinked.add("aaaa");	//2000개로 가정할 경우. 성능은 떨어진다(조회성능).
		listLinked.add(0, "asdf");	//중간에 자료를 삽입했을 때 => 성능이 우수함
		
//		System.out.println("ArrayList get => " + listArray.get(1));
//		System.out.println("LinkedList get => " + listLinked.get(1));
		
//		System.out.println("==============================");
//		Iterator<String> iterator = listArray.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		System.out.println("==============================");
//		listLinked.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}});
//		listLinked.forEach((String t)->{System.out.println(t);});		//아래로 이관

		listPrint(listArray, "listArray");
		listPrint(listLinked, "Linkedlist");
	}
	
	public void listPrint(List<String> list, String prnData) {
		System.out.printf("=====%s=====\n", prnData);
		list.forEach((String t)->{System.out.println(t);});

	}
	
}
