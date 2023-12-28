package com.dongwoo.insa;

import java.util.Objects;

public class EmployeeVO {
	private int empNo;     
	private String empName;   
	private String gender;
	private String birth;
	private String phoneNo;
	private String email;
	private String address;
	private String hiredate;
	private String empdep;
	private String emppos;
	private long empsal;		//11개
	
	public EmployeeVO() {
		super();
	}

	public EmployeeVO(String empName, String gender, String birth, String phoneNo, String email, String address) {
		super();		//필수입력사항만 만들기
		this.empName = empName;
		this.gender = gender;
		this.birth = birth;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getEmpdep() {
		return empdep;
	}

	public void setEmpdep(String empdep) {
		this.empdep = empdep;
	}

	public String getEmppos() {
		return emppos;
	}

	public void setEmppos(String emppos) {
		this.emppos = emppos;
	}

	public long getEmpsal() {
		return empsal;
	}

	public void setEmpsal(long empsal) {
		this.empsal = empsal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, birth, email, empName, empNo, empdep, emppos, empsal, gender, hiredate, phoneNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVO other = (EmployeeVO) obj;
		return Objects.equals(address, other.address) && Objects.equals(birth, other.birth)
				&& Objects.equals(email, other.email) && Objects.equals(empName, other.empName) && empNo == other.empNo
				&& Objects.equals(empdep, other.empdep) && Objects.equals(emppos, other.emppos)
				&& empsal == other.empsal && Objects.equals(gender, other.gender)
				&& Objects.equals(hiredate, other.hiredate) && Objects.equals(phoneNo, other.phoneNo);
	}

//	@Override
//	public String toString() {	//문자열안의 내용을 수정할 수 있음, 가독성 좋게.
//		return "EmployeeVO [empNo=" + empNo + ", empName=" + empName + ", gender=" + gender + ", birth=" + birth
//				+ ", phoneNo=" + phoneNo + ", email=" + email + ", address=" + address + ", hiredate=" + hiredate
//				+ ", empdep=" + empdep + ", emppos=" + emppos + ", empsal=" + empsal + "]";
//	}
	
	@Override
	public String toString() {	//test 실행해서 콘솔창 확인해보기.
		return "사번=" + empNo + ", 이름=" + empName + ", 성별=" + gender + ", 생년월일=" + birth
				+ ", 전화번호=" + phoneNo + ", 이메일=" + email + ", 주소=" + address + ", 입사일=" + hiredate
				+ ", 부서=" + empdep + ", 직위=" + emppos + ", 연봉=" + empsal ;
	}
	
	
	
}
