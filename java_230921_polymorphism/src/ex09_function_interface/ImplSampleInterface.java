package ex09_function_interface;

public class ImplSampleInterface implements SampleInterface{

	@Override
	public void sample() {
		System.out.println("무조건 구현");
	}
	
	public void sample4() {
		System.out.println("선택적으로 구현");
	}
	
}
