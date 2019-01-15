package edu.hgu.java.day2;

public class TestArray4 {

	public static void main(String[] args) {
		/*
			80, 90, 75, 60 305
			66, 50, 97, 75  -
			88, 45, 80, 68  -
			72, 69, 85, 99  -
			326 -   -   -   -
		 */
		//주어진 데이터를 이용하여 2차원 배열을 만든다.
		//가로 세로 합을 나타내는 배열을 만들어 결과 출
		int[][] resultArr = {{80, 90, 75, 60}, 
						{66, 50, 97, 75},
						{88, 45, 80, 68},
						{72, 69, 85, 99}};
		 
		int[][] scoreArr = 
				new int [resultArr.length+1][resultArr[0].length+1] ; 
		//[5][5]로 주기보다는 빈 공간으로 줌으로 바뀔 가능성도 고려하
		
		for (int i=0; i<resultArr.length; i++) {
			for (int j=0; j<resultArr[i].length; j++) {
				
				scoreArr [i][j] = resultArr [i][j];
				//행의 합 
				scoreArr[i][resultArr[0].length] += scoreArr [i][j];
				//열의 합  
				scoreArr[resultArr.length][j] += scoreArr[i][j];
				//전체 총합  
				scoreArr[resultArr.length][resultArr[0].length] += scoreArr[i][j];
				
			}
		}
		
		for (int i = 0; i<scoreArr.length; i++) {
			for (int j = 0; j<scoreArr[i].length; j++) {
				System.out.print(scoreArr[i][j] + "\t");
			}
		System.out.println();
		}
		
		
	}
}

	


