package edu.hgu.java.day2;

public class TestArrayCopy {

	public static void main(String[] args) {
		// 
		int[] intA1 = {1,2,3,4,5};
		int[] intA2 = {100, 200, 300, 400, 500};
		
		int[] intA3 = new int[intA1.length*2];
		System.arraycopy(intA1, 0, intA3, 0, intA1.length);
		//1번째 배열에 2번째 순서부터 하여 3번째 배열에 4번째 순서부터 5번째 길이까지 복사
		System.arraycopy(intA2, 0, intA3, intA1.length, intA2.length);
		
		for (int i =0; i<intA3.length; i++) {
			System.out.println(intA3[i]);
		}

	}

}
