package com.inheritance;

public class Teststudent {

	public static void main(String[] args) {
		Student obj=new Student();
		//calling the object using the setter method due to we can't call 
		// the private varible directly in the accesing object 
		obj.setstudentId(18);
		obj.setstudentName("aditya");             
		obj.setfees(27000);
		System.out.println(obj.getstudentId());
		System.out.println(obj.getstudentName());
		System.out.println(obj.getfees());

	}

}
