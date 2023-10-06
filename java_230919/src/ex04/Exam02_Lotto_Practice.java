package ex04;

import java.util.Arrays;
import java.util.List;

public class Exam02_Lotto_Practice {
	public static void main(String[] args) {
        //0-45 중복x 숫자 랜덤
        int number = 30;
        int[] arr = new int[number];
		arr[0] = (int) (Math.random() * 45) + 1;
		int k = 0;
		while (arr[number - 1] == 0) {
			for (int i = 1; i < arr.length; i++) {
				while (true) {
					k = (int) (Math.random() * 45) + 1;
					int count = 0;
					for (int j = 0; j < i; j++) {
						if (k != arr[j]) {
							count++;
						}
					}
					if (count == i) {
						arr[i] = k;
						break;
					} 
				}
			}
		}
		//Arrays.sort(arr);
		
		for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
