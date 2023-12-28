package two;

public class Rectangle extends Calcu {

	@Override
	public double area(double... data) {
		return data[0]*data[1];
	}

}
