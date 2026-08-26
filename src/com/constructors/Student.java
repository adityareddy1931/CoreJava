package com.constructors;

public class Student {
	//parameterrized constructor
    int studid;
    String Name;
    String Location;
    String domain;
    Student(int studid,String name,String location,String domain){
    	this.domain=domain;
    	this.Location=location;
    	this.Name=name;
    	this.studid=studid;
    }
    void display() {
    	System.out.println("_______________________________");
    	System.out.println(Name);
    	System.out.println(studid);
    	System.out.println(domain);
    	System.out.println(Location);
    	System.out.println("_______________________________");
    }
	public static void main(String[] args) {
		Student A=new Student(101,"aditya","kakinada","java");
		Student B=new Student(102,"ratnakar","badharachalam","java");
        A.display();
        B.display();
	}

}
