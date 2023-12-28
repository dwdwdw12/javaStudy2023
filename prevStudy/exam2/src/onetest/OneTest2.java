package onetest;

import org.junit.Test;

import one.ConstructorExam;
import one.DataObj;
import one.DataObj2;
import one.PackageExam;


public class OneTest2 {
	
	@Test
	public void subMainTest() {
		ConstructorExam obj = new ConstructorExam(20, 200);
		obj.printData();
	}
	
	@Test
	public void DataObjTest() {
		DataObj k = new DataObj();
		DataObj j = new DataObj();
		
		System.out.println("k: " + k);	//주소값 16진수
		System.out.println("k.toString(): " + k.toString());	//주소값
		System.out.println("k.hashCode(): " + k.hashCode());	//주소값, 10진수
		System.out.println("j: " + j);
		System.out.println("j.toString(): " + j.toString());
		System.out.println("j.hashCode(): " + j.hashCode());
		System.out.println("------------------------------");
		System.out.println(k == j);	//stack영역의 값을 비교
		System.out.println("equals: "+ k.equals(j));	
		//generate hashcode and equals 필요. 
		//hashcord -> k와 j의 해시코드도 같은 값으로 바꿔줌
		//equals -> equals() 동작 가능
		//없으면 false 출력

	}
	
	@Test
	public void DataObjTest2() {
		DataObj2 k = new DataObj2();
		k.data2 = 'b';
		DataObj2 j = new DataObj2();
		j.data2 = 'z';
		System.out.println("k: " + k);	//주소값 16진수
		System.out.println("k.toString(): " + k.toString());	//주소값
		System.out.println("k.hashCode(): " + k.hashCode());	//주소값, 10진수
		System.out.println("j: " + j);
		System.out.println("j.toString(): " + j.toString());
		System.out.println("j.hashCode(): " + j.hashCode());
		System.out.println("------------------------------");
		System.out.println(k == j);	
		System.out.println("equals: "+ k.equals(j));	
		//true 출력. data1에만 hashcode equals를 적용했기 때문에, data1만 비교
		//data2가 달라져도, 일치여부에는 영향을 미치지 않음.
		
	}
	
	@Test
	public void StringEquals() {
		String aaa = "dongwoo";
		String bbb = "dongwoo";
		System.out.println(aaa==bbb);	//true
		System.out.println(aaa.equals(bbb));	//true
		System.out.println("------------------------------");
		
		String ccc = new String("dongwoo");
		String ddd = new String("dongwoo");
		System.out.println(ccc==ddd);	//false	
		//stack 영역의 위치가 같은지 비교. new 생성자에 의해 heap 영역의 다른 주소에 자료 저장.
		//각 자료는 String area의 dongwoo에 해당하는 (같은)주소를 저장
		//자료에 포함된 주소는 같지만, stack 영역의 주소가 다르므로 같지 않다고 판단.
		System.out.println(ccc.equals(ddd));	//true	문자열이 같은지 비교
	}
	
	@Test
	public void packageExamTest() {	//사용불가, 접근지정자 package.
		PackageExam obj = new PackageExam();
	}
}
