package com.cg.collections2;

public class Student {
private int rollNo;
private String studName;
private String Course;
public Student(int rollNo, String studName, String course) {
	super();
	this.rollNo = rollNo;
	this.studName = studName;
	Course = course;
}


@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", studName=" + studName + ", Course=" + Course + "]";
}


public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}
public int hashCode() {
	System.out.println("****hashCode called....");
	return rollNo;
}
public boolean equals(Object obj) {
	System.out.println("equals called****");
	Student s=(Student)obj;
	if(s.rollNo==this.rollNo && s.studName.equals(this.studName)&& s.Course.equals(this.Course))
		return true;
	else
		return false;
}
	

}
