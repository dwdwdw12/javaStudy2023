package two.inter;

//하나의 프로젝트에서 사용되는 상수변수를 한 곳으로 모아서 정의해주면 유지보수가 쉽다.
//추상클래스 보다는 인터페이스 활용하기...

//순수 자바로 작성할 경우, 하나의 DAO클래스에서 사용되는 쿼리를 한 곳에 모아서 상수로 정의해두고 사용하면 유지보수가 쉽다. 
//인터페이스 안에 상수변수와 메서드(추상메서드)를 혼합해서 정의하는 것은 권장하지 않는다.
public interface InterExam {
	//int aaa;	//컴퓨터는 public static final을 추가함->초기화 필요
	//final static public int aaa = 500; 
	int aaa = 500;
	public void dataInfo();
}

/*	분리하는게 나음.
public interface InterExam {
	public void dataInfo();
}

public interface InterExamConst{
	int aaa = 500;
}

class MemberDAO{
	public int insert(MemberVO vo){
		String query = "insert ~~ 쿼리문";
		con = DB연결 생략;
		preparedStatement ps = con.preparedStatement(query);
		
	}
}
=================>아래와 같이 사용을 권장

interface MemberDAOQuery{
	String inquery = "insert ~~ 쿼리문";
	String upquery = "update ~~ 쿼리문";
	String delquery = "delete ~~ 쿼리문";
	String getuery = "select ~~ 쿼리문";

}
class MemberDAO{
	public int insert(MemberVO vo){
		con = DB연결 생략;
		preparedStatement ps = con.preparedStatement(MemberDAOQuery.inquery);
		===이하 생략
	}
}


*/
