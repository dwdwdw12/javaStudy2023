package two;

public abstract class AbstExam03 {
	public void inamePrint(String irum) {
		System.out.println(irum + "님\n 반갑습니다.");
	}
//	public abstract void stringPrint(String[] str, String name);
	public abstract void stringPrint(String[] str);

//	public abstract void intPrint(int ... intData, String irum);
//	public abstract void intPrint(String irum, int ... intData);	
										//...은 항상 뒤로 가야함(문법)
	public abstract void intPrint(int ... intData);
}
