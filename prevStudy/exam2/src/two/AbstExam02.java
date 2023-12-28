package two;

public abstract class AbstExam02 {
	//abstract int defaultData;		//필드에는 abstract 붙일 수 없음
	int defaultData;
	public abstract void abstMethod();	//어떤 클래스가 추상메서드를 가지고 있으면 추상클래스로 변환해야 함
//	public void abstMethod() {}	
	//new 사용 불가
}

class AbstExam02Use{
	public void use() {
		//AbstExam02 obj = new AbstExam02();	//불가능. 추상메서드이므로
//		AbstExam02 obj = new AbstExam02() {
//			
//			@Override
//			public void abstMethod() {		//override가 강제됨
//				System.out.println("추상메서드의 내용을 구현함");
//			}
//		};
//		
//		obj.abstMethod();
		
	}
}

