package com.dongwoo.day02;

import java.util.Objects;

public class SungjukVO {
	private String hakbun;	//문자열 함수를 사용해 필터링 가능
	private String irum;
	private int kor;
	private int eng;
	private int mat;		//private: 접근한정자, 외부에서 접근하여 수정하지 못하도록
	
	private int tot;
	private double avg;	//실수 타입
	
	//source>generate constructors from superclass
	//source>generate constructors using fields		//입력받을 변수만 선택
	//generate getters and setters>select all
	//generate hashcode() and equals().
	//generate tostring()
	
	public SungjukVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SungjukVO(String hakbun, String irum, int kor, int eng, int mat) {
		super();
		this.hakbun = hakbun;
		this.irum = irum;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getIrum() {
		return irum;
	}

	public void setIrum(String irum) {
		this.irum = irum;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(avg, eng, hakbun, irum, kor, mat, tot);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SungjukVO other = (SungjukVO) obj;
		return Double.doubleToLongBits(avg) == Double.doubleToLongBits(other.avg) && eng == other.eng
				&& Objects.equals(hakbun, other.hakbun) && Objects.equals(irum, other.irum) && kor == other.kor
				&& mat == other.mat && tot == other.tot;
	}

	@Override
	public String toString() {
		return "SungjukVO [hakbun=" + hakbun + ", irum=" + irum + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat
				+ ", tot=" + tot + ", avg=" + avg + "]";
	}
	
	

	
	
	
}
