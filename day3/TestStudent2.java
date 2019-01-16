package edu.hgu.java.day3;
import java.util.Scanner;

public class TestStudent2 {

	public static void main(String[] args) {
		//학생 관리 프로그램 구현...
		//프로그램의 메뉴 :p
		//1: 학생정보추가, 2:학생전체정보조회, 3: 특정학생정보조회, 4:프로그램종료
		Student[] stuArr = new Student[5];
		System.out.println("===== 학생정보 관리프로그램 =====");
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		
		while(true) {
			System.out.println("메뉴를 선택하세요...");
			System.out.println("1: 학생정보추가, 2:학생전체정보조회, 3: 특정학생정보조회, 4:프로그램종료");
			int menu = sc.nextInt();
			
			if(menu==1) {
				System.out.println("< 학생정보추가 >");	
				System.out.println("학번, 이름, 전공, 학년을 입력하세요");	
				String id = sc.next();
				String name = sc.next();
				String major = sc.next();
				int grade = sc.nextInt();
				
				System.out.println(id+","+name+","+major+","+ grade);
				
				if(idx<stuArr.length) {
				stuArr[idx] = new Student(id, name, major, grade);
				idx++;
				System.out.println("Upload Completed, 정보 저장 완료\n");
				}else {
					System.out.println("There is no more space in Array. 배열에 더 이상 저장을 할 수 없습니다\n");
				}
				
				
			
			}else if(menu == 2) {
				System.out.println("< 학생전체정보조회 >");
				for(int i=0; i<idx; i++) {
					stuArr[i].showStudentInfo();
				
				}
			}else if(menu ==3) {
				System.out.println("< 특정학생정보조회 >");
				System.out.println("아이디를 입력하세요");	
				String id = sc.next();
				boolean flag = false;
				for(int i=0; i<idx; i++) {
					if(id.equals(stuArr[i].getId())) {
						stuArr[i].showStudentInfo();
						flag = true;
						break;
					}
				}
				if(flag == false)
					System.out.println(id + "는 존재하지 않습니다...");
				
			}else if(menu ==4) {
				System.out.println("< 프로그램 종료 >");
				System.exit(0);
			}else {
				System.out.println("입력된 숫자가 " +menu + "입니다 " + "\n 다른 번호를 선택하세요. ");
			}
		}
	}
}
