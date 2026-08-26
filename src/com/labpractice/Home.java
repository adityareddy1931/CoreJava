package com.labpractice;

public class Home {
	int employeeId;        												//instance varible
	String employeName;
	static String employeCountry = "India"; 										 //static varible
	static String employeCompany = "Hunger cop";
void fanBase() {                                      							//method1
	String fanName="aditya";                                    //local varible
	System.out.println("fan name="+fanName);
}
void stadiumName() { //method2
	 String StadiumName="rcb home ground";                    //local varible
	 System.out.println("stadium name="+StadiumName);
}
	public static void main(String[] args) {              //main method
		Home A = new Home();								//object creati0on
		A.employeeId = 1;
		A.employeName = "Aditya";
		A.fanBase();
		A.stadiumName();
		System.out.println("********************OBJECT01*******************");
		
		System.out.println("ID of the employee = " + A.employeeId);
		System.out.println("Name of the empolye= " + A.employeName);
		System.out.println("Name of the Country= " + employeCountry);
		System.out.println("Name of the Company= " + employeCompany);
		System.out.println("*****************OBJECT02**********************");

		Home B = new Home();
		B.employeeId = 2;
		B.employeName = "harsha";
		System.out.println("Name of the country=" + employeCountry);
		System.out.println("Name of the Company= " + employeCompany);
		System.out.println("ID of the employee = " + B.employeeId);
		System.out.println("Name of the empolye= " + B.employeName);
		System.out.println("*******************OBJECT03********************");
		Home C = new Home();
		C.employeeId = 2;
		C.employeCompany = "Tunder";
		employeCountry = "Bharath";
		employeCompany = "Hunger cop";
		System.out.println("Name of the country=" + employeCountry);
		System.out.println( "Name of the Company= " + employeCompany);
		System.out.println("ID of the employee = " + C.employeeId);
		System.out.println("Name of the empolye= " + C.employeName);
		System.out.println("***********************************************");
		

	}

}
