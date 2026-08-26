package com.constructors;

public class Emps {
	  String empName;
	  double sal;
	  String companyName;
	  Emps(String empName,double sal,String companyName){
		  
		  this.empName=empName;
		  this.sal=sal;
		  this.companyName=companyName;
	  }

	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		Emps A=new Emps("Aditya Reddy",1000000,"Microsoft");
		A.display();
		System.out.println("--------------------------------------");
		
	}
	void display() {
		System.out.println("Name of employe="+empName);
		System.out.println("Name of employe="+sal);
		System.out.println("Name of employe="+companyName);
	}

}
