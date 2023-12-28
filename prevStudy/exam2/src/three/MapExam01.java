package three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExam01 {
	public void mapCrud() {						  //키(key) 값(value)
		Map<Integer, String> mapData = new HashMap<Integer, String>();
		mapData.put(0, "aaa");	//키 값을 주면서 저장->리스트와 같아짐.
		System.out.println("맵에 저장된 자료의 개수: " + mapData.size());
		mapData.put(1, "bbb");
		mapData.put(2, "ccc");	//값은 같아도 되지만, 키가 중복되어서는 안됨
		mapData.put(2, "yyy");  //입력이 아닌 수정이 됨
		System.out.println("맵에 저장된 자료의 개수: " + mapData.size());
		System.out.println("key 2에 저장된 자료: " + mapData.get(2));
		
		System.out.println("==========================");
		
		Map<String, String> mapDataStr = new HashMap<String, String>();
		mapDataStr.put("이름", "홍길동");
		mapDataStr.put("주소", "수원");
		System.out.println(("key 이름에 저장된 자료") + mapData.get("이름"));
		//유능한 개발자는 키와 값을 각각의 자료로 활용할 수 있다.
		//맵으로 구성된 자료를 검색(조회)하는 용도로 키를 사용하는 것 뿐 아니라, 키를 하나의 자료구조로도 활용할 수 있다.	//키를 검색어와 같은 형식으로 활용할 수 있음.
	}
	
	public void mapAppl() {	//유사어, 다(Key) : 1(Value) => ex) 남자, 남성, 맨, 총각, 머스마... -> 남자를 지칭하는 유사어 	
		Map<String, String> map = new HashMap<String, String>();	//Map<MemberVO, String>이 오는 경우도 생각해보기
		map.put("남자", "남자");
		map.put("남성", "남자");
		map.put("맨", "남자");
		map.put("총각", "남자");
		map.put("머스마", "남자");
		
		System.out.println("검색어를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String searchWord = scan.next();
		String query = "select * from sanmpum where gender = " + map.get(searchWord);
		System.out.println(query);
	}
	
	public void mapAppl2() {	//유사어, 1(단일 데이터 타입) : 다(Collection) 
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> insaList = new ArrayList<String>();
		insaList.add("인사1");
		insaList.add("인사2");
		insaList.add("인사3");
		insaList.add("인사4");
		insaList.add("인사5");
		map.put("인사팀", insaList);
		
		List<String> sangsanList = new ArrayList<String>();
		sangsanList.add("생산1");
		sangsanList.add("생산2");
		sangsanList.add("생산3");
		map.put("생산팀", sangsanList);
		
		System.out.println("===인원수===");
//		Iterator<String> iter = map.keySet().iterator();	//keyset() - key의 구조를 set으로 나타냄
//		while(iter.hasNext()) {
//			String key = iter.next();	//인사팀, 생산팀. 두 가지의 키가 있음
//			List<String> teamList = map.get(key);
//			System.out.println(key+ "인원: " + teamList.size() + "명\n직원명단");
//			for(int i=0;i<teamList.size();i+=1) {
//				System.out.println(teamList.get(i));
//			}
//		}
		
		
		
//		map.keySet().iterator();			//향상된 for문
//		for(String key : map.keySet()) {
//			List<String> teamList = map.get(key);
//			System.out.println(key+ "인원: " + teamList.size() + "명\n직원명단");
//			for(int i=0;i<teamList.size();i+=1) {
//				System.out.println(teamList.get(i));
//			}
//		}
		
		
		for(Map.Entry<String, List<String>> element : map.entrySet()) {
			System.out.printf("%s부서의 인원수: %s명\n", element.getKey(), element.getValue().size());
			element.getValue().forEach(data->System.out.println(data)); 
			//System.out.println(element.getKey()/*키값*/+ element.getValue()/*저장된 자료 리스트*/);
		}
		
	}
}
