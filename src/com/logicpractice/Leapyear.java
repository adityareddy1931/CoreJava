package com.logicpractice;

public class Leapyear {
	int year;

	void CheckLeapyear() {
		if (((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0)) {
			System.out.println("leap");
		} else {
			System.out.println("not leap");
		}

	}

	public static void main(String[] args) {
		Leapyear A = new Leapyear();
		A.year = 2024;
		Leapyear B = new Leapyear();
		B.year = 2028;
		Leapyear C = new Leapyear();
		C.year = 2037;
		A.CheckLeapyear();
		B.CheckLeapyear();
		C.CheckLeapyear();
	}

}
