package practice2;

import java.util.Arrays;

public class Minimums {
	
	public static void main(String[] args) {
		
		System.out.println(min4(-5, 24, 1111, -6));
		
		System.out.println(min4(1, 2, 30, 40));
		
		System.out.println(min4(-5, -20, -200, 3));
		
	}
	
	public static int min4(int num1, int num2, int num3, int num4) {
		
		int[] intArr = {num1, num2, num3, num4};
		Arrays.sort(intArr);
		
		return intArr[0];
	}
}

