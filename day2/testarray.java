package edu.hgu.java.day2;
import java.util.Scanner;
	
public class testarray {


	
	public static void main(String[] args) {
		//특정 금액을 키보드로부터 입력 받는다.
		//3660 : 500*7, 100*1, 50*1, 10*1
		//500원 동전 7개
		//100원 동전 1개
		//50원 동전 1개
		//10원 동전 1개
		//교환할 금액은 scanner로 입력받기...
		//coinUnit = {500, 100, 50, 10}
		int[] coinUnits = {500, 100, 50, 10};
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("동전으로 교환할 금액을 입력하세요");
		int money = input.nextInt();
		System.out.println("입력된 금액은" + money +" 입니다..");
		
		for (int i = 0; i<coinUnits.length; i++) {
			
			count = money / coinUnits[i];
			money = money % coinUnits[i];
			System.out.println(coinUnits[i]+"원"+count+"개");
		}
	}
}
