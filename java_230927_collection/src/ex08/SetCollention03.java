package ex08;

import java.util.*;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Car{ 
	private String model;
	private String color;
	@Override
	public String toString() {
		return model + " : " + color;
	}
	
	@Override
	public int hashCode() {
		return (model.hashCode()+color.hashCode())/2;	//hashCode 작성을 맡김
	}
	
	@Override
	public boolean equals(Object obj) {
		
		String strModel = ((Car)obj).model;
		String strColor = ((Car)obj).color;
		
//		if(model.equals(strModel)&&color.equals(strColor)) {
//			return true;
//		} else {
//			return false;
//		}
		
		boolean condition = model.equals(strModel)&&color.equals(strColor);
		return condition ? true : false;
	}
}

public class SetCollention03 {
	
	public static void main(String[] args) {
		
		Set<Car> set = new HashSet<Car>();
		
		set.add(new Car("소나타", "흰색"));
		set.add(new Car("그랜저", "검정"));
		set.add(new Car("소나타", "검정"));
		set.add(new Car("제네시스", "흰색"));
		set.add(new Car("제네시스", "검정"));
		set.add(new Car("소나타", "검정"));
		
		for(Car car : set) {
			System.out.println(car);
		}
		System.out.println("=========================");
		Iterator<Car> iterator = set.iterator();
		while(iterator.hasNext()) {
			//Car c = iterator.next();
			System.out.println(iterator.next());
		}
		
	}
	
}
