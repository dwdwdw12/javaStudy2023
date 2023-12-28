package kr.co.dongwoo.member.vo;

import java.util.Objects;

public class MembersldwVO {
	//필드의 선언 => 오라클 DB의 테이블에 컬럼들을 자바에 맞게 선언
	private String memId;   
	private String memPwd;   
	private String address;      
	private String regiDate;	//또는 date import
	
	//기본 생성자를 만든다.=>생성자 메서드는 반환 타입이 없다. generate constructor from superclass
	public MembersldwVO() {		//클래스 이름과 같음
//		super();	//아무것도 없어야 함. super(); 또는 this(); 포함가능(자동으로 생성). 
	}

	//데이터 초기화 생성자를 만든다(optional) generate constructor using field
	public MembersldwVO(String memId, String memPwd, String address) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.address = address;
	}
	
	//getter, setter 메서드를 만든다. => 필드의 데이터를 저장(setter)하거나 가져가는(getter) 메서드를 만든다.(private)
	//get 필드명, set 필드명
	//generate getters and setters
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegiDate() {
		return regiDate;
	}

	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}
	
	//hashCord, equals 메서드: 자료가 같은지를 비교할 때 사용하는 용도 <= option(준필수)
	//generate hashCord() and equals()
	@Override
	public int hashCode() {
		return Objects.hash(address, memId, memPwd, regiDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MembersldwVO other = (MembersldwVO) obj;
		return Objects.equals(address, other.address) && Objects.equals(memId, other.memId)
				&& Objects.equals(memPwd, other.memPwd) && Objects.equals(regiDate, other.regiDate);
	}
	//필드에 저장된 자료를 문자열로 출력하기 위해 정의하는 메서드(option <= 준필수)
	//generate toString()
	@Override
	public String toString() {
		return "MembersldwVO [memId=" + memId + ", memPwd=" + memPwd + ", address=" + address + ", regiDate=" + regiDate
				+ "]";
	}

    
}
