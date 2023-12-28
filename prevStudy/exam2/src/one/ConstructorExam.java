package one;

public class ConstructorExam {
	public int intField;
	public double doubleField;
	boolean booleanField;
	char charField;
	
	
	
	public ConstructorExam() {
		this(20,500);		//생성자가 호출되지 않으면 기본값으로 20과 500을 주겠다.
//		securityCheck();		//객체가 생성되자마자 실행시키고 싶은 메서드/기능이 있을 경우
	}

	public  ConstructorExam(int intField, double doubleField) {
		super();
		this.intField=intField;
		this.doubleField=doubleField;
		securityCheck();
	}
	
	public ConstructorExam(int intField, double doubleField, boolean booleanField, char charField) {
//		super();
//		this.intField=intField;
//		this.doubleField=doubleField;
		this(intField,doubleField);		//super 부를 필요 없음.
		this.booleanField=booleanField;
		this.charField=charField;		
		
	}
	
	public void printData() {
		System.out.println("intField = " + intField);			//초기값(기본값이 출력) 0
		System.out.println("doubleField = " + doubleField);		//0.0
		System.out.println("booleanField = " + booleanField);	//false
		System.out.println("charField = " + charField);			//'0', 아스키코드 0=>null	
	}
	
	public void securityCheck() {
		if(intField>100) {
			booleanField = true;
		}
	}
	
	
}
