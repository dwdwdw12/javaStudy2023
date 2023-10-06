package ex04;

import java.util.ArrayList;
import java.util.List;

public class Exam01_Sort {
	public static void main(String[] args) {
		
		//랜덤을 이용해서 5명 학생 점수를 입력받는다???
		//5명 점수 총점과 평균을 구한다.
		//최댓값, 최소값 구현
		//입력 데이터 오름차순 정렬
		int[] score = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100) + 1;
			System.out.print(score[i] + " ");
		}
		System.out.println();
		System.out.println("==========================================");
		
		int sum=0;
		for (int i = 0; i < score.length; i++) {
			sum=sum+score[i];
		}
		double avg = (double)sum/score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		System.out.println("==========================================");
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<score.length;i++) {
			list.add(score[i]);
		}
		list.sort(null);
		
		System.out.println("최댓값 : "+list.get(score.length-1));
		System.out.println("최솟값 : "+list.get(0));
		System.out.println("==========================================");
		
		//시간 복잡도가 높음 쓰지 말기
		int maxx=0; int minx=0;
		for(int i = 0; i < score.length; i++) {
			int countMax = 0; int countMin =0;
			for(int j = 0; j < score.length; j++) {
				if(score[i]>=score[j]) {
					countMax+=1;
				}
				if(countMax==score.length) {
					maxx=score[i];
				}
				if(score[i]<=score[j]) {
					countMin+=1;
				}
				if(countMin==score.length) {
					minx=score[i];
				}
			}
		}
		
		System.out.println("최댓값 : " + maxx);
		System.out.println("최솟값 : " + minx);
		System.out.println("==========================================");
		
		int max=score[0]; int min=score[0];
		for(int i = 0; i < score.length; i++) {
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	
		System.out.println("==========================================");
		// 삽입 정렬
		int temp = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(score[i]<score[j]) {
					temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
		}
		for(int num : score) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("==========================================");
		
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < score.length; i++) {
			list2.add(score[i]);
		}
		list2.sort(null);
		for (int num : list2) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("==========================================");
		
		// 선택 정렬
		int temp2 = 0; 
		for (int i = 0; i < score.length; i++) {
			int min2 = score[i];
			for (int j = i; j < score.length; j++) {
				if (min2 > score[j]) {
					min2 = score[j];
				}
				temp2 = score[i];
				score[i] = min2;
				min2 = temp2;
			}
		}
		for (int num : score) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("==========================================");
		// 버블 정렬
		int temp3 = 0; 
		for (int i = 0; i < score.length; i++) {
			boolean flag = false;
			for (int j = 0; j < score.length-1; j++) {
				if (score[j] > score[j+1]) {
					temp3 = score[j];
					score[j] = score[j+1];
					score[j+1] = temp3;
					flag=true;
				}
			}
			System.out.print(i+1+"회전 : ");
			for (int j = 0; j < score.length; j++) {
				System.out.print(score[j]+ " ");
			}
			System.out.println();
			System.out.println(flag);
			if(!flag) break;
			
		}
		
		for (int num : score) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("==========================================");
	
	}
}
