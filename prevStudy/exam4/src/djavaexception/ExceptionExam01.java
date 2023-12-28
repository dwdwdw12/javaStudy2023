package djavaexception;

public class ExceptionExam01 {
	public static void main(String[] args) {
		System.out.println(aaa(3));
	}
	private static int aaa(int b) /*throws ArithmeticException*/{	//unchecked exception은 throws를 사용하지 않아도 됨.
		int a = 20;
		int result=0;
		try {
			return a/b;
		} catch (ArithmeticException e) {
			System.err.println("나누는 수가 잘못되었습니다.");	//System.out 대신 System.err 사용하기->exception의 발생 위치 등을 저장할 수 있음.
		} finally {			//리턴문보다 먼저 수행이 된다. 반드시 수행(익셉션이 발생하든, 발생하지 않든.) 
			System.out.println("finally");
		}
		
		
		return result;
	}
}
