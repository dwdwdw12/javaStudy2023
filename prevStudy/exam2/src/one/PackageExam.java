package one;

//class PackageExam {	//default modifier
//					//이 클래스는 같은 패키지 안에서만 사용할 수 있음.
//}

//접근지정자, 접근한정자, 접근수정자(modifier) 
//=> public, protected, package(default, friendly), private
//클래스에는 public, package 접근 지정자만 사용 가능
//필드, 메서드는 4개의 접근지정자 모두 사용 가능

//public: 누구나 
//package: 같은 폴더 안에서,
//protected: 같은 폴더(패키지)안에서. 다른 폴더에서는 상속들 받아서 사용할 수 있다.
//private: 같은  클래스 안에서만 사용 가능=>상속도 되지 않는다.

public class PackageExam {
	int data1 = 200;	//default
	public int data2 = 300;	//직접 읽고 쓰는 것이 가능
	protected int data3 = 400;
	private int data4 = 500;	
	private int data5 = 600;
	//다른 클래스에서는 오직 값을 가져가는 것만 가능하다.->readOnly
	
//	public int getData4() {
//		if(권한 체크) {
//			return data3;
//		}
//		return 0;
//	}
	
	public int getData4() {	//public이라 다른 곳에서 메서드에 접근 가능
		return data4;
	}
	
	public int getData5() {	//getter and setter로 값에 접근 가능
		return data5;
	}

	public void setData5(int data5) {
		this.data5 = data5;
	}
	
	
}