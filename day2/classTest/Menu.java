package edu.hgu.java.day2.classTest;

//파일명과 class명은 같아야 한다.
//접근제한자, 사용제한자, class class명{}
//abstract, static, final ...
public class Menu {

	//멤버(속성)
	String mId;
	String mName;
	int price;
	String source;
	
	//생성자 (초기화 작업)
	
	//함수(method) : 행위
	public void showMenuInfo() {
		System.out.println("이름 : "+mName+", 가격 : "+price);
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return 0;
	}
}
