package two.inter;

public class InterExam01SubImpl01 implements InterExam01Sub {

	@Override
	public void printName(String iname) {
		System.out.println(iname + "님 반가워요");
		
	}

	@Override
	public void printAddr(String addr) {
		System.out.println("주소정보: "+addr);
		
	}
	
}
