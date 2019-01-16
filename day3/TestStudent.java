package edu.hgu.java.day3;

public class TestStudent {

	public static void main(String[] args) {
		// 1. 배열생성...
		//Student[] stuArr = new Student[3];
		
		//2. 배열에 객체를 저장
		//stuArr[0] = new Student ("H_001", "손홍민", "컴공", 3 );
		//stuArr[1] = new Student ("H_002", "김연아", "경영", 4 );
		//stuArr[2] = new Student ("H_003", "하정우", "미디어", 3 );
		
		Student[] stuArr = {new Student("H_001", "손홍민", "컴공", 3 ),
				new Student ("H_002", "김연아", "경영", 4 ),
				new Student ("H_003", "하정우", "미디어", 3 )
			};
			
		//3. 배열에 저장된 객체를 하나씩 꺼내면서 정보를 출력하기
		for(int i =0; i<stuArr.length; i++) 
			stuArr[i].showStudentInfo();
	
		
		for(int i =0; i<stuArr.length; i++)
			stuArr[i].setGrade(1);
		
		System.out.println("------변경된 정보--------");
		
		for(int i =0; i<stuArr.length; i++)
			stuArr[i].showStudentInfo();
			
	}
}
