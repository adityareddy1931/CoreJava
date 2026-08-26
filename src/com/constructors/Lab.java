package com.constructors;

public class Lab {
	Lab() {
		System.out.println("hii");
	}
	public static void main(String[] args) {
	}
	}


class Lab2 extends Lab {
	Lab2() {
		this(10);
		System.out.println("child class");
	}

	Lab2(int x) {
		super();
		System.out.println("child");
	}

	public static void main(String[] args) {
		Lab2 A = new Lab2();

	}
}
