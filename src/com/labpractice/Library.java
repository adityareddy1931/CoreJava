package com.labpractice;

public class Library {
	static  String libName="v cube";
	static String  libanName="srikant";
	int bookId;
	String bookName;
	String authorName;
	int availbleCopys;
	
	static void displaylibDitals() {
		System.out.println(libName);
		System.out.println(libanName);
	}
	void displayBooksDetals() {
		System.out.println(bookId);
		System.out.println(bookName);
		System.out.println(authorName);
		System.out.println(availbleCopys);
		
	}
	void issuedBooks() {
		availbleCopys--;
		displayBooksDetals();
		displaychangedLibian();
		
	}
	static void displaychangedLibian() {
		libanName="aditya";
	}
	public static void main(String[] args) {
		displaylibDitals();
		Library A=new Library();
		 A.bookId=101;
		A. bookName="ROCK";
		A.authorName="ADITYA";
		A. availbleCopys=5;
		A.issuedBooks();
		Library B=new Library();
		B.bookId=102;
		B. bookName="RED";
		B.authorName="REDDY";
		B. availbleCopys=4;
		B.issuedBooks();
		

	}

}
