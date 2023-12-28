package two;

public class Circle extends Calcu {

	@Override
	public double area(double... data) {
		return data[0]*data[0]*Math.PI;
	}

}
