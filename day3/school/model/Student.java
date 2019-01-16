package edu.hgu.java.day3.school.model;

// import java.lang.*;

public class Student {
	
	//변수 선언
	private String id;
	private String name;
	private String major;
	private int grade;
	
	//생성자

	public Student(String id, String name, String major, int grade) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.grade = grade;
	}
	
	//함수 
	public void showStudentInfo() {
		System.out.println(toString());
	}
	
	public String toString() {
		String info = id + " : " + name + " : " + major + " : " + grade ;
		return info;
	}
	
	//setter(설정)
	public void setId(String id) {
		if(checkData(id)) {
			this.id = id;
		}	
	}
	public String getId() {
		return this.id;
	}
	
	public void setName(String name) {
		if(checkData(name)) {
			this.name = name;
		}	
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setMajor(String major) {
		if(checkData(major)) {
			this.major = major;
		}	
	}
	public String getMajor() {
		return this.major;
	}
	
	public void setGrade(int grade) {
		if(grade > 0 || grade <= 4) {
			this.grade = grade;
		}	
	}
	public int getGrade() {
		return this.grade;
	}
	
	//유효성을 검증하는 코드...
	private boolean checkData(String data) {
		if(data!=null || data.equals("")) {
			return false;
		}
		return true;
	}
}
