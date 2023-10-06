package ex14;

import java.util.*;

public class OtherExam2 {
	public static void main(String[] args) {
	
		int[] arr = {1,4,3,7,8,9,10,2,4};
		
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println("\n=========================");
		
		Arrays.sort(arr);
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println("\n=========================");
		
		String[] str = {"Box", "Toy", "Robot", "box", "robot"};
		Arrays.sort(str);	//기본형만 정렬 가능. 사용자 정의->재정의해야 함.
		for(String s : str)
			System.out.print(s + " ");	//아스키코드 값-오름차순 정렬.
										//대문자(65~)-소문자(97~)
		
	}
	
}
