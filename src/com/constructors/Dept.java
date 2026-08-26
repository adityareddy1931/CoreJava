package com.constructors;
//constructor is to inistilize the values to the object ,and its instance data we need constructors
//constructor is the special method ,but not a method .

public class Dept {
	int deptId;
	String deptName;
	Dept(){                           //no arg constructor
		deptId=101;      
		deptName="reddy";
	}
	Dept(int deptId,String deptName){   //parametrized constructor
		System.out.println("hi");
		this.deptId=deptId;
		this.deptName=deptName;
		
	}
	
	
    public static void main(String[] args) {
		System.out.println("main method started ");
        Dept obj=new Dept(101,"adityA");
        System.out.println(obj.deptId);
        System.out.println(obj.deptName);
	}

}
