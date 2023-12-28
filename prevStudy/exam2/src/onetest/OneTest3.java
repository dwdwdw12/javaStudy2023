package onetest;

import org.junit.Test;

import one.PackageExam;
import one.SingletonExam;


public class OneTest3 {
	

	@Test
	public void packageExamTest() {	//접근지정자 package 일 때 사용불가.
		PackageExam obj = new PackageExam();
	
		System.out.println(obj.data2);	//public int
		//System.out.println(obj.data1); //int ->불가 
		
		//System.out.println(obj.data3);	//protected int ->불가
		//System.out.println(obj.data4);	//private int->불가
		System.out.println(obj.getData4());	
	}
	
	@Test
	public void singletonExamTest() {	
//		SingletonExam obj = new SingletonExam();	
		//생성자가 private로 되어있기 때문에 new 생성자 사용불가
		
	//SingletonExam 접근한정자->public일 때	
//		SingletonExam obj = SingletonExam.instance;	
		//SingletonExam 내부의 접근한정자가 public일때(private가 아니라)
		//int myVal = SingletonExam.data;	//생성이 필요
//		int myVal = (new SingletonExam()).data;
		
	//SingletonExam 접근한정자->private일 때	
		SingletonExam obj = SingletonExam.getInstance();
		int myVal = SingletonExam.getInstance().data;
	
		System.out.println();	
		
	}
}
