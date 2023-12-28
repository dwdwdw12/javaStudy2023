package two.inter;

public interface InterExam01Sub extends InterExam01 {	//같은 interface끼리 상속 가능
	//public abstract void printName(String iname); <= 부모로부터 물려받은 추상메서드
	void printAddr(String addr);	//시그니쳐만 표시, public abstract void printAddr(String addr);
}
