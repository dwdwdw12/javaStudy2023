package three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExam01 {
	public void setCrud() {
		Set<String> setData = new HashSet<String>();
		setData.add("data1");
		System.out.println(setData.size());
		setData.add("data1");
		System.out.println(setData.size());		//중복된 데이터는 배제.
		
		//setData.get	get으로 가져올 수 없음
//		setData.forEach(data -> System.out.println(data));
//		Iterator<String> iter =  setData.iterator();
//		while(iter.hasNext()) System.out.println(iter.next());
	}
	
	public void setConvert() {
		//List 구조와 set구조 상호간의 변경
//		Set<String> setData = new HashSet<String>();
		List<String> list = new ArrayList<String>();
//		setdata.add("data1");
//		setdata.add("data2");
//		setdata.add("data3");
//		setdata.add("data2");	//중복의 정의: equals() 연산에서 true가 반환될 경우.
		
		list.add("data1");
		list.add("data2");
		list.add("data3");
		list.add("data2");
		
//		System.out.println("======================");
//		collectionPrint(setData);
//		List<String> list = new ArrayList<String>();
//		list.addAll(setData);	//collection 타입의 데이터를 list로 변환
//		
//		System.out.println("======================");
//		collectionPrint(list);
		
		System.out.println("-----------------------");
		collectionPrint(list);
		Set<String> setdata = new HashSet<String>();
		setdata.addAll(list);
		System.out.println("-----------------------");
		collectionPrint(setdata);
		System.out.println("-----------------------");
		
	}
	
	public void collectionPrint(Collection<String> data) {
		data.forEach(data1 -> System.out.println(data1));
	}
	
	public void arrayToListConvertor() {
		List<String> list = new ArrayList<String>();
		list = Arrays.asList("aa","bb","cc","dd","ee");	
		//Arrays.asList를 이용하여 생성된 리스트는 (데이터의) 변경이 불가능함.
//		list.add("ff");			//데이터 추가 불가
//		list.remove("ee");		//삭제도 불가
		collectionPrint(list);
		
		System.out.println("-----------------------");

		List<String> list2 = new ArrayList<String>();	//새로운 리스트에 옮겨담은 후 변경하는 방법
		list2.addAll(list);
		list2.add("ff");
		collectionPrint(list2);
	}
	
	public void setEqual(){
		Set<DataDef> setData = new HashSet<DataDef>();
		setData.add(new DataDef(10, "aaa"));
		setData.add(new DataDef(10, "aaa"));
		setData.add(new DataDef(10, "aaa"));		
		setData.add(new DataDef(10, "bbb"));	//hashcode() and equals()를 i에만 적용하면 i를 기준으로 equals를 판단
		//DataDef에서 hashcode() and equals()를 실행한 후, equals()에 의해 같은 값으로 판정됨.
		System.out.println(setData.size());	
	}
	
//	list.add(3)	이렇게 사용하지만,
//	=>list.add(new Integer(3)) 실제로는 객체를 생성.
}
