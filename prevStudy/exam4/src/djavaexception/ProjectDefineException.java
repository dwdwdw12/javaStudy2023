package djavaexception;

public class ProjectDefineException extends RuntimeException {
	public ProjectDefineException() {
		super();
		System.err.println("이 프로젝트에서 무엇인가 문제가 발생하였습니다.");
	}
	public ProjectDefineException(String message) {
		System.err.println(message);
		System.err.println("이 프로젝트에서 무엇인가 문제가 발생하였습니다.");
	}
}
