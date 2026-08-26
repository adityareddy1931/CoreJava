package com.inheritance;

public class Student {    // main class
	private int studentId;
	private String studentName;                 //private variable creation
	private double fees;
	public void setstudentId(int studentId){
		this.studentId=studentId;               //setter method1 area
		
	}
	
	public int getstudentId() {
		return studentId;                      //getter method1 area
	}
	public void setstudentName(String studentName){
		this . studentName=studentName;                      //setter method2 area
		
	}
	
	public String getstudentName() {                          //getter method2 area
		return studentName;
	}
	public void setfees(double fees){                      //setter method3 area
		this .fees=fees;                         
		
	}
	
	public double getfees() {                            //getter method3 area
		return fees;
	}


}
