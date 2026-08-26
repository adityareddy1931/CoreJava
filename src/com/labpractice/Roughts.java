package com.labpractice;

public class Roughts {
	int employeeId; // instance varible
	String employeName;
	static String employeCountry = "India"; // static varible
	static String employeCompany = "Hunger cop";

	static void fanBase() { // method1
		String fanName = "aditya"; // local varible
		System.out.println("fan name=" + fanName);
	}

	static void stadiumName() { // method2
		String StadiumName = "rcb home ground"; // local varible
		System.out.println("stadium name=" + StadiumName);
	}

	public static void main(String[] args) { // main method
		Roughts A = new Roughts(); // object creati0on
		A.employeeId = 1;
		A.employeName = "Aditya";
		System.out.println("ID of the employee = " + A.employeeId);
		System.out.println("Name of the empolye= " + A.employeName);
		fanBase();// calling method 1
		stadiumName();// calling method 2
		System.out.println("Name of the Country= " + employeCountry);
		System.out.println("Name of the Company= " + employeCompany);

	}
}
