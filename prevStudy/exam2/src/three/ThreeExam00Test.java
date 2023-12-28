package three;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import threetest.Imsi;

public class ThreeExam00Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		ThreeExam00 obj = new ThreeExam00();
		Class<ThreeExam00> classInfo = (Class<ThreeExam00>) obj.getClass();
		Method m[] = classInfo.getMethods();
		for(int i =0; i<m.length;i=i+1) {
			System.out.println(m[i].getName());
		}
		
		System.out.println("===String 클래스의 메서드 목록 보기===");	//리플렉션
		
		Class<String> claInfo = (Class<String>) new String().getClass();
//		Class claInfo = new String().getClass();
		m = claInfo.getMethods();
		for(int i =0; i<m.length; i=i+1) {
			System.out.println(m[i].getName());
		}
		
		System.out.println("===StringBuffer 클래스의 메서드 목록 보기===");
		Class<StringBuffer> claInfo2 =	(Class<StringBuffer>) Class.forName("java.lang.StringBuffer");
		m=claInfo2.getMethods();
		for(int i =0; i<m.length; i=i+1) {
			System.out.println(m[i].getName());
		}
		
		System.out.println("===특정한 메소드에 실행시키기===");
		ThreeExam00 threeExam = new ThreeExam00();
		String execMeString = "mea";	// 이 문자열을 가진 메서드 실행
		((ThreeExam00) threeExam).mea();
		Class clsobj = threeExam.getClass();
		Method mtho = clsobj.getDeclaredMethod(execMeString, null);	//매개변수가 없으므로 null, 특정한 메서드를 가져옴
		mtho.invoke(threeExam);	//호출된 메서드를 실행
		
		System.out.println("다른 방법");	//라이브러리를 만들어 사용하는 경우
		execMeString = "three";	//메서드 이름만 알아도 실행가능
		Imsi objectCreate = (Imsi) threetest.Imsi.class.newInstance();//클래스 이름으로 객체를 생성
		Class execClass = objectCreate.getClass();
		
		Method execMethod = execClass.getDeclaredMethod(execMeString, int.class);
//		System.out.println(execMethod);
		execMethod.invoke(objectCreate, 50);
	}
}
