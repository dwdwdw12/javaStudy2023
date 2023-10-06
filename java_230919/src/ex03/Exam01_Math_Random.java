package ex03;

import java.util.ArrayList;
import java.util.List;

public class Exam01_Math_Random {
	public static void main(String[] args) {

		int[] myArr = new int[5];
		
		for(int i=0; i<myArr.length; i++) {
			myArr[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i=0; i<myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		
		List<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[45];
		int len = 10000000;
		int k=0;
		for(int i=0; i<len; i++) {
			k=(int)(Math.random()*45);
			arr[k]++;
		}
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		list.sort(null);
		System.out.println("max : "+(double)list.get(arr.length-1)/len*100);
		System.out.println("min : "+(double)list.get(0)/len*100);
	}
	
}
