package com.operator;
public class Emp{
	String EmpName;
	double sal;
	boolean blocked;
	boolean DoorPower;
	Emp (String EmpName,double sal,boolean DoorPower,boolean blocked) {
		this.EmpName=EmpName;
		this.sal=sal;
		this.blocked=blocked;
		this.DoorPower=DoorPower;
		
		
	}
	boolean CheckAccess() {
		return blocked&&DoorPower;
		
	}
	public static void main(String [] args) {
		Emp A=new Emp("Ratnakar",20000.00,true,false);
		A.display();
		A.CheckAccess();
		
	}
	void display() {
		System.out.println("The name of the Emp:"+EmpName);
		System.out.println("The salary of the Emp:"+sal);
		System.out.println("The DoorPower of the Emp:"+DoorPower);
		System.out.println("The bolocked Status of the Emp:"+CheckAccess());
		
	
		
		
	}
	
	
}