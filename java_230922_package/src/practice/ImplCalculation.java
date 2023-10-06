package practice;

public class ImplCalculation implements Calculation{

	@Override
	public void sum(Student student) {
		int sum = student.getKor() + student.getEng() + student.getMath();
		student.setSum(sum);
	}

	@Override
	public void avg(Student student) {
		double avg = student.getSum()/3.0;
		student.setAvg(avg);
	}

	@Override
	public void calResult(Student student) {
		sum(student);
		avg(student);
		System.out.printf("학생의 정보 : 이름 = %s, 나이 = %d, 총점 = %d, 평균 = %.2f\n", student.getName(), student.getAge(), student.getSum(), student.getAvg());
	}

}
