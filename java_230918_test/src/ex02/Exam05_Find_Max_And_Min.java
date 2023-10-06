package ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exam05_Find_Max_And_Min {
	public static void main(String[] args) {
		//최대값, 최소값
		int a = 3;
		int b = 4;
		int c = 5;
				
		if(a>=b&&a>=c) {
			System.out.println("최대값은 a입니다.");
		} else if(b>=a&&b>=c) {
			System.out.println("최대값은 b입니다.");
		} else if(c>=a&&c>=b) {
			System.out.println("최대값은 c입니다.");
		}
		
		if(a<=b&&a<=c) {
			System.out.println("최소값은 a입니다.");
		} else if(b<=a&&b<=c) {
			System.out.println("최소값은 b입니다.");
		} else if(c<=a&&c<=b) {
			System.out.println("최소값은 c입니다.");
		}

		////////////////////////////////////////////////////////////////
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력할 사람의 숫자 : ");
		int num = scan.nextInt();
		String clear = scan.nextLine();
		System.out.println();
		
		List<Integer> list = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<num;i++) {
			System.out.print("이름을 입력해 주세요 : ");
			String name = scan.nextLine();
			System.out.print("점수를 입력해 주세요 : ");
			int height = scan.nextInt();
			String clear2 = scan.nextLine();
			list.add(height);
			map.put(name, height);
		}
		System.out.println();
		
		list.sort(null);
		String max="", min="";
		
		for(String key : map.keySet()) {
		    if(map.get(key).equals(list.get(num-1))) { 
		      max = key;
		    }
		    if(map.get(key).equals(list.get(0))) { 
			  min = key;
			}
		}
		
		System.out.printf("점수가 가장 높은 사람은 %s입니다.\n", max);
		System.out.printf("점수가 가장 낮은 사람은 %s입니다.\n", min);
		
	}
}
