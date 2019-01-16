package edu.hgu.java.day3.school;

import java.util.Scanner;

import edu.hgu.java.day3.school.ctrl.StudentMgr;
import edu.hgu.java.day3.school.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		//학생 관리 프로그램 구현...
				//프로그램의 메뉴 :p
				//1: 학생정보추가, 2:학생전체정보조회, 3: 특정학생정보조회, 4:프로그램종료
				
				System.out.println("===== 학생정보 관리프로그램 =====");
				StudentMgr stuMgr = new StudentMgr();
				Scanner sc = new Scanner(System.in);
				int idx = 0;
				
				while(true) {
					System.out.println("메뉴를 선택하세요...");
					System.out.println("1: 학생정보추가, 2:학생전체정보조회, 3: 특정학생정보조회, 4:프로그램종료");
					int menu = sc.nextInt();
					
					if(menu==1) {
						
						System.out.println("학번, 이름, 전공, 학년을 입력하세요");	
						String id = sc.next();
						String name = sc.next();
						String major = sc.next();
						int grade = sc.nextInt();
						
						stuMgr.addStudent(new Student(id, name, major, grade));
						
					}else if(menu == 2) {
						Student[] result = stuMgr.getAllStudents();
						for (int i =0; i<result.length; i++) {
							if(result[i]!=null)
								//result[i].showStudentInfo();
								//System.out.println(result[i].toString());
								System.out.println(result[i]);
						}
						
					}else if(menu ==3) {
						
					}else if(menu ==4) {
						System.out.println("< 프로그램 종료 >");
						System.exit(0);
					}else {
						System.out.println("입력된 숫자가 " +menu + "입니다 " + "\n 다른 번호를 선택하세요. ");
					}
				}
	}
	

}
