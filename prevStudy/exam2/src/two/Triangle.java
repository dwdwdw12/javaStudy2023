package two;

public class Triangle extends Calcu {
	
	@Override
	public double area(double... data) {
		return data[0]*data[1]*0.5;
	}
	
}
