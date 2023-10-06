package ex08;

import java.util.Objects;
import java.util.Scanner;

public class Exam01 {
	static String myStr5 = new String("java");
	static String myStr6 = new String("java");
	

	@Override
	public int hashCode() {
		return Objects.hash(myStr5, myStr6);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam01 other = (Exam01) obj;
		return Objects.equals(myStr5, other.myStr5) && Objects.equals(myStr6, other.myStr6);
	}
	public static void main(String[] args) {

		String myStr1 = "java";
		String myStr2 = "java";
		System.out.println(myStr1==myStr2);
		
		String myStr3 = new String("java");
		String myStr4 = new String("java");
		System.out.println(myStr3==myStr4);	//equals 사용하기
		
		System.out.println(myStr5==myStr6);
	}
}
