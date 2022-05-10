package com.cg.collections2;

public class MarkSheet {
	float eng;
	float science;
	float math;
	public MarkSheet(float eng, float science, float math) {
		super();
		this.eng = eng;
		this.science = science;
		this.math = math;
	}
	
	
	@Override
	public String toString() {
		return "MarkSheet [eng=" + eng + ", science=" + science + ", math=" + math + "]";
	}


	public float getEng() {
		return eng;
	}
	public void setEng(float eng) {
		this.eng = eng;
	}
	public float getScience() {
		return science;
	}
	public void setScience(float science) {
		this.science = science;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}

}
