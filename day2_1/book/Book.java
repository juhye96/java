package edu.hgu.java.day2.book;

public class Book {

	//변수 선언 :isbn, title, author, company
	String isbn;
	String title;
	String author;
	String company;
	
public Book (String isbn, String title, String author,  String company) {
		
		//mId = mId; -> using "this"
		this.isbn = isbn ;
		this.title = title;
		this.author = author;
		this.company = company;
	}
	//함수(method) : 행위

	public void showBookInfo() {
		System.out.println("책번호 : " + isbn + ", 이름 : " + title+", 작가 : " + author + ", 출판사 : " + company);
	}
}
