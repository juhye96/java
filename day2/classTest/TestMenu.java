package edu.hgu.java.day2.classTest;

public class TestMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu1 = new Menu();
		menu1.mId = "F_001";
		menu1.mName = "소고기덮밥";
		menu1.price = 6000;
		menu1.source = "한식";
		menu1.showMenuInfo();
		
		Menu menu2 = new Menu();
		menu1.mId = "F_002";
		menu1.mName = "짜장면";
		menu1.price = 4000;
		menu1.source = "중식";
		menu1.showMenuInfo();
		
	}

}
