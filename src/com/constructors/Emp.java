package com.constructors;
//no arg constructor
public class Emp {
	
     int empId;
     String empName;
     String empDept;
     double empSal;
     Emp(){
    	 System.out.println("no arg");
    	 empId=100;
         empName="aditya";
         empDept="devloper";
         empSal=1200000;
     }
     
	public static void main(String[] args) {
		Emp B=new Emp();
		B.display();
		B.display();
		
	}
	void display() {
		System.out.println("*******************");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empDept);
		System.out.println(empSal);
		
	}
	
}

