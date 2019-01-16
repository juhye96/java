package edu.hgu.java.day3.school.ctrl;

import java.util.Scanner;

import edu.hgu.java.day3.school.model.Student;

public class StudentMgr {
	//C,R,U,D 기능 구현...
	
	//1.데이터를 저장할 배열을 선언한다... 크기는 3
	Student[] stuArr = new Student[5];
	
	int idx = 0;
	
	//2.데이터를 저장하는 기능...
	public void addStudent(Student s) {
		
		//배열에 데이터를 저장하는데 배열의 크기를 넘어서 저장하면
		//새로 배열을 만들어서 저장한다. 
		//새로 만드는 배열의 크기는 기존 크기의 *2
		
		if(idx >= stuArr.length) {
			//배열 두배로 늘리기
			Student[] tempS = stuArr;
			stuArr =new Student[tempS.length*2];
			System.arraycopy(tempS, 0, stuArr, 0, tempS.length);
			System.out.println("배열 크기가 증가됨: "+stuArr.length);
		}
		
		stuArr[idx] = s;
		idx++;
		
	}
	
	public Student[] getAllStudents() {
		
		return stuArr;
	}
	
	//배열의 저장된 전체 정보 출력...(test용) 
	public void showAllInfo() {
		for(int i=0; i<idx;i++) {
			stuArr[i].showStudentInfo();
		}
	}
	//3. 
}
