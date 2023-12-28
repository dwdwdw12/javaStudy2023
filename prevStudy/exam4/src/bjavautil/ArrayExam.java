package bjavautil;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class ArrayExam {
	public static void main(String[] args) {
		String[] sourceArr = "aa bb cc dd".split(" ");
		
//		System.out.println(sourceArr.toString());	
		System.out.println(Arrays.toString(sourceArr));
		
		String[] copyArr = Arrays.copyOf(sourceArr, sourceArr.length);	//어디까지 복사할 것인지
		//String[] copyArr = Arrays.copyOf(sourceArr, 3);	//aa bb cc만 복사

		System.out.println("==============================");
		
		sourceArr[0] = "qq";
		System.out.println(Arrays.toString(sourceArr));
		System.out.println(Arrays.toString(copyArr));
		
		String[] cpyArrRange = Arrays.copyOfRange(sourceArr, 1, 4);	 //bb cc dd 복사
		System.out.println(Arrays.toString(cpyArrRange));
		
		System.out.println("==============================");
		
		sourceArr = "qq ss ee ff gg".split(" ");
		System.out.println(Arrays.toString(sourceArr));
		Arrays.sort(sourceArr);								//quick sort 방식의 알고리즘을 적용하여 정렬한다. 기준점을 둔 뒤에 기준점 앞뒤로 작은 수, 큰 수를 보냄.
		System.out.println(Arrays.toString(sourceArr));

		System.out.println("==============================");
		
		sourceArr = "qq ss ee ff gg".split(" ");
		System.out.println(Arrays.toString(sourceArr));
		System.out.println(Arrays.binarySearch(sourceArr, "ff"));	//숫자를 반환, 3	
		Arrays.sort(sourceArr);
		System.out.println(Arrays.binarySearch(sourceArr, "ff"));	//숫자를 반환, 1	//binarysearch=>정렬 이후에 탐색 속도가 빠름
		//원본을 유지하고 싶은 상태에서 Arrays 클래스의 검색을 하고 싶다면 
		//복사본을 만들어 정렬을 하고, 그 복사본에서 이진검색을 하는 것이 좋다.
		
		System.out.println("==============================");
		
		int[] inArr = new int[50];
		Arrays.fill(inArr, 50); //배열 안을 50으로 채우고 싶다.
		System.out.println(Arrays.toString(inArr));
		Arrays.fill(inArr, 1, 10, 30);	//index[1]부터 index[9]까지 30을 채움.
		System.out.println(Arrays.toString(inArr));
		
		System.out.println("==============================");
		int[][] aa = {{1,2,3},{4,5},{6}};
		int[][] bb = {{1,2,3},{4,5},{6}};
		System.out.println(Objects.deepEquals(aa, bb) + "	<=ObjectClass 깊은 equals");
		System.out.println(Arrays.deepEquals(aa, bb) + "	<=ArraysClass 깊은 equals");
		System.out.println(Arrays.equals(aa, bb) + "	<=ArraysClass 깊은 equals");
		
		System.out.println("==============================");
		int[][] aaa = {{1,2,3},{4,5},{6}};
		int[][] bbb = {{1,2,3},{4,5},{6}};
		int[] ccc = {1,2,3};
		int[] ddd = {1,2,3};
		System.out.println(Objects.deepEquals(aaa, bbb) + "	<=다차원 배열의 ObjectClass 깊은 equals");	//ObjectClass는 1,2차원 가리지 않음
		System.out.println(Objects.deepEquals(ccc, ddd) + "	<=1차원 배열의ObjectClass 깊은 equals");	
		System.out.println(Arrays.deepEquals(aaa, bbb) + "	<=다차원 배열의 ArraysClass 깊은 equals");	//2차원일때 deepEquals()
		System.out.println(Arrays.equals(aaa, bbb) + "	<=다차원 배열의 ArraysClass 얕은 equals");
		//System.out.println(Arrays.deepEquals(ccc, ddd) + "	<=1차원 배열의 ArraysClass 깊은 equals");	//1차원일때는 equals()사용
		System.out.println(Arrays.equals(ccc, ddd) + "	<=1차원 배열의 ArraysClass 얕은 equals");
		
		System.out.println("==============================");
		System.out.println("내가 만든 equals 결과: " + myEquals(ccc,ddd));
		
		System.out.println("==============================");	
		String uniqueId = UUID.randomUUID().toString();	//값을 저장하기 위해 string을 붙여 타입을 맞춤
		System.out.println("전세계적으로 중복되지 않는 문자열 생성: "+UUID.randomUUID());	//절대 중복되지 않는 id를 만들어내고자 할 때.
		System.out.println("중복되지 않는 숫자 생성: "+System.nanoTime());
	}
	
	public static boolean myEquals(int[] arr1, int arr2[]){
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
