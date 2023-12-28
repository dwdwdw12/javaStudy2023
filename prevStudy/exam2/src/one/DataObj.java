package one;

import java.util.Objects;

public class DataObj {
	int data1 = 200;
	char data2 = 'A';
	
	@Override			//hashcode() 지우면서 비교해보기
	public int hashCode() {
		return Objects.hash(data1, data2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataObj other = (DataObj) obj;
		return data1 == other.data1 && data2 == other.data2;
	}
}
//지역변수(k,j) -> stack 영역 -> 주소를 저장
//Dataobj() -> heap 영역. 두 DataObj()는 다른 주소에 저장됨.
// k = new DataObj();
// j = new DataObj();

//값의 비교
// == : local 변수의 내용만 비교.
